import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    Flight flight;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR890", "AMS", "GLA", "15:35");
        flightManager = new FlightManager(plane, flight);
    }


    @Test
    public void canCalculateTotalWeightReservedForPassengers(){
        Assert.assertEquals(90, flightManager.totalWeightReservedForPassengers(plane), 0);
    }

//    @Test
//    public void canCalculateBaggageWeightForEachPassenger(){
//        Assert.assertEquals(18.3, flightManager.weightForEachPassenger());
//    }



}
