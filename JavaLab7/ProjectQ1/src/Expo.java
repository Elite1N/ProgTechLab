public class Expo extends Taylor{
    public Expo(int k, double x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(super.getValue()) + ".");
        System.out.println("Approximated value is " + this.getApprox() + ".");
    }

    @Override
    public double getApprox() {
        double expo = 0;
        for (int n = 0; n<=super.getIteration() ;++n){
            expo += Math.pow(super.getValue() , n) / super.factorial(n);
        }

        return expo;
    }
}
