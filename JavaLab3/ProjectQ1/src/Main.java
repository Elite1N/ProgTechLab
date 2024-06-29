import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] array = text.split("\\s+");
        int arraysize = array.length;
        String grade = "none";
        if(arraysize == 3){grade = array[2];}
        int weight = Integer.parseInt(array[1]);
        double sum = 0;
        double count = 0;
        do{
            System.out.println((text));
            switch (grade){
                case "A": sum+=(4*weight);break;
                case "B+":sum+=(3.5*weight);break;
                case "B": sum+=(3*weight);break;
                case "C+":sum+=(2.5*weight);break;
                case "C":sum+=(2*weight);break;
                case "D+":sum+=(1.5*weight);break;
                case "D":sum+=(weight);break;
                default: System.out.println("Invalid grade.");
            }
            count+=weight;
            System.out.println("Grade sum is: " + sum);
            text = input.nextLine();
            array = text.split("\\s+");
            grade = array[2];
        }
        while (!(array[0].equals("X")));

        System.out.println("GPA = "+ (sum/count));

    }
}