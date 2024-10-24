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

}
