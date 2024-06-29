import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<DrinkBox> drinkList = new ArrayList<DrinkBox>();
    private ArrayList<CoinBox> coinList = new ArrayList<CoinBox>();
    private int revenue, totalCoinValue;

    public VendingMachine() {
        drinkList.add(new DrinkBox("Coke", 13, 2));
        drinkList.add(new DrinkBox("Sprite", 13, 2));
        drinkList.add(new DrinkBox("GreenTea", 20, 2));
        drinkList.add(new DrinkBox("Water", 10, 2));
        drinkList.add(new DrinkBox("MinuteMaid", 18, 2));
        drinkList.add(new DrinkBox("Pepsi", 13, 2));
        drinkList.add(new DrinkBox("Vitamilk", 15, 2));
        drinkList.add(new DrinkBox("RootBeer", 13, 2));
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
        setTotalCoinValue();
    }

    public String buy(String name, Card c) {
        if(c.getCardID() >=1 && c.getCardID()<=100){
            for(DrinkBox drinkname : drinkList){
                if (drinkname.getName().equals(name)){
                    if (drinkname.getAmount()>0){
                        if (c.pay(drinkname.getPrice())){
                            revenue+=drinkname.getPrice();
                            drinkname.setAmount(drinkname.getAmount()-1);
                            return "Thank you";
                        }else return "Not enough money";
                    }else return "Out of stock";

                }
            }
            return "Drink not found";
        }return "Invalid ID";
    }

    public String buy(String name, ArrayList<Integer> coinValue) { // coinValue = inputted coin used for buying
        boolean vaildDrink = false;
        int sumCoinInput = 0;
        DrinkBox drinkBox = drinkList.get(0); // placeholder value  used for brute forcing (unneeded when the code format is different from this)

        for(DrinkBox drink:drinkList){
            if(drink.getName().equals(name)){
                vaildDrink = true;
                drinkBox = drink;
                break;
            }
        }

        sumCoinInput += coinValue.get(0)+ coinValue.get(1)*2 + coinValue.get(2)*5  + coinValue.get(3)*10; // sum of inputted coin

        for(int i = 0; i<coinList.size() ; ++i){  // add inputted coin to storage
            coinList.get(i).setAmount(coinList.get(i).getAmount()+coinValue.get(i));
        }
        //System.out.println("10thb" +  coinList.get(3).getAmount());
        if(vaildDrink){
            if(sumCoinInput >= drinkBox.getPrice() && drinkBox.getAmount() >= 1){
                if(totalCoinValue >= (sumCoinInput - drinkBox.getPrice())){
                    drinkBox.setAmount(drinkBox.getAmount()-1);
                    System.out.println(calcChange(sumCoinInput - drinkBox.getPrice()));
                    revenue += drinkBox.getPrice();
                    return "Thank you";
                }
                else if (totalCoinValue < (sumCoinInput - drinkBox.getPrice()) || calcChange(sumCoinInput - drinkBox.getPrice()).equals("False")) {
                    return "Cannot give change";
                }
            }
            else if(drinkBox.getAmount() < 1){
                return "Out of stock";
            }
            else if(sumCoinInput < drinkBox.getPrice()){
                return "Not enough money";
            }
        }
        return "Drink not found";
    }

    public void endOfDayProcess() {
        revenue = 0;
        for (DrinkBox drinkname : drinkList) {
            drinkname.setAmount(2);
        }

        coinList.clear();
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
    }

    public int getRevenue() {
        return revenue;
    }

    public String getDrinkDetail() {
        String text = "**********************\n";
        for (DrinkBox drinkname : drinkList) {
            text += (drinkname.getName() + " " + drinkname.getPrice() +" "+ drinkname.getAmount() + "\n");
        }
        return text;
    }

    public String toString() {
        String text = "**********************\n";
        for (DrinkBox drink : drinkList){
            text += drink.getName()+" "+drink.getPrice()+" "+drink.getAmount()+"\n";
        }
        text += "CoinBox";
        for (CoinBox cointype : coinList){
            text += cointype.getValue()+" "+ cointype.getAmount();
        }
        return text;
    }
    public void setTotalCoinValue(){
        for(CoinBox coin:coinList){
            totalCoinValue += coin.getAmount()*coin.getValue();
        }
    }

    public ArrayList<Integer> InputCoin(){
        ArrayList<Integer> inputcoinarray = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 1 THB coin:");
        inputcoinarray.add(scanner.nextInt());
        System.out.println("Insert 2 THB coin:");
        inputcoinarray.add(scanner.nextInt());
        System.out.println("Insert 5 THB coin:");
        inputcoinarray.add(scanner.nextInt());
        System.out.println("Insert 10 THB coin:");
        inputcoinarray.add(scanner.nextInt());
        return inputcoinarray;
    }
    public String calcChange(int changeAmount){
        String text = "\nCoin Changes :\n";
        for (int i = 3; i >= 0 ; i--) {
            System.out.println("Proceeding in " + i);
            if(changeAmount>0){

                int coinNum = Math.floorDiv(changeAmount,coinList.get(i).getValue()) ;
                if(coinNum > coinList.get(i).getAmount()){
                    coinNum = coinList.get(i).getAmount();
                }
                text += coinList.get(i).getValue() +" THB Coin : "+ coinNum + " Coin\n";
                changeAmount -= coinNum*coinList.get(i).getValue();
                coinList.get(i).setAmount(coinList.get(i).getAmount() - coinNum);
            }
        }
        if(changeAmount != 0){
            System.out.println(changeAmount);
            text = "False";
        }
        if(text.equals("\nChange :\n")){
            text = "\nChange : None\n";
        }
        return text;
    }

}

