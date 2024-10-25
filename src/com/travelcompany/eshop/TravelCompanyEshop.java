package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.service.*;
import com.travelcompany.eshop.enumeration.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TravelCompanyEshop {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketServiceImpl ticketService = new TicketServiceImpl();

        //customers added
        customerService.addCustomer(new BusinessCustomer(1L, "Karavasilis Thomas", "xtkaravas@ote.gr", "Kifisias 99", Nationality.GREEK));
        customerService.addCustomer(new IndividualCustomer(2L, "Vazakopoulos Michalis", "mvazakopoulos@ote.gr", "Kifisias 91", Nationality.ICELANDIC));
        customerService.addCustomer(new IndividualCustomer(3L, "Vasiladioti Dora", "dvasiladiot@ote.gr", "Kifisias 87", Nationality.MADAGASCAN));
        customerService.addCustomer(new BusinessCustomer(4L, "Zachos Dimitris", "dzachos@ote.gr", "Kifisias 01", Nationality.UZBEK));
        customerService.addCustomer(new IndividualCustomer(5L, "Paschalis Dimitris", "dpaschalis@ote.gr", "Kifisias 36", Nationality.BULGARIAN));
        customerService.addCustomer(new BusinessCustomer(6L, "Plati Giota", "gplati@ote.gr", "Kifisias 56", Nationality.HUNGARIAN));
        customerService.addCustomer(new IndividualCustomer(7L, "Farantos Spiros", "sfarantos@ote.gr", "Kifisias 03", Nationality.TOGOLESE));
        List<Customer> customerList = customerService.getAllCustomers();

        //itinerary added

        itineraryService.addItinerary(new Itinerary(1L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 500));
        itineraryService.addItinerary(new Itinerary(2L, AirportCodes.FAG, AirportCodes.YAA, "04-06-2024)", Airlines.AEROFLOT, 350));
        itineraryService.addItinerary(new Itinerary(3L, AirportCodes.FAS, AirportCodes.YAM, "12-12-2024", Airlines.SUNEXPRESS, 650));
        itineraryService.addItinerary(new Itinerary(4L, AirportCodes.AAT, AirportCodes.AEB, "04-06-2024)", Airlines.AIR_FRANCE_KLM, 1000));
        itineraryService.addItinerary(new Itinerary(5L, AirportCodes.EMS, AirportCodes.DAU, "12-12-2024", Airlines.PEGASUS_AIRLINES, 230));
        itineraryService.addItinerary(new Itinerary(6L, AirportCodes.DGA, AirportCodes.CCD, "04-06-2024)", Airlines.VOLOTEA, 380));
        itineraryService.addItinerary(new Itinerary(7L, AirportCodes.DOI, AirportCodes.QFI, "12-12-2024", Airlines.SWISS_INTERNATIONAL_AIR_LINES, 150));
        itineraryService.addItinerary(new Itinerary(8L, AirportCodes.WDN, AirportCodes.DDR, "04-06-2024)", Airlines.AIR_EUROPA, 900));
        itineraryService.addItinerary(new Itinerary(9L, AirportCodes.ACM, AirportCodes.DAU, "12-12-2024", Airlines.AEROFLOT, 420));
        itineraryService.addItinerary(new Itinerary(10L, AirportCodes.XBE, AirportCodes.CBC, "04-06-2024)", Airlines.LOT_POLISH_AIRLINES, 666));
        itineraryService.addItinerary(new Itinerary(11L, AirportCodes.SAE, AirportCodes.XBE, "12-12-2024", Airlines.EASYJET, 784));
        itineraryService.addItinerary(new Itinerary(12L, AirportCodes.ZBF, AirportCodes.SBC, "04-06-2024)", Airlines.ITA_AIRWAYS, 322));
        itineraryService.addItinerary(new Itinerary(13L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 500));
        itineraryService.addItinerary(new Itinerary(14L, AirportCodes.ABP, AirportCodes.JAV, "04-06-2024)", Airlines.LUFTHANSA_GROUP, 3000));
        List<Itinerary> itineraryList = itineraryService.getAllItineraries();

        //Tickets purchased

        ticketService.purchaseTicket(new Ticket(1L, customerService.getCustomerById(1L), itineraryService.getItineraryById(1L), PaymentMethod.CASH));
        ticketService.purchaseTicket(new Ticket(2L, customerService.getCustomerById(3L), itineraryService.getItineraryById(3L), PaymentMethod.CREDIT_CARD));
        ticketService.purchaseTicket(new Ticket(3L, customerService.getCustomerById(1L), itineraryService.getItineraryById(5L), PaymentMethod.CREDIT_CARD));
        List<Ticket> ticketList = ticketService.getAllTickets();

        System.out.println();
        //prints all customers
        System.out.println("All available customers are shown below" + "\n");
        for (Customer customer : customerList)
            System.out.println(customer);

        System.out.println();


//        prints all itineraries
        System.out.println("All available itineraries are shown below" + "\n");
        for (Itinerary itinerary : itineraryList)
            System.out.println(itinerary);

        System.out.println();

        //prints all tickets
        System.out.println("Currently the booked tickets are :" + "\n");
        for (Ticket ticket : ticketList)
            System.out.println(ticket);


        System.out.println();

        System.out.println("Total number of customers is:" + customerService.getAllCustomers().size());
        System.out.println("Total number og itineraries is:" + itineraryService.getAllItineraries().size());
        System.out.println("Total number of tickets is:" + ticketService.getAllTickets().size());

        System.out.println();

        //prints ticket by id

        System.out.println("Ticket with id " + ticketService.getTicketById(1L).getId() + " is shown bellow:" + "\n");
        System.out.println(ticketService.getTicketById(1L));

        System.out.println();


        //prints tickets based on customer id

        List<Ticket> ticketByCustomer = ticketService.getTicketByCustomer(1L);
        System.out.println("Customer with id " + customerService.getCustomerById(1L).getId() + " has booked the tickets bellow:" + "\n" + customerService.getCustomerById(1L));


        //List of the total offered itineraries per destination airport
        System.out.println();
        System.out.println("List of the total offered itineraries per destination airport " + AirportCodes.DAU + " are:" + itineraryService.getItineraryByDestination(AirportCodes.DAU));

        //List of the total offered itineraries per departure airport
        System.out.println();
        System.out.println("List of the total offered itineraries per departure airport " + AirportCodes.VAI + " are:" + itineraryService.getItineraryByDeparture(AirportCodes.ABP));


        //List of the customers with the most tickets

        System.out.println();

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

        System.out.println();

        //Customer with the largest cost of purchase

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

        //List of the customers with the most tickets and with the largest cost of purchases

    }
}
