package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.Airlines;
import com.travelcompany.eshop.enumeration.AirportCodes;

import java.time.LocalDate;

public class Itinerary {

    private long id;
    private AirportCodes departureAirport;

    private AirportCodes destinationAirport;

    private String departureDate;

    private Airlines airline;

    private double price;

    private Customer customer;

    public Itinerary(long id, Customer customer, AirportCodes departureAirport, AirportCodes destinationAirport, String departureDate, Airlines airline, double price) {
        this.id = id;
        this.customer = customer;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureDate = departureDate;
        this.airline = airline;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = String.valueOf(departureDate);
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
