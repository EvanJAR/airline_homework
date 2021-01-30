import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        flight = new Flight(plane, "FR890", "AMS", "GLA", "15:35");
        passenger = new Passenger("Kate McCallister", 3);
    }

    @Test
    public void canGetPlane() {
        Assert.assertEquals(plane, flight.getPlane());
    }

    @Test
    public void getFlightNumber(){
        Assert.assertEquals("FR890", flight.getFlightNumber());
    }

    @Test
    public void getFlightDestination(){
        Assert.assertEquals("AMS", flight.getDestination());
    }

    @Test
    public void getFlightDepartureAirport(){
        Assert.assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void getFlightDepartureTime(){
        Assert.assertEquals("15:35", flight.getDepartureTime());
    }

    @Test
    public void listOfPassengersStartsEmpty(){
        Assert.assertEquals(0, flight.getPassengers());
    }

    @Test
    public void canBookPassenger_remainingSeats(){
        flight.bookPassenger(passenger);
        Assert.assertEquals(1, flight.getPassengers());
    }

    @Test
    public void doesntBookPassenger_noRemainingSeats(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        Assert.assertEquals(5, flight.getPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        Assert.assertEquals(2, flight.getAvailableSeats());
    }


}
