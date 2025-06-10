package com.learning.spring.mvc.service;

import java.util.List;

import com.learning.spring.mvc.entity.Employee;

public interface EmployeeService {
    
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
