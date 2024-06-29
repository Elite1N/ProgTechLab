import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int arraysize = scanner.nextInt(); // number of prime number in array
        int[] primearray = new int[arraysize];
        int numbercount = 0;
        int number = 2;
        System.out.println("First " + arraysize + " prime numbers:");
        while (numbercount < arraysize) {
            if (checkPrime(number)) { // check if prime เอาค่าเข้า
                primearray[numbercount] = number;
                numbercount++;
            }
            number++; //loop เพิ่มค่าไปเรื่อยๆ
        }
        System.out.println(Arrays.toString(primearray));
    }
    public static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // ถ้าหาตัวหารเจอ num ไม่ใช้ prime
            }
        }
        return true;
    }
}
