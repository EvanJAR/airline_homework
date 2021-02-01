public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneCapacity() {
        int planeCapacity = this.planeType.getPlaneCapacity();
        return planeCapacity;

    }
    public int getPlaneWeight(){
        int planeWeight = this.planeType.getPlaneWeight();
        return planeWeight;
    }

}
