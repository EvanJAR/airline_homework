import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {

    Passenger Passenger;

    @Before
    public void before(){
        passenger = new Passenger("Kate McCallister", 3);
    }

    @Test
    public void hasName(){
        Assert.assertEquals("Kate McCallister", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        Assert.assertEquals(3, passenger.getNumberOfBags());
    }


}
