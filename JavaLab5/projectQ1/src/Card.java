public class Card {
    private int cardvalue;
    private int cardID;

    private static int cardcount;
    private final int MINVALUE = 10;


    public Card(int cardvalue){
        if(cardvalue>=MINVALUE){
            this.cardvalue = cardvalue;
        }else {
            this.cardvalue = MINVALUE;

        }
        ++cardcount;
        this.cardID = cardcount;

    }
    public int getCardID() {
        return cardID;
    }

    public int getCardvalue() {
        return cardvalue;
    }

    public void addMoney(int addedamount){
        this.cardvalue+=addedamount;
    }

    public boolean pay(int paidamount){
        if(this.cardvalue - paidamount >=MINVALUE){
            this.cardvalue-=paidamount;
            return true;
        }else {
            return false;
        }
    }



}
