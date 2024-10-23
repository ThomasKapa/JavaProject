package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.*;
import com.travelcompany.eshop.service.*;
import com.travelcompany.eshop.enumeration.*;

public class TravelCompanyEshop {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketService ticketService = new TicketServiceImpl();

        //customers added
       customerService.addCustomer(new BusinessCustomer(1L, "Karavasilis Thomas", "xtkaravas@ote.gr", "Kifisias 99", Nationality.GREEK));
        customerService.addCustomer(new IndividualCustomer(2L, "Vazakopoulos Michalis", "mvazakopoulos@ote.gr", "Kifisias 91", Nationality.ICELANDIC));
        customerService.addCustomer(new IndividualCustomer(3L, "Vasiladioti Dora", "dvasiladiot@ote.gr", "Kifisias 87", Nationality.MADAGASCAN));
        customerService.addCustomer(new BusinessCustomer(4L, "Zachos Dimitris", "dzachos@ote.gr", "Kifisias 01", Nationality.UZBEK));
        customerService.addCustomer(new IndividualCustomer(5L, "Paschalis Dimitris", "dpaschalis@ote.gr", "Kifisias 36", Nationality.BULGARIAN));
        customerService.addCustomer(new BusinessCustomer(6L, "Plati Giota", "gplati@ote.gr", "Kifisias 56", Nationality.HUNGARIAN));
        customerService.addCustomer(new IndividualCustomer(7L, "Farantos Spiros", "sfarantos@ote.gr", "Kifisias 03", Nationality.TOGOLESE));

        //itinerary added

        itineraryService.addItinerary(new Itinerary(1L,AirportCodes.VAI,AirportCodes.BAJ,"12-12-2024",Airlines.AEGEAN_AIRLINES,500));
        itineraryService.addItinerary(new Itinerary(2L,AirportCodes.FAG,AirportCodes.YAA,"04-06-2024)", Airlines.AEROFLOT,350));
        itineraryService.addItinerary(new Itinerary(3L,AirportCodes.FAS,AirportCodes.YAM,"12-12-2024",Airlines.SUNEXPRESS,650));
        itineraryService.addItinerary(new Itinerary(4L,AirportCodes.AAT,AirportCodes.AEB,"04-06-2024)", Airlines.AIR_FRANCE_KLM,1000));
        itineraryService.addItinerary(new Itinerary(5L,AirportCodes.EMS,AirportCodes.DAU,"12-12-2024",Airlines.PEGASUS_AIRLINES,230));
        itineraryService.addItinerary(new Itinerary(6L,AirportCodes.DGA,AirportCodes.CCD,"04-06-2024)", Airlines.VOLOTEA,380));
        itineraryService.addItinerary(new Itinerary(7L,AirportCodes.DOI,AirportCodes.QFI,"12-12-2024",Airlines.SWISS_INTERNATIONAL_AIR_LINES,150));
        itineraryService.addItinerary(new Itinerary(8L,AirportCodes.WDN,AirportCodes.DDR,"04-06-2024)", Airlines.AIR_EUROPA,900));
        itineraryService.addItinerary(new Itinerary(9L,AirportCodes.ACM,AirportCodes.DAU,"12-12-2024",Airlines.AEROFLOT,420));
        itineraryService.addItinerary(new Itinerary(10L,AirportCodes.XBE,AirportCodes.CBC,"04-06-2024)", Airlines.LOT_POLISH_AIRLINES,666));
        itineraryService.addItinerary(new Itinerary(11L,AirportCodes.SAE,AirportCodes.XBE,"12-12-2024",Airlines.EASYJET,784));
        itineraryService.addItinerary(new Itinerary(12L,AirportCodes.ZBF,AirportCodes.SBC,"04-06-2024)", Airlines.ITA_AIRWAYS,322));itineraryService.addItinerary(new Itinerary(1L,AirportCodes.VAI,AirportCodes.BAJ,"12-12-2024",Airlines.AEGEAN_AIRLINES,500));
        itineraryService.addItinerary(new Itinerary(13L,AirportCodes.ABP,AirportCodes.JAV,"04-06-2024)", Airlines.LUFTHANSA_GROUP,3000));





        //Tickets added

        ticketService.addTicket(new Ticket(1L, customerService.getCustomerById(1L),itineraryService.getItineraryById(1L),PaymentMethod.CASH ));
        ticketService.addTicket(new Ticket(2L, customerService.getCustomerById(1L),itineraryService.getItineraryById(1L),PaymentMethod.CREDIT_CARD ));

        //prints all customers
        for (Customer customer : customerService.getAllCustomers())
            System.out.println(customer);

        System.out.println();

        //prints all tickets
        for (Ticket ticket : ticketService.getAllTickets())
            System.out.println(ticket);

        System.out.println();

        System.out.println("Total number of customers is:" + customerService.getAllCustomers().size());
        System.out.println("Total number og itineraries is:" + itineraryService.getAllItineraries().size());
        System.out.println("Total number of tickets is:" + ticketService.getAllTickets().size());

        System.out.println();

        System.out.println(ticketService.getTicketById(1L));




    }

}
