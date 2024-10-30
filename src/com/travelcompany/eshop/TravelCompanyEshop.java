package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.service.*;
import com.travelcompany.eshop.enumeration.*;

import java.util.List;

public class TravelCompanyEshop {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketServiceImpl ticketService = new TicketServiceImpl();
        HandlerMain handlerMain = new HandlerMain();

        //customers added &exception handling
        handlerMain.initializeCustomers(customerService);
        //Creating list of all customers &exception handling
        List<Customer> customerList = customerService.getAllCustomers();

        //itineraries added  &exception handling
        handlerMain.initializeItineraries(itineraryService);
        //Creating list of all itineraries &exception handling
        List<Itinerary> itineraryList = itineraryService.getAllItineraries();

        //Tickets purchases &exception handling

        handlerMain.initializeTickets(ticketService, customerService, itineraryService);
        //Creating list of all itineraries &exception handling
        List<Ticket> ticketList = ticketService.getAllTickets();

        System.out.println();
        //Prints all lists of customers , itineraries and tickets
        handlerMain.printAll(customerList, itineraryList, ticketList);

        System.out.println();

        //Prints how many tickets/itineraries/customers there are
        handlerMain.howManyOfAnything(ticketService, customerService, itineraryService);

        System.out.println();

        //Prints ticket by ticketId
        ticketService.printTicketsById(5L, ticketService, customerService);

        System.out.println();

        //prints tickets based on customer id
        ticketService.printTicketsByCustomer(2L, ticketService, customerService);


        //List of the total offered itineraries per destination airport
        itineraryService.printItineraryPerDestination(itineraryService, AirportCodes.DAU);
        System.out.println();

        //List of the total offered itineraries per departure airport
        itineraryService.printItineraryPerDeparture(itineraryService, AirportCodes.VAI);
        System.out.println();

        //Customer with most tickets
        handlerMain.customerWithMostTickets(customerList, ticketList);
        System.out.println();

        //Customer with the largest cost of purchase
        handlerMain.customerWithLargestPurchase(customerList, ticketList);
        System.out.println();

        //total number of tickets and total cost per customer
        handlerMain.numberOfTicketsAndCost(customerList, ticketList);

        //List of the customers with the most tickets and with the largest cost of purchases


    }
}
