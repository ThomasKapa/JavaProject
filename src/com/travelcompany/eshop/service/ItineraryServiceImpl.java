package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.AirportCodes;

import javax.print.attribute.standard.Destination;
import javax.swing.plaf.basic.BasicTreeUI;
import java.util.ArrayList;
import java.util.List;

public class ItineraryServiceImpl implements ItineraryService {

    private List<Itinerary> ItiniraryList = new ArrayList<Itinerary>();

    @Override
    public List<Itinerary> getAllItineraries() {
        return ItiniraryList;
    }

    @Override
    public void addItinerary(Itinerary itinerary) {
        ItiniraryList.add(itinerary);
    }

    @Override
    public Itinerary getItineraryById(long id) {

        for (Itinerary itinerary : ItiniraryList) {
            if (itinerary.getId() == id) {
                return itinerary;
            }
        }
        return null;
    }

    @Override
    public List<Itinerary> getItineraryByDestination(AirportCodes airportCodes) {
        List<Itinerary> destinationList = new ArrayList<Itinerary>();
        for (Itinerary itinerary : ItiniraryList) {
            if (itinerary.getDestinationAirport() == airportCodes) {
                destinationList.add(itinerary);
            }
        }
        return destinationList;
    }

    @Override
    public List<Itinerary> getItineraryByDeparture(AirportCodes airportCodes) {
        List<Itinerary> departureList = new ArrayList<Itinerary>();
        for (Itinerary itinerary : ItiniraryList) {
            if (itinerary.getDestinationAirport() == airportCodes) {
                departureList.add(itinerary);
            }
        }
        return departureList;
    }

}