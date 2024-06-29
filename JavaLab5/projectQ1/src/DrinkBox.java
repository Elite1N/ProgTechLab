public class DrinkBox {
    private String name;
    private int price, amount;

    public  DrinkBox(String drinkname , int drinkprice , int stockamont){
        this.name = drinkname;
        this.price = drinkprice;
        this.amount = stockamont;

    }

    public void setAmount(int setamount){
        this.amount = setamount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;

    }

    public int getPrice() {
        return price;
    }
}
