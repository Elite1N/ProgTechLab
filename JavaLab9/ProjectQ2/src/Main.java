import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = scanner.nextInt();
        System.out.println(primeFactor(n));
    }
    public static ArrayList<Integer> primeFactor(int n) {
        return primesRecursive(n, 2);
    }

    //overload a private method that also takes f as argument:
    private static ArrayList<Integer> primesRecursive(int n, int f) {
        if (n == 1) return new ArrayList<Integer>();
        if (n % f == 0) {
            ArrayList<Integer> factors = primesRecursive(n/f, f);
            if(!(factors.contains(f))){
                factors.add(0,f);
            }
            return factors;
        } else
            return primesRecursive(n, f+1);
    }
}