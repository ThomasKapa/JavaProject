package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.PaymentMethod;

import com.travelcompany.eshop.service.TicketServiceImpl;

public class Ticket {

    private long id;

    private Customer customer;

    private Itinerary itinerary;

    private PaymentMethod paymentMethod;

    private double paymentAmount;


    public Ticket(long id, Customer customer, Itinerary itinerary, PaymentMethod paymentMethod) {
        this.id = id;
        this.customer = customer;
        this.itinerary = itinerary;
        this.paymentMethod = paymentMethod;
        TicketServiceImpl ticketService = new TicketServiceImpl();
        this.paymentAmount = ticketService.getPaymentAmount(customer, itinerary, paymentMethod);
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return (int) id;
    }
}

