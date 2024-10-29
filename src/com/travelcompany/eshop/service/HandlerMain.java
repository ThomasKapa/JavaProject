package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.enumeration.Airlines;
import com.travelcompany.eshop.enumeration.AirportCodes;

import java.util.List;

public class HandlerMain {



        public void initializeItineraries (ItineraryService itineraryService);{
                itineraryService.addItinerary(new Itinerary(1L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 500));
                itineraryService.addItinerary(new Itinerary(2L, AirportCodes.FAG, AirportCodes.YAA, "04-06-2024)", Airlines.AEROFLOT, 350));
                itineraryService.addItinerary(new Itinerary(3L, AirportCodes.FAS, AirportCodes.YAM, "12-12-2024", Airlines.SUNEXPRESS, 650));
                itineraryService.addItinerary(new Itinerary(4L, AirportCodes.AAT, AirportCodes.AEB, "04-06-2024)", Airlines.AIR_FRANCE_KLM, 1000));
                itineraryService.addItinerary(new Itinerary(5L, AirportCodes.EMS, AirportCodes.DAU, "12-12-2024", Airlines.PEGASUS_AIRLINES, 230));
                itineraryService.addItinerary(new Itinerary(6L, AirportCodes.DGA, AirportCodes.CCD, "04-06-2024)", Airlines.VOLOTEA, 380));
                itineraryService.addItinerary(new Itinerary(7L, AirportCodes.DOI, AirportCodes.QFI, "12-12-2024", Airlines.SWISS_INTERNATIONAL_AIR_LINES, 150));
                itineraryService.addItinerary(new Itinerary(8L, AirportCodes.WDN, AirportCodes.DDR, "04-06-2024)", Airlines.AIR_EUROPA, 900));
                itineraryService.addItinerary(new Itinerary(9L, AirportCodes.ACM, AirportCodes.DAU, "12-12-2024", Airlines.AEROFLOT, 420));
                itineraryService.addItinerary(new Itinerary(10L, AirportCodes.XBE, AirportCodes.CBC, "04-06-2024)", Airlines.LOT_POLISH_AIRLINES, 666));
                itineraryService.addItinerary(new Itinerary(11L, AirportCodes.SAE, AirportCodes.XBE, "12-12-2024", Airlines.EASYJET, 784));
                itineraryService.addItinerary(new Itinerary(12L, AirportCodes.ZBF, AirportCodes.SBC, "04-06-2024)", Airlines.ITA_AIRWAYS, 322));
                itineraryService.addItinerary(new Itinerary(13L, AirportCodes.VAI, AirportCodes.BAJ, "12-12-2024", Airlines.AEGEAN_AIRLINES, 500));
                itineraryService.addItinerary(new Itinerary(14L, AirportCodes.ABP, AirportCodes.JAV, "04-06-2024)", Airlines.LUFTHANSA_GROUP, 3000));
                List<Itinerary> itineraryList = itineraryService.getAllItineraries();
        }
}
