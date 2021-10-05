import java.io.PrintStream;
import java.util.*;

public class Cart {

    private String productName;
    private double Price;
    private int Quantity;
    private double PriceTotal;

    private List<Object> waitList = new LinkedList<Object>();

    private List<Cart> cartList = new LinkedList<Cart>();

    public void insertItemToCart(Cart l) {cartList.add(l);}

    public void insertWaitList(products l) { waitList.add(l); };

    // Contructor
    Cart(String productName, double Price, int Quantity, double PriceTotal){
        this.productName = productName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.PriceTotal = PriceTotal;
    }

    // Update Shopping Cart
    public int updateCart(String productName, int Quantity){

        for (Cart c : cartList) {

            // Product In Cart
            if(c.getproductName().equals(productName)){
                c.setName(productName);
                c.setQuantity(Quantity);
                return 1; 
            }
        }
        return 0;
    }

    
    public void processCart(productList pList){


        Iterator<products> prodIt = pList.getProduct();

        int index = 0; 
       
    
        for (Cart c: cartList){

            while (prodIt.hasNext()){
                products  pL = prodIt.next();

            
                // If cartList product is in the productList class
                if(c.getproductName() == pL.getProductName() && c.getQuantity() <= pL.getQuantity()){
                    
                   int num = (pL.getQuantity() - c.getQuantity());

                   // Remove object
                   cartList.remove(pL);
                   index++;

                }
                else{
                    int wQuantity = pL.getQuantity();

                    String wProductName = pL.getProductName();

                    // Put into waitlist
                   waitList.add(wQuantity + wProductName);
                }
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
            if(a.getproductName().equals(find))
                return a;  
        
        return null;
    }


    // Is Cart Empty?
    public int CheckEmpty(){	
             
        if(cartList.isEmpty()){
            return 1; 
        }
        else
         return 0;
    }


    // Setter
    public void setName(String productName) { this.productName = productName; }

    public void setPrice(double Price) { this.Price = Price; }

    public void setQuantity(int Quantity) { this.Quantity = Quantity; }

    public void setPriceTotal(double PriceTotal) { this.PriceTotal = PriceTotal;}


    // Getter
    public double getTotalPrice() { return this.PriceTotal; }

    public String getproductName() { return this.productName;}

    public double getPrice() { return this.Price;}

    public int getQuantity() { return this.Quantity; }

    @Override
    public String toString(){ return this.productName + " " + this.Price + "  " + this.Quantity + " " + this.PriceTotal; }
}




