package com.learning.spring.springboot.spring_data_jpa.service;

import java.util.List;

import com.learning.spring.springboot.spring_data_jpa.entity.Employee;

public interface EmployeeService {
    
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);

}
