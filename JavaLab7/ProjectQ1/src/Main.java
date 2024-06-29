public class Main{
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();

        System.out.println(" ");
        Taylor[] Taylorarray = {exp,s,cs};
        for (Taylor formula : Taylorarray){
            System.out.println(formula.getApprox());
        }
    }
}