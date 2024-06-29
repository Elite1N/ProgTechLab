public class CoinBox {
    private int value , amount;
    public CoinBox(int value , int amount){
        this.value = value;
        this.amount = amount;
    }

    public void setAmount(int setamount){
        this.amount = setamount;
    }
    public int getAmount() {
        return amount;
    }

    public int getValue() {
        return value;
    }


}
