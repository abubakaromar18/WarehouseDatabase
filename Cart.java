import java.io.PrintStream;
import java.util.*;
import java.util.Random;

public class Cart {

    private String Name;
    private String ID;
    private String Price;
    private String Quantity;
    private String OrderNum;
    private String PriceTotal;

    private Vector<Cart> cartList = new Vector<Cart>();

    public void insertItemToCart(Cart l) {cartList.addElement(l);}

    // Contructor
    Cart(String OrderNum, String Name, String ID, String Price, String Quantity, String PriceTotal){
        this.OrderNum = OrderNum;
        this.Name = Name;
        this.ID = ID;
        this.Price = Price;
        this.Quantity = Quantity;
        this.PriceTotal = PriceTotal;
    }

    // Update Shopping Cart
    public void updateCart(String find, String Name, String ID, String Price, String Quantity){

        for (Cart c : cartList) {
            if(c.getName().equals(find) ||c.getID().equals(find) || c.getPrice().equals(find) || c.getQuantity().equals(find)){
                setName(Name);
                setID(ID);
                setPrice(Price);
                setQuantity(Quantity);
            }

        }
    }


    // Setter
    public void setName(String Name) { this.Name = Name; }

    public void setID(String ID) { this.ID = ID; }

    public void setPrice(String Price) { this.Price = Price; }

    public void setQuantity(String Quantity) { this.Quantity = Quantity; }

    public void setOrderNumber(String OrderNum) { this.OrderNum = OrderNum; }

    public void setPriceTotal(String PriceTotal) { this.PriceTotal = PriceTotal;}


    // Getter
    public String getOrderNumber() { return this.OrderNum; }

    public String getTotalPrice() { return this.PriceTotal; }

    public String getName() { return this.Name;}

    public String getID() { return this.ID; }

    public String getPrice() { return this.Price;}

    public String getQuantity() { return this.Quantity; }

    @Override
    public String toString(){ return this.Name+ "  " + this.ID + " " + this.Price + "  " + this.Quantity; }
}




