import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Point A: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Point B: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point pointA = new Point(x1, y1);
        Point pointB = new Point(x2, y2);

        System.out.printf("A = %s B = %s Distance = %s\n" ,pointA ,pointB.toString() , pointA.distance(pointB.x, pointB.y));
        System.out.print("Move the points: ");
        double movebyX = input.nextDouble();
        double movebyY = input.nextDouble();
        pointA.translate(movebyX, movebyY);
        pointB.translate(movebyX, movebyY);

        System.out.printf("A = %s B = %s Distance = %s\n" ,pointA ,pointB.toString() , pointA.distance(pointB.x, pointB.y));

        if (pointA.equals(pointB)){
            System.out.println("A and B are at the same position.");
        }else {
            System.out.println("A and B are not at the same position.");
        }
    }
}