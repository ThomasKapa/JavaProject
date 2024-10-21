package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.PaymentMethod;

public class TicketService {

    private double pay = Itinerary.getPrice();

    private static final double PERCENTAGE_10 = 0.10;
    private static final double PERCENTAGE_20 = 0.20;


    public double getPaymentAmount(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod, double pay) {



        double finalPrice = pay;

        if (customer.getCategory() == Category.BUSINESS) {
            finalPrice -= pay * PERCENTAGE_10;  // 10% discount for business customers
        } else if (customer.getCategory() == Category.INDIVIDUAL) {
            finalPrice += pay * PERCENTAGE_20;  // 20% surcharge for individual customers
        }

        // Apply payment method discount
        if (paymentMethod == PaymentMethod.CREDIT_CARD) {
            finalPrice -= pay * PERCENTAGE_10;  // 10% discount for credit card payments
        }

        return finalPrice;
    }
}