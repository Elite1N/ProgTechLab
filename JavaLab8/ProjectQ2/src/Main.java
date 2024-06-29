import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> arrayList = new  ArrayList<Bus>();
        arrayList.add(new Hybrid(150 ,1 , Electric.HIGH_VOLTAGE , 45 ,1200000 ));
        arrayList.add(new CNGBus(200,2,50,10000000));
        for (Bus eachbus : arrayList){
            System.out.println("ID: " + eachbus.getID());
            if (eachbus instanceof LiquidFuel){
                System.out.println("Emission Tier: " + ((LiquidFuel) eachbus).getEmissionTier());
            }
            System.out.println("Accel: " + eachbus.getAccel());


        }
    }
}