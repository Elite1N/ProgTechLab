import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student 1 : Enter ID, name, major");
        String text1 = input.nextLine();
        String[] textparts1 = text1.split("\\s+");
        String id1 = textparts1[0];
        String name1 = textparts1[1] + " " +textparts1[2];
        String major1 = textparts1[3];

        System.out.println("Student 2 : Enter ID, name, major");
        String text2 = input.nextLine();
        String[] textparts2 = text2.split("\\s+");
        String id2 = textparts2[0];
        String name2 = textparts2[1];
        String major2 = textparts2[2];
        Student student1 = new Student(name1,id1,major1);
        Student student2 = new Student(name2,id2,major2);
        if(student1.sameYear(student2)){
            System.out.print("Same year, ");
        }else {
            System.out.print("Different year, ");
        }
        if(student1.sameLevel(student2)){
            System.out.print("same level, ");
        }else{
            System.out.print("different level, ");
        }
        if (student1.sameFaculty(student2)){
            System.out.print("same faculty");
        }else {
            System.out.print("different faculty");
        }
    }
}
