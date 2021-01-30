import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight(plane, "FR890", "AMS", "GLA", "15:35");
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

}
