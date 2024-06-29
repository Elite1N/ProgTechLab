public class Secretary extends Employee implements Evaluation{
    int typespeed;
    int[] score;

    public Secretary(String name, int salary , int[] score , int typespeed) {
        super(name, salary);
        this.score = score;
        this.typespeed = typespeed;

    }

    @Override
    public double evaluate() {
        int sumscore = 0;
        for (int eachscore : score){
            sumscore+= eachscore;
        }
        return (double) sumscore ;
    }

    @Override
    public char grade(double sumscore) {
        if (sumscore>=90){
            super.setSalary(18000);
            return 'P';
        }else return 'F';
    }
}
