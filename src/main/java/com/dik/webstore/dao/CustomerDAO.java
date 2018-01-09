package com.dik.webstore.dao;

import com.dik.webstore.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void addCustomer(Customer customer);
}
