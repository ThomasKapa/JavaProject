package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;

import java.util.List;

public interface ItineraryService {

    List<Itinerary> getAllItineraries();

    void addItinerary(Itinerary itinerary);

    Itinerary getItineraryById(int id);
}
