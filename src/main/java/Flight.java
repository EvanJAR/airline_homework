import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }


    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        int flightCapacity = PlaneType.BOEING747.getPlaneCapacity();
        int numOfPassengers = this.getPassengers();

        if (flightCapacity > numOfPassengers){
            passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        int flightCapacity = PlaneType.BOEING747.getPlaneCapacity();
        int numOfPassengers = this.getPassengers();
        return (flightCapacity - numOfPassengers);
    }
}
