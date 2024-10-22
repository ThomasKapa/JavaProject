package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;

import java.util.List;

public interface ItineraryService {

    List<Itinerary> getAllItineraries(); // βλέπω όλες τις διαδρομές

    void addItinerary(Itinerary itinerary);  //προσθέτω διαδρομή

    Itinerary getItineraryById(int id); //βλέπω ένα ψάχνοντας με id
}
