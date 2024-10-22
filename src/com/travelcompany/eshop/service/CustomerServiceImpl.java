package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList = new ArrayList<Customer>();

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
