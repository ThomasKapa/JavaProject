package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class TicketServiceImpl implements TicketService {

    private Customer customer;
    private Itinerary itinerary;

    private List<Ticket> ticketList = new ArrayList<Ticket>();

    private static final double PERCENTAGE_10 = 0.10;
    private static final double PERCENTAGE_20 = 0.20;


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

    @Override
    public List<Ticket> getAllTickets() {
        return ticketList;
    }

    @Override
    public Ticket getTicketById(long id) {
        for (Ticket ticket : ticketList) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }


    public List<Ticket> getTicketByCustomer(long id) {
        List<Ticket> customerIdTickets = new ArrayList<Ticket>();
        for (Ticket ticket : ticketList) {
            if (ticket.getCustomer().getId() == id) {
                customerIdTickets.add(ticket);
            }
        }
        return customerIdTickets;
    }

    @Override
    public PaymentMethod getPaymentMethod(Customer customer, Ticket ticket) {
        if (getCustomer().getCategory() == Category.BUSINESS) {
            return PaymentMethod.CREDIT_CARD;

        } else {
            return PaymentMethod.CASH;
        }
    }

    public int getTicketCount() {
        return ticketList.size();
    }

    public void printTicketsByCustomer(Long customerId, TicketService ticketService, CustomerService customerService) {
        List<Ticket> ticketByCustomer = ticketService.getTicketByCustomer(customerId);
        System.out.println("Customer with ID " + customerId + " has booked the tickets below:\n");

        for (Ticket ticket : ticketByCustomer) {
            System.out.println(ticket);
        }
        System.out.println();
    }

    @Override
    public void printTicketsById(Long ticketId, TicketService ticketService, CustomerService customerService) {
        try {
            Ticket ticket = getTicketById(ticketId);

            System.out.println("Ticket with id " + ticketService.getTicketById(ticketId).getId() + " is shown bellow:");
            System.out.println(ticketService.getTicketById(ticketId));

        } catch (NullPointerException e) {
            System.out.println("No ticket found with id " + ticketId);
        }

    }

    private CustomerService customerService;

    public void TicketService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void purchaseTicket(Ticket ticket, List<Itinerary> itineraryList, List<Customer> customerList) {

        // Check if itinerary exists and is not null
        if (ticket.getItinerary() == null || !itineraryList.contains(ticket.getItinerary())) {
            System.out.println("Ticket " + ticket.getId() + " could not be issued because the itinerary does not exist.");
            return;
        //throw new RuntimeException("Ticket " + ticket.getId() + " could not be issued because the itinerary does not exist.");
        }
        // Check if customer exists and is not null
        if (ticket.getCustomer() == null || !customerList.contains(ticket.getCustomer())) {
            System.out.println("Ticket " + ticket.getId() + " could not be issued because the customer does not exist.");
            return;
        //throw new RuntimeException("Ticket " + ticket.getId() + " could not be issued because the customer does not exist.");

        }

        try {
            System.out.println("Itinerary Price: " + ticket.getItinerary().getPrice());

            ticketList.add(ticket);
            System.out.println("Ticket " + ticket.getId() + " purchased successfully by " + ticket.getCustomer().getCustomerName());
        } catch (NullPointerException e) {
            System.out.println("Error: Itinerary details are missing for ticket ID " + ticket.getId() + ". Ticket was not purchased.");
        }
    }

}

