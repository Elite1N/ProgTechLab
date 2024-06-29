import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayA = new int[10][5];
        int[][] arrayB = new int[10][5];
        int[][] arrayC = new int[5][3];

        // Create the 3 Arrays with randomized array as values (streamSize = number of arrays inside the main array)
        for(int i=0;i<arrayA.length;i++) {
            arrayA[i] = random.ints(5, -100,100).toArray();
        }
        for(int i=0;i<arrayB.length;i++) {
            arrayB[i] = random.ints(5, -100,100).toArray();
        }
        for(int i=0;i<arrayC.length;i++) {
            arrayC[i] = random.ints(3, -100,100).toArray();
        }

        // Create and show the 3 matrices
        Mtx matrixA = new Mtx(arrayA);
        Mtx matrixB = new Mtx(arrayB);
        Mtx matrixC = new Mtx(arrayC);
        System.out.println("A =");
        matrixA.printMtx();
        System.out.println();
        System.out.println("B =");
        matrixB.printMtx();
        System.out.println();
        System.out.println("C =");
        matrixC.printMtx();
        System.out.println();

        // Check if matrices A , B equal -- > addition
        if(matrixA.equalSize(matrixB)){
            System.out.println("A+B =");
            matrixA.add(matrixB).printMtx();

        }else{
            System.out.println("A and B are don't have the same dimension therefore they cannot do addition.");
        }
        System.out.println();

        // multiply matrices B by 2
        System.out.println("2*B =");
        matrixB.mul(2).printMtx();
        System.out.println();

        // Check if matrices A and B are compatible for multiplication
        if(matrixA.compatible(matrixB)){
            System.out.println("A*B =");
            matrixA.mul(matrixB).printMtx();
        }else{
            System.out.println("A and B are not compatible for multiplication.");
        }
        System.out.println();

        // Check if matrices A and C are compatible for multiplication
        if(matrixA.compatible(matrixC)){
            System.out.println("A*C =");
            matrixA.mul(matrixC).printMtx();
        }else{
            System.out.println("A and C are not compatible for multiplication.");
        }
    }
}
 