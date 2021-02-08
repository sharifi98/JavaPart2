package part10.flightControl.domain;

public class Flight {
    
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }


    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDepartureAirport() {
        return departureAirport;
    }

    public void setTargetAirport(Place targetAirport) {
        this.targetAirport = targetAirport;
    }


    public String toString() {
        return this.airplane.toString() + "(" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
