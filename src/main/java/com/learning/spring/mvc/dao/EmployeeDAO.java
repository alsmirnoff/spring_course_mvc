package com.learning.spring.mvc.dao;

import java.util.List;

import com.learning.spring.mvc.entity.Employee;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
