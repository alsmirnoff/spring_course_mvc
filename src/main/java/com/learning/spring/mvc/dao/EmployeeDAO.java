package com.learning.spring.mvc.dao;

import java.util.List;

import com.learning.spring.mvc.entity.Employee;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
