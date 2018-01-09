package com.dik.webstore.service.impl;

import com.dik.webstore.dao.CustomerDAO;
import com.dik.webstore.entity.Customer;
import com.dik.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Transactional
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }
}
