package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.enumeration.AirportCodes;

import java.util.List;

public interface ItineraryService {

    List<Itinerary> getAllItineraries(); // βλέπω όλες τις διαδρομές

    void addItinerary(Itinerary itinerary);  //προσθέτω διαδρομή

    Itinerary getItineraryById(long id); //βλέπω ένα ψάχνοντας με id

    List<Itinerary> getItineraryByDestination(AirportCodes airportCodes); // βλέπω όλες τις διαδρομές με βάση το destination airport code

    List<Itinerary> getItineraryByDeparture (AirportCodes airportCodes); // βλέπω όλες τις διαδρομές με βάση το departure airport code

    public void printItineraryPerDestination(ItineraryService itineraryService, AirportCodes airportCodes) ; ////List of the total offered itineraries per destination airport

    public void printItineraryPerDeparture(ItineraryService itineraryService, AirportCodes airportCodes); //List of the total offered itineraries per departure airport

}
