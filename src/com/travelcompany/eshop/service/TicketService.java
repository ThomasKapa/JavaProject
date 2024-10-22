package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.PaymentMethod;

public interface TicketService {


    double getPaymentAmount(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod);

    Ticket getTicketById(int id);
}
