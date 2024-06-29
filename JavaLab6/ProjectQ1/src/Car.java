public class Car {
    private double gas, efficiency;

    public Car(double gas, double efficiency){
        this.gas = gas;
        this.efficiency = efficiency;
    }

    public void drive(double distance){
        if (distance/efficiency > gas){
            System.out.println("You cannot drive too far, please add gas");
        }else {
            gas -= distance/efficiency;
        }
    }

    public double getGas() {
        return gas;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void addGas(double amount){
        this.gas+=amount;
    }
}
