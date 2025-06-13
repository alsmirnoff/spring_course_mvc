package com.learning.spring.rest.dao;

import java.util.List;

import com.learning.spring.rest.entity.Employee;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
