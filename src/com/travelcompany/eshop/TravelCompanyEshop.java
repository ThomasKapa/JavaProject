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
        customerService.addCustomer(new IndividualCustomer(2L, "Vazakopoulos Michalis", "mvazakopoulos@ote.gr", "Kifisias 99", Nationality.ICELANDIC));

        //itinerary added

        itineraryService.addItinerary(new Itinerary(1L, new BusinessCustomer(2L, "karavasilis Thomas", "xtkaravas@ote.gr", "Kifisias 99", Nationality.GREEK)
                , AirportCodes.AAD, AirportCodes.SAK, "31-12-2024", Airlines.AEGEAN_AIRLINES, 500));

        //Tickets added


        for (Customer customer : customerService.getAllCustomers())
            System.out.println(customer);

        System.out.println();
    }

}
