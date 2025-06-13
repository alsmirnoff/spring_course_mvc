package com.learning.spring.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.spring.rest.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();

        // List<Employee> allEmployees = session.createSelectionQuery("from Employee", Employee.class).getResultList();

        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        Employee emp = session.merge(employee);
        return emp;
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
       Session session = sessionFactory.getCurrentSession();
       MutationQuery query = session.createMutationQuery("delete from Employee where id = :employeeId");
       query.setParameter("employeeId", id);
       query.executeUpdate();
    }

}
