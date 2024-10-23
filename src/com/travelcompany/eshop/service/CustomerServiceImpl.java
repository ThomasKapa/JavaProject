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
    public Customer getCustomerById(long id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    //πρέπει να κάνω δική μου λίστα που να ξεκινά το id απο ένα μέχρι και αυτή τη λίστα να βάλω στο = new Arraylist<customer>();
    //να βάλω ενα κανόνα που θα δεν θα επιτρέπει τον ίδιο customer 2 φορές.
    // Set<Customer> customer = new Hashset<Customer>(); μια λίστα που επιτρέπει μια φορά να καταχωρηθεί το καθένα
    // το set δεν έχει τη δυνατότητα να σου φέρει τη θέση του κάθε πελάτη. Αλλά είναι πολύ γρήγορα στην αναζήτηση

}
