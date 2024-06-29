import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name last name and age: ");
        String text = input.nextLine();

        String[] parts = text.split("\\s+");   // split text by multiple whitespaces

        String firstName = parts[0];
        String lastName = parts[1];
        int age = Integer.parseInt(parts[2]);

        System.out.println(lastName + ", " + firstName + " is " + age + " years old.");

    }
}
