package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public class BusinesCustomer extends Customer{
    Category category = Category.BUSINESS;
    public BusinesCustomer (Long id, String customerName, String email, String address, Nationality nationality){
        super(id,customerName,email,address,nationality);

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
