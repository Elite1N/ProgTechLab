public class Subject implements Evaluation{
    private String subjName;
    private int[] score;
    public Subject(String subjName , int[] score){
        this.subjName = subjName;
        this.score = score;

    }
    @Override
    public double evaluate() {
        int sumscore = 0;
        int count = 0;
        for (int eachscore : score){
            sumscore+= eachscore;
            count++;
        }
        return (double) sumscore/count ;
    }

    @Override
    public char grade(double g) {
        if (g>=70){
            return 'P';
        }else return 'F';
    }

    @Override
    public String toString() {
        return subjName;
    }
}
