package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> accessToFlights = new HashMap<>();
        accessToFlights.put("Miejsce1", true);
        accessToFlights.put("Miejsce2", false);
        accessToFlights.put("Miejsce3", true);
        accessToFlights.put("Miejsce4", false);
        accessToFlights.put("Miejsce5", true);
        accessToFlights.put("Miejsce6", false);
        accessToFlights.put("Miejsce7", true);

        if(accessToFlights.get(flight.arrivalAirport) != null) {
            if (accessToFlights.get(flight.arrivalAirport) == true){
                System.out.println("Flight to " + flight.arrivalAirport + " is available.");
            } else {
                System.out.println("Sorry, flight to " + flight.arrivalAirport + " is not available.");
            }
        } else {
            throw new RouteNotFoundException("Sorry ");
        }
    }
}
