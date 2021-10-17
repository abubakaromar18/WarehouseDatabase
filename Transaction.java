import java.util.*;

public class Transaction {

    private String transactionID;
    private String OrderNum;
    private double PriceToTal;

    private List<Transaction> transactionList = new LinkedList<Transaction>();

    public void insertItemToTransaction(Transaction l) {transactionList.add(l);}

    // Constructor
    Transaction(String transactionID, String OrderNum, double PriceTotal){
        this.transactionID = transactionID;
        this. OrderNum = OrderNum;
        this.PriceToTal = PriceTotal;
    }

    // Display All Transaction
    public void displayAllTranscation(){

        for (Transaction c : transactionList) 
            System.out.println(c);
    } 

    // Search For A Transaction
    public Transaction searchTransaction(String find){

        for (Transaction a : transactionList) 
            if(a.gettransactionID().equals(find) ||a.getOrdernumber().equals(find))
                return a;  
        
        return null;
    }

    // Setter
    public void settransactionID(String transactionID){ this.transactionID = transactionID; }
    public void setOrdernumber(String Price){ this.OrderNum = Price; }
    public void setPrice(double Quantity){this.PriceToTal = Quantity;}
    
    // Getter
    public String gettransactionID(){ return this.transactionID; }
    public String getOrdernumber() { return this.OrderNum; }
   public double getPrice(){ return this.PriceToTal; }

    @Override
    public String toString(){ return this.transactionID+ " " + this.OrderNum + "  " + this.PriceToTal; }
  
}
