import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {

    FlightManager flightManager;

    @Test
    public void canCalculateBaggageWeightForEachPassenger(){
        Assert.assertEquals(36.6, flightManager.weightForEachPassanger());
    }

}
