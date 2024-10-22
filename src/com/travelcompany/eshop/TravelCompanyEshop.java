package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.BusinessCustomer;
import com.travelcompany.eshop.service.TicketServiceImpl;
import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.*;

public class TravelCompanyEshop {

    public static void main(String[] args) {


        Customer mich = new BusinessCustomer(1L, "Vazakopoulos Michail", "mvazakopoulos@gmail.com", "Greece", Nationality.GREEK);

        Itinerary tripone = new Itinerary(1L, mich, AirportCodes.VEV, AirportCodes.GEF, "31-12-2024", Airlines.AEGEAN_AIRLINES, 500);

        Ticket ticketMich = new Ticket(1,mich, tripone, PaymentMethod.CASH);

        TicketServiceImpl paymentAmount = new TicketServiceImpl();

        System.out.println(paymentAmount.getPaymentAmount(mich,tripone,PaymentMethod.CASH));

    }

}
