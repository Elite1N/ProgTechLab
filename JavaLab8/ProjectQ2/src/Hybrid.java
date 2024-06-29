public class Hybrid extends Bus implements LiquidFuel ,Electric{
    private double voltage;
    private double range;
    private int emissionTier;
    public Hybrid(double range ,int emissionTier, double voltage , int capacity ,double cost ){
        super(capacity , cost);
        this.range = range;
        this.emissionTier = emissionTier;

        if (voltage<LOW_VOLTAGE){
            this.voltage = LOW_VOLTAGE;
        }
        if(voltage>HIGH_VOLTAGE){
            this.voltage = HIGH_VOLTAGE;
        }
    }
    @Override
    public double getAccel() {
        return 4;
    }

    @Override
    public double getVoltage() {
        return voltage;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public int getEmissionTier() {
        return emissionTier;
    }
}
