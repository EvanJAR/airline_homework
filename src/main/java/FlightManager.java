public class FlightManager {

    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Flight flight){
        this.flight = flight;
        this.plane = plane;
    }

    public double totalWeightReservedForPassengers(Plane plane){
       int totalPlaneWeight = plane.getPlaneWeight();
       return (totalPlaneWeight / 2);
    }

    public double weightForEachPassenger(Plane plane) {
        int flightCapacity = plane.getPlaneCapacity();
        double weightForAllPassengers = totalWeightReservedForPassengers(plane);
        return (weightForAllPassengers / flightCapacity);
    }
}
