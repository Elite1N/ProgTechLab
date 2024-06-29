public class CNGBus extends Bus implements  LiquidFuel{
    private double range;
    private int emissionTier;
    public CNGBus(double range ,int emissionTier, int capacity ,double cost  ){
        super(capacity , cost);
        this.range = range;
        this.emissionTier = emissionTier;

    }
    @Override
    public double getAccel() {
        return 3;
    }

    @Override
    public double getRange() {
        return this.range;
    }

    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
}
