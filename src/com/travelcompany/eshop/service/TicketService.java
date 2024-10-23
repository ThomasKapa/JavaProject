package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.List;

public interface TicketService {


    double getPaymentAmount(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod);

    List<Ticket> getAllTickets();

    void addTicket (Ticket ticket);

    Ticket getTicketById(long id);
}
