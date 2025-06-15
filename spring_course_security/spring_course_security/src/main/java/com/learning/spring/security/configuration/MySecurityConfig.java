package com.learning.spring.security.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    // @Bean
    // public UserDetailsService userDetailsService(){
    //     InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    //     manager.createUser(
    //         User.withDefaultPasswordEncoder()
    //             .username("user")
    //             .password("user")
    //             .roles("EMPLOYEE")
    //             .build()
    //     );
    //     manager.createUser(
    //         User.withDefaultPasswordEncoder()
    //             .username("sveta")
    //             .password("sveta")
    //             .roles("HR")
    //             .build()
    //     );
    //     manager.createUser(
    //         User.withDefaultPasswordEncoder()
    //             .username("ivan")
    //             .password("ivan")
    //             .roles("MANAGER", "HR")
    //             .build()
    //     );
    //     return manager;
    // }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(autorize -> autorize
                                    .requestMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                                    .requestMatchers("/hr_info").hasRole("HR")
                                    .requestMatchers("/manager_info").hasRole("MANAGER")
                                    .anyRequest().authenticated())
            .httpBasic(Customizer.withDefaults())
            .formLogin(Customizer.withDefaults());
        return http.build();
    }

}
