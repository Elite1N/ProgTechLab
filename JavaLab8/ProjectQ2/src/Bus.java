public abstract class Bus {
    private int ID;
    private int capacity;
    private double cost;
    private static int nextID= 1;
    public Bus(int capacity, double cost) {
        ID= nextID++;
        this.capacity = capacity;
        this.cost = cost;
    }
    public abstract double getAccel();
    public final int getID() {return ID;}
    public int getCapacity() {return capacity;}
    public double getCost() {return cost;}
}
