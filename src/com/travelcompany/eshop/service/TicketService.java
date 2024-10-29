package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.List;

public interface TicketService {


    double getPaymentAmount(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod);

    List<Ticket> getAllTickets();

    void purchaseTicket(Ticket ticket);

    Ticket getTicketById(long id);

    List<Ticket> getTicketByCustomer(long id);


    PaymentMethod getPaymentMethod(Customer customer, Ticket ticket);

    public void printTicketsByCustomer(Long customerId, TicketService ticketService, CustomerService customerService);

    public void printTicketsById(Long ticketId, TicketService ticketService, CustomerService customerService);

}
