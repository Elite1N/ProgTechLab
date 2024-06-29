import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2D array
        double[][] array = new double[4][2];
        System.out.printf("First point: ");
        array[0][0] = input.nextDouble(); array[0][1] = input.nextDouble();
        System.out.printf("Second point: ");
        array[1][0] = input.nextDouble(); array[1][1] = input.nextDouble();
        System.out.printf("Third point: ");
        array[2][0] = input.nextDouble(); array[2][1] = input.nextDouble();
        System.out.printf("Fourth point: ");
        array[3][0] = input.nextDouble(); array[3][1] = input.nextDouble();

        double sumX = 0 ;double sumY = 0;
        for (int i = 0; i < 4; i++) {  // Summation of a column
            sumX += array[i][0];
            sumY += array[i][1];
            double averageC1 = (sumX / 4);
            double averageC2 = (sumY / 4);
        }
        double averageX = (sumX / 4); double averageY = (sumY / 4);
        System.out.println("The centroid is ( " + averageX + ", "+ averageY + " )");

        double[] distancearray = new double[4];

        for (int i = 0; i<4 ;i++) {
            distancearray[i] = Math.sqrt(Math.pow(array[i][0] - averageX, 2) + Math.pow(array[i][1] - averageY, 2));
        }
        Arrays.sort(distancearray);
        System.out.println("Sum of distance is " + Arrays.stream(distancearray).sum() + ".");
        System.out.println("Shortest distance is " + distancearray[0] + ".");
        System.out.println("Longest distance is " + distancearray[3] + ".");
    }
}