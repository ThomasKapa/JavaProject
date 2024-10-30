package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.AirportCodes;


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

        if ( itinerary.getDestinationAirport()== null){
            throw new RuntimeException("Please check the Destination airport code: " + itinerary.getDestinationAirport());
        }
        if (  itinerary.getDepartureAirport()== null){
            throw new RuntimeException("Please check the Departure airport code: " + itinerary.getDepartureAirport());
        }

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
            if (itinerary.getDepartureAirport() == airportCodes) {
                departureList.add(itinerary);
            }
        }
        return departureList;
    }

    @Override
    public void printItineraryPerDestination(ItineraryService itineraryService, AirportCodes airportCodes) {
        List<Itinerary> itineraryPerDestination = itineraryService.getItineraryByDestination(airportCodes);
        System.out.println("List of the total offered itineraries per destination airport " + airportCodes + " are:" + itineraryService.getItineraryByDestination(airportCodes));

        for (Itinerary itinerary : itineraryPerDestination) {
            System.out.println(itinerary);
        }
        System.out.println();
    }

    //List of the total offered itineraries per departure airport
    public void printItineraryPerDeparture(ItineraryService itineraryService, AirportCodes airportCodes) {
        List<Itinerary> itineraryPerDeparture = itineraryService.getItineraryByDestination(airportCodes);
        System.out.println("List of the total offered itineraries per departure airport " + airportCodes + " are:" + itineraryService.getItineraryByDeparture(airportCodes));

        for (Itinerary itinerary : itineraryPerDeparture) {
            System.out.println(itinerary);
        }
        System.out.println();
    }



}