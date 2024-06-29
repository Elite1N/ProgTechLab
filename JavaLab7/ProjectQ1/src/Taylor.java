abstract class Taylor {
    private int k;
    private double x;
    public Taylor(int k, double x){
        this.k  = k;
        this.x = x;
    }
    public int factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n ; ++i){
            fact *= i;
        }
        return fact;
    }

    public int getIteration() {
        return k;
    }
    public double getValue() {
        return x;
    }
    public abstract void printValue();
    public abstract double getApprox();
}
