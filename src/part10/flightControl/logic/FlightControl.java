package part10.flightControl.logic;

import java.util.Collection;
import part10.flightControl.domain.Flight;
import part10.flightControl.domain.Airplane;
import part10.flightControl.domain.Place;

import java.util.HashMap;
import java.util.Map;


public class FlightControl {
    private HashMap<String, Airplane> airPlanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;


    public FlightControl(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airPlanes.put(ID, plane);


    }

    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airPlanes.put(ID,plane);
    }


    public void addFlights(Airplane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }



    public Collection<Airplane> getAirPlanes() {
        return this.airPlanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airPlanes.get(ID);
    }


}
