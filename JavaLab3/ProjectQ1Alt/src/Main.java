import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumCreditWeight = 0 ;
        double sumWeightedGrade = 0;
        System.out.println("Enter course ID, credit and grade; or X to terminate");
        while (true){
            String courseID = input.next();
            if(courseID.equals("X")){
                break;
            }
            int credit = input.nextInt();
            String grade = input.next();

            double gradeValue = 0;
            switch (grade){
                case "A": gradeValue = 4;break;
                case "B+":gradeValue = 3.5;break;
                case "B": gradeValue = 3;break;
                case "C+":gradeValue = 2.5;break;
                case "C":gradeValue = 2;break;
                case "D+":gradeValue = 1.5;break;
                case "D":gradeValue = 1 ;break;
                default: System.out.println("Invalid grade.");
            }
            sumCreditWeight += credit;
            sumWeightedGrade += (credit*gradeValue);

        }
        System.out.println("GPA = " + (sumWeightedGrade/sumCreditWeight));
    }
}