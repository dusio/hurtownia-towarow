package com.dik.webstore.dao.impl;

import com.dik.webstore.dao.CustomerDAO;
import com.dik.webstore.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getCustomers() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

        return query.getResultList();

    }

    public void addCustomer(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.save(customer);
    }
}
