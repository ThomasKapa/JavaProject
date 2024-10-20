package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.PaymentMethod;

import com.travelcompany.eshop.service.TicketService;

public class Ticket {

private Customer customer;

private Itinerary itinerary;

private PaymentMethod paymentMethod;

private double paymentAmount;

private double ticketPrice = getItinerary().getPrice();


public Ticket(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod){
    this.customer =customer;
    this.itinerary = itinerary;
    this.paymentMethod=paymentMethod;
    this.paymentAmount = TicketService.getPaymentAmount();
}

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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}

