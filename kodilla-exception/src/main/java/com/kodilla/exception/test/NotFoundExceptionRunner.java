package com.kodilla.exception.test;

public class NotFoundExceptionRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("Miejsce1", "Miejsce");
        FlightSearch flightSearch = new FlightSearch();


        try {
            flightSearch.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Unfortunately, the airport does not exist on the map");
        }

        System.out.println("Processing other logic!");
    }
}