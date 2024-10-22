package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;

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
    public Itinerary getItineraryById(int id) {

        for( Itinerary itinerary : ItiniraryList){
            if(itinerary.getId() == id){
                return itinerary;
            }
        }
        return null;
    }
}
