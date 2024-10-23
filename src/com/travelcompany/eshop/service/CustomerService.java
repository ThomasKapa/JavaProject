package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void addCustomer(Customer customer);

    Customer getCustomerById(long id);
}
