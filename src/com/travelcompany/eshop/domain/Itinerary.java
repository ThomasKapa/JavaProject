package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Airlines;
import com.travelcompany.eshop.enumeration.AirportCodes;

import java.util.Date;

public class Itinerary {

    private AirportCodes departureAirport;

    private AirportCodes destinationAirport;

    private Date departureDate;

    private Airlines airline;

    private double price;

    private Customer customer;

    public Itinerary(Customer customer,AirportCodes departureAirport, AirportCodes destinationAirport, Date departureDate, Airlines airline, double price) {
       this.customer = customer;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureDate = departureDate;
        this.airline = airline;
        this.price = price;
    }

    public AirportCodes getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(AirportCodes departureAirport) {
        this.departureAirport = departureAirport;
    }

    public AirportCodes getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(AirportCodes destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Airlines getAirline() {
        return airline;
    }

    public void setAirline(Airlines airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
