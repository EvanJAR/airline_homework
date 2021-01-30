public enum PlaneType {

    BOEING747(183_500, 5);

    private final int weight_kgs;
    private final int capacity;

    PlaneType(int weight_kgs, int capacity){
        this.weight_kgs = weight_kgs;
        this.capacity = capacity;
    }

    public int getPlaneCapacity(){
        return capacity;
    }

    public int getPlaneWeight(){
        return weight_kgs;
    }

}
