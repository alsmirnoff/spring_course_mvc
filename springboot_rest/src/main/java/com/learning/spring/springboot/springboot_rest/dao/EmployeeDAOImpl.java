package com.learning.spring.springboot.springboot_rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.spring.springboot.springboot_rest.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        Employee emp = session.merge(employee);
        return emp;
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
       Session session = entityManager.unwrap(Session.class);
       MutationQuery query = session.createMutationQuery("delete from Employee where id = :employeeId");
       query.setParameter("employeeId", id);
       query.executeUpdate();
    }

}
