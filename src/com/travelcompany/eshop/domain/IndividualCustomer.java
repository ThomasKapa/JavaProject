package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;

public class IndividualCustomer extends Customer{

    Category category = Category.INDIVIDUAL;

    public IndividualCustomer (Long id, String customerName, String email, String address, Nationality nationality, Category category){
        super(id,customerName,email,address,nationality);

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + "IndividualCustomer{" +
                "category=" + category +
                '}';
    }
}
