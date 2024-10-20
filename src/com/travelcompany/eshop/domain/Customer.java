package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public class Customer {

    private Long id ;
    private String customerName;
    private String email;
    private String address;
    private Nationality nationality;
    private Category category;


    public Customer (Long id, String customerName, String email, String address, Nationality nationality, Category category){
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
        this.category = category;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
