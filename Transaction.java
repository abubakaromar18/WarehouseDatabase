import java.util.*;

public class Transaction {

    private String transactionID;
    private int CardNum;
    private int OrderNum;
    private int PriceToTal;

    private Vector<Transaction> transactionList = new Vector<Transaction>();

    public void insertItemToCart(Transaction l) {transactionList.addElement(l);}

    // Constructor
    Transaction(String transactionID, int CardNum, int OrderNum, int PriceTotal){
        this.transactionID = transactionID;
        this.CardNum = CardNum;
        this. OrderNum = OrderNum;
        this.PriceToTal = PriceTotal;
    }

    // Setter
    public void settransactionID(String transactionID){ this.transactionID = transactionID; }

    public void setCardnumber(int ID){ this.CardNum = ID; }
    
    
    public void setOrdernumber(int Price){ this.OrderNum = Price; }
    
    public void setPrice(int Quantity){this.PriceToTal = Quantity;}
    
    // Getter
    public String gettransactionID(){ return this.transactionID; }

    public int getCardnumber(){ return this.CardNum; }
    
    public int getOrdernumber() { return this.OrderNum; }
   
    public int getPrice(){ return this.PriceToTal; }

    @Override
    public String toString(){ return this.transactionID+ "  " + this.CardNum + " " + this.OrderNum + "  " + this.PriceToTal; }
  
}
