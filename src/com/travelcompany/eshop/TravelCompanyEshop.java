package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.BusinessCustomer;
import com.travelcompany.eshop.service.TicketService;
import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.*;

public class TravelCompanyEshop {

    public static void main(String[] args) {


        Customer mich = new BusinessCustomer(1L, "Vazakopoulos Michail", "mvazakopoulos@gmail.com", "Greece", Nationality.GREEK);

        Itinerary brusselsAthens = new Itinerary(mich, AirportCodes.VEV, AirportCodes.GEF, "31-12-2024", Airlines.AEGEAN_AIRLINES, 500);

        Ticket ticketMich = new Ticket(mich, brusselsAthens, PaymentMethod.CASH);

        TicketService paymentAmount = new TicketService();

        System.out.println(paymentAmount.getPaymentAmount(mich,brusselsAthens,PaymentMethod.CASH));

    }

}
