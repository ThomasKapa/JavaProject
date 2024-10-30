package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.enumeration.Airlines;
import com.travelcompany.eshop.enumeration.AirportCodes;
import com.travelcompany.eshop.enumeration.Nationality;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.ArrayList;

import java.util.List;

public class HandlerMain {

    //Creates all itineraries
    public void initializeItineraries(ItineraryService itineraryService) {

        itineraryService.addItinerary(new Itinerary(1L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 700));
        itineraryService.addItinerary(new Itinerary(2L, AirportCodes.FAG, AirportCodes.YAA, "04-06-2024", Airlines.AEROFLOT, 650));
        itineraryService.addItinerary(new Itinerary(3L, AirportCodes.FAS, AirportCodes.YAM, "12-12-2024", Airlines.SUNEXPRESS, 350));
        itineraryService.addItinerary(new Itinerary(4L, AirportCodes.AAT, AirportCodes.AEB, "04-06-2024", Airlines.AIR_FRANCE_KLM, 1000));
        itineraryService.addItinerary(new Itinerary(5L, AirportCodes.EMS, AirportCodes.DAU, "12-12-2024", Airlines.PEGASUS_AIRLINES, 230));
        itineraryService.addItinerary(new Itinerary(6L, AirportCodes.DGA, AirportCodes.CCD, "04-06-2024", Airlines.VOLOTEA, 380));
        itineraryService.addItinerary(new Itinerary(7L, AirportCodes.DOI, AirportCodes.QFI, "12-12-2024", Airlines.SWISS_INTERNATIONAL_AIR_LINES, 150));
        itineraryService.addItinerary(new Itinerary(8L, AirportCodes.WDN, AirportCodes.DDR, "04-06-2024", Airlines.AIR_EUROPA, 900));
        itineraryService.addItinerary(new Itinerary(9L, AirportCodes.ACM, AirportCodes.DAU, "12-12-2024", Airlines.AEROFLOT, 420));
        itineraryService.addItinerary(new Itinerary(10L, AirportCodes.XBE, AirportCodes.CBC, "04-06-2024", Airlines.LOT_POLISH_AIRLINES, 666));
        itineraryService.addItinerary(new Itinerary(11L, AirportCodes.SAE, AirportCodes.XBE, "12-12-2024", Airlines.EASYJET, 785));
        itineraryService.addItinerary(new Itinerary(12L, AirportCodes.ZBF, AirportCodes.SBC, "04-06-2024", Airlines.ITA_AIRWAYS, 322));
        itineraryService.addItinerary(new Itinerary(13L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 500));
        itineraryService.addItinerary(new Itinerary(14L, AirportCodes.ABP, AirportCodes.JAV, "04-06-2024", Airlines.LUFTHANSA_GROUP, 3010));
    }


    //Creates all customers with exception

        public void initializeCustomers (CustomerService customerService) {
            try {
                customerService.addCustomer(new BusinessCustomer(1L, "Karavasilis Thomas", "xtkaravas@ote.gr", "Kifisias 99", Nationality.GREEK));
                customerService.addCustomer(new IndividualCustomer(2L, "Vazakopoulos Michalis", "mvazakopoulos@ote.gr", "Kifisias 91", Nationality.ICELANDIC));
                customerService.addCustomer(new IndividualCustomer(3L, "Vasiladioti Dora", "dvasiladiot@ote.gr", "Kifisias 87", Nationality.MADAGASCAN));
                customerService.addCustomer(new BusinessCustomer(4L, "Zachos Dimitris", "dzachos@ote.gr", "Kifisias 01", Nationality.UZBEK));
                customerService.addCustomer(new IndividualCustomer(5L, "Paschalis Dimitris", "dpaschalis@ote.gr", "Kifisias 36", Nationality.BULGARIAN));
                customerService.addCustomer(new BusinessCustomer(6L, "Plati Giota", "gplati@ote.gr", "Kifisias 56", Nationality.HUNGARIAN));
                customerService.addCustomer(new IndividualCustomer(7L, "Farantos Spiros", "sfarantos@ote.gr", "Kifisias 03", Nationality.TOGOLESE));
                customerService.addCustomer(new IndividualCustomer(8L, "Vetis Ilias", "vetis@travelcompany.com", "Kassandrou 153", Nationality.TOGOLESE));

            } catch (RuntimeException e ){
                System.out.println("Could not register customer: " + e.getMessage());
            }
        }



    //creates all tickets with exception
    public void initializeTickets(TicketService ticketService, CustomerService customerService, ItineraryService itineraryService) {
        try {
        ticketService.purchaseTicket(new Ticket(1L, customerService.getCustomerById(1L), itineraryService.getItineraryById(1L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(2L, customerService.getCustomerById(3L), itineraryService.getItineraryById(2L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(3L, customerService.getCustomerById(1L), itineraryService.getItineraryById(3L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(4L, customerService.getCustomerById(2L), itineraryService.getItineraryById(4L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(5L, customerService.getCustomerById(5L), itineraryService.getItineraryById(5L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(6L, customerService.getCustomerById(6L), itineraryService.getItineraryById(6L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(7L, customerService.getCustomerById(7L), itineraryService.getItineraryById(7L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(8L, customerService.getCustomerById(1L), itineraryService.getItineraryById(8L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(9L, customerService.getCustomerById(3L), itineraryService.getItineraryById(9L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(10L, customerService.getCustomerById(5L), itineraryService.getItineraryById(10L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(11L, customerService.getCustomerById(3L), itineraryService.getItineraryById(5L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(12L, customerService.getCustomerById(3L), itineraryService.getItineraryById(11L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(13L, customerService.getCustomerById(1L), itineraryService.getItineraryById(12L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(14L, customerService.getCustomerById(2L), itineraryService.getItineraryById(13L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(15L, customerService.getCustomerById(7L), itineraryService.getItineraryById(14L), PaymentMethod.CREDIT_CARD));

        } catch (RuntimeException e ){
            System.out.println( e.getMessage());
        }
    }

    //Prints all lists of customers , itineraries and tickets
    public void printAll(List<Customer> customerList, List<Itinerary> itineraryList, List<Ticket> ticketList) {

        //Prints all customers
        System.out.println("All available customers are shown below" + "\n");
        for (Customer customer : customerList)
            System.out.println(customer);

        System.out.println();


        //Prints all itineraries
        System.out.println("All available itineraries are shown below" + "\n");
        for (Itinerary itinerary : itineraryList)
            System.out.println(itinerary);

        System.out.println();

        //Prints all tickets
        System.out.println("Currently the booked tickets are :" + "\n");
        for (Ticket ticket : ticketList)
            System.out.println(ticket);


    }

    //Prints how many tickets ,itineraries and customers there are in the system
    public void howManyOfAnything(TicketService ticketService, CustomerService customerService, ItineraryService itineraryService) {

        System.out.println("Total number of customers is : " + customerService.getAllCustomers().size());
        System.out.println("Total number of itineraries is : " + itineraryService.getAllItineraries().size());
        System.out.println("Total number of tickets is : " + ticketService.getAllTickets().size());

    }


    //Customer with most tickets
    public void customerWithMostTickets(List<Customer> customerList, List<Ticket> ticketList) {
        Customer customerWithMostTickets = null;
        int maxTickets = 0;

        for (Customer customer : customerList) {
            int tempTickets = 0;
            for (Ticket ticket : ticketList) {
                if (customer.getId() == ticket.getCustomer().getId()) {
                    tempTickets++;
                }
            }
            if (tempTickets > maxTickets) {
                maxTickets = tempTickets;
                customerWithMostTickets = customer;
            }
        }

        if (customerWithMostTickets != null) {
            System.out.println("Customer with the most tickets booked: " + customerWithMostTickets.getCustomerName());
            System.out.println("Number of tickets booked: " + maxTickets);
        } else {
            System.out.println("No customers found.");
        }
    }

    //Customer with the largest cost of purchase
    public void customerWithLargestPurchase(List<Customer> customerList, List<Ticket> ticketList) {
        Customer customerWithLargestPurchase = null;
        double maxAmount = 0;

        for (Customer customer : customerList) {
            double purchaseAmount = 0;
            for (Ticket ticket : ticketList) {
                if (customer.getId() == ticket.getCustomer().getId()) {
                    purchaseAmount += ticket.getPaymentAmount();
                }
            }
            if (purchaseAmount > maxAmount) {
                maxAmount = purchaseAmount;
                customerWithLargestPurchase = customer;
            }
        }


        if (customerWithLargestPurchase != null) {
            System.out.println("Customer with the largest cost of purchase is: " + customerWithLargestPurchase.getCustomerName());
            System.out.println("Total cost of purchases is: " + maxAmount);
        } else {
            System.out.println("No customers found.");
        }

    }

    //Prints number of tickets and total cost of all tickets booked
    public void numberOfTicketsAndCost(List<Customer> customerList, List<Ticket> ticketList) {

        List<Customer> outputTotals = new ArrayList<>(); //customers that have booked tickets

        for (Customer customer : customerList) {
            double totalAmountPayed = 0;
            int totalTicketsBooked = 0;
            for (Ticket ticket : ticketList) {
                if (customer.getId() == ticket.getCustomer().getId()) {
                    totalAmountPayed += ticket.getPaymentAmount();
                    totalTicketsBooked++;
                }
            }

            //  outputTotals.add(customer.getCustomerName(),totalTicketsBooked,totalAmountPayed);

            System.out.println(customer.getCustomerName() + " has booked " + totalTicketsBooked + " tickets and has paid " + totalAmountPayed + " € in total.");
        }

    }


}
