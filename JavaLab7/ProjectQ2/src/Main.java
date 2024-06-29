public class Main {
    public static void main(String[] args) {
        Square a1 = new Square(0,0,2,2,0,2,2,0);
        System.out.print(a1.toString());
        System.out.println("Area of square = "+a1.area());
        System.out.println("-------------------------------------");

        Square a2 = new Square(2,2,0,2,0,0,2,0);
        System.out.print(a2.toString());
        System.out.println("Area of square = "+a2.area());
        System.out.println("-------------------------------------");

        Rectangle b1 = new Rectangle(2,5,0,5,0,0,2,0);
        System.out.print(b1.toString());
        System.out.println("Area of rectangle = "+b1.area());
        System.out.println("-------------------------------------");

        Kite c1 = new Kite(0,0,1,0,0,1,4,4);
        System.out.print(c1.toString());
        System.out.println("Area of kite = "+c1.area());
        System.out.println("-------------------------------------");
    }
}