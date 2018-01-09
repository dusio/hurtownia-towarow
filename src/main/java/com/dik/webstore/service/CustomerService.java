package com.dik.webstore.service;

import com.dik.webstore.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void addCustomer(Customer customer);
}
