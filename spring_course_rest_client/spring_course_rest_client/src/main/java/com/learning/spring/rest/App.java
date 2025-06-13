package com.learning.spring.rest;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.rest.configuration.MyConfig;
import com.learning.spring.rest.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        
        // List<Employee> allEmployees = communication.getAllEmployees();
        // System.out.println(allEmployees);

        // Employee empById = communication.getEmployee(1);
        // System.out.println(empById);

        // Employee emp = new Employee("Alex", "Testov", "IT", 1200);
        // emp.setId(22);
        // communication.saveEmployee(emp);

        communication.deleteEmployee(22);
    }
}
