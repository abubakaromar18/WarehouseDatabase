import java.util.*;

public class Transaction {

    private String Name;
    // private int CardNum;
    private int OrderNum;
    private int PriceToTal;

    public void setName(String Name)
    {
        this.Name = Name;
    }
    /*public void setCardnumber(int ID)
    {
        this.CardNum = ID;
    }
    */

    public void setOrdernumber(int Price)
    {
        this.OrderNum = Price;
    }
    public void setPrice(int Quantity)
    {
        this.PriceToTal = Quantity;
    }
    public String getName()
    {
        return this.Name;
    }
    /*public int getCardnumber()
    {
        return this.CardNum;
    }
    */

    public int getOrdernumber()
    {
        return this.OrderNum;
    }
    public int getPrice()
    {
        return this.PriceToTal;
    }
    public static void main(String[] args)
    {
        Transaction t = new Transaction();
        Cart c= new Cart();

        System.out.println("Welcome to your Transaction");
        System.out.println(c.getTransfer());        // getting the products from shoppingcart
        System.out.println(c.getTransfers());       //getting the sale price from shopping cart
        System.out.println(c.getID());              //getting the total value from shopping cart
        System.out.println(c.getName());
        t.getOrdernumber();

    }
}
