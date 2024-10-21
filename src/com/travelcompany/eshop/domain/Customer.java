package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public abstract class Customer {

    private Long id ;
    private String customerName;
    private String email;
    private String address;
    private Nationality nationality;




    public Customer(Long id, String customerName, String email, String address, Nationality nationality) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.nationality = nationality;

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


    public abstract getCategory() ;
}
