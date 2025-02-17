import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VendingMachine v = new VendingMachine();
        Card c1 = new Card(100);
        Card c2 = new Card(50);

        String drinkName;
        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.println(v.buy(drinkName, c1)); //use card c1
        System.out.println("CardID: " + c1.getCardID() + " Card amount left: " +
                c1.getCardvalue());
        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.println(v.buy(drinkName, c2)); //use card c2
        System.out.println("CardID: " + c2.getCardID() + " Card amount left: " +
                c2.getCardvalue());

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.println(v.buy(drinkName, c2)); //use card c2
        System.out.println("CardID: " + c2.getCardID() + " Card amount left: " +
                c2.getCardvalue());

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.println(v.buy(drinkName, c2)); //use card c2
        System.out.println("CardID: " + c2.getCardID() + " Card amount left: " +
                c2.getCardvalue());

        // Buying using coin
        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        ArrayList<Integer> Coin1 = v.InputCoin();
        System.out.println(v.buy(drinkName, Coin1));

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        ArrayList<Integer> Coin2 = v.InputCoin();
        System.out.println(v.buy(drinkName, Coin2));

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        ArrayList<Integer> Coin3 = v.InputCoin();
        System.out.println(v.buy(drinkName, Coin3));

        System.out.println("\n====Simulate end of day====");
        System.out.println("Revenue: " + v.getRevenue());
        v.endOfDayProcess();
        System.out.println(v.getDrinkDetail());


    }
}