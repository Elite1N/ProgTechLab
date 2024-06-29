import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("Current Date " + today);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        LocalDate InputDate = LocalDate.of(year,month,day);
        System.out.println(InputDate.toEpochDay() - today.toEpochDay());
    }
}