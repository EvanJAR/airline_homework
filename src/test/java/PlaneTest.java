import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        Assert.assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        Assert.assertEquals(5, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight(){
        Assert.assertEquals(183_500, plane.getPlaneWeight());
    }

}
