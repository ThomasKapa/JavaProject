package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public class BusinessCustomer extends Customer {
    Category category = Category.BUSINESS;

    public BusinessCustomer(Long id, String customerName, String email, String address, Nationality nationality) {
        super(id, customerName, email, address, nationality);

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + "Busines Customer" ;
    }
}
