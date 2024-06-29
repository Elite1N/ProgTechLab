import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        ArrayList<Integer> primenumber = new ArrayList<Integer>();
        int numbercount = 0;
        int number = 2;
        System.out.println("Prime numbers until " + n);
        while(number<=n){
            if (checkPrime(number)){
                primenumber.add(numbercount , number);
                numbercount++;

            }
            number++;
        }
        System.out.println(primenumber);

    }
    public static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}