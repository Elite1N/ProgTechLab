public class Sine extends Taylor{
    public Sine(int k, double x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.sine() is " + Math.sin(super.getValue()) + ".");
        System.out.println("Approximated value is " + this.getApprox() + ".");
    }

    @Override
    public double getApprox() {
        double sine = 0;
        for (int n = 0; n<=super.getIteration() ;++n){
            sine += (Math.pow(-1, n) * Math.pow(super.getValue(), 2 * n + 1)) / factorial(2 * n + 1);
        }
        return sine;
    }
}
