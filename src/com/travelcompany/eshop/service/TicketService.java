package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.PaymentMethod;

public class TicketService {

    private Customer customer;
    private Itinerary itinerary;

    private static final double PERCENTAGE_10 = 0.10;
    private static final double PERCENTAGE_20 = 0.20;

//    public TicketService(Customer customer, Itinerary itinerary, Ticket ticket) {
//    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }


    public double getPaymentAmount(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod) {


        double finalPrice = itinerary.getPrice();

        if (customer.getCategory() == Category.BUSINESS) {
            finalPrice -= finalPrice * PERCENTAGE_10;  // 10% discount for business customers
        } else if (customer.getCategory() == Category.INDIVIDUAL) {
            finalPrice += finalPrice * PERCENTAGE_20;  // 20% surcharge for individual customers
        }

        // Apply payment method discount
        if (paymentMethod == PaymentMethod.CREDIT_CARD) {
            finalPrice -= finalPrice * PERCENTAGE_10;  // 10% discount for credit card payments
        }

        return finalPrice;
    }


    //το παραπάνω μπορώ και με switch μέθοδο


}