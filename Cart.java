import java.io.PrintStream;
import java.util.*;
import java.util.Random;

public class Cart {

    private String productName;
    private String Price;
    private String Quantity;
    private String PriceTotal;

    private Vector<Cart> cartList = new Vector<Cart>();

    public void insertItemToCart(Cart l) {cartList.addElement(l);}

    // Contructor
    Cart(String productName, String Price, String Quantity, String PriceTotal){
        this.productName = productName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.PriceTotal = PriceTotal;
    }

    // Update Shopping Cart
    public void updateCart(String find, String productName, String Price, String Quantity){

        for (Cart c : cartList) {
            if(c.getName().equals(find) || c.getPrice().equals(find) || c.getQuantity().equals(find)){
                setName(productName);
                setPrice(Price);
                setQuantity(Quantity);
            }

        }
    }

    // Display All Cart
    public void displayAllCart(){

        for (Cart c : cartList) 
            System.out.println(c);
    } 

    // Search For A Cart
    public Cart searchCart(String find){

        for (Cart a : cartList) 
            if(a.getName().equals(find) || a.getPrice().equals(find)|| a.getQuantity().equals(find) || a.getTotalPrice().equals(find))
                return a;  
        
        return null;
    }


    // Setter
    public void setName(String productName) { this.productName = productName; }


    public void setPrice(String Price) { this.Price = Price; }

    public void setQuantity(String Quantity) { this.Quantity = Quantity; }

    public void setPriceTotal(String PriceTotal) { this.PriceTotal = PriceTotal;}


    // Getter
    public String getTotalPrice() { return this.PriceTotal; }

    public String getName() { return this.productName;}

    public String getPrice() { return this.Price;}

    public String getQuantity() { return this.Quantity; }

    @Override
    public String toString(){ return this.productName + " " + this.Price + "  " + this.Quantity + " " + this.PriceTotal; }
}




