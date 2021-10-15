import java.io.PrintStream;
import java.util.*;

public class Cart {

    private String productName;
    private double Price;
    private int Quantity;
    private double PriceTotal;
    private double totalPrice; 

    private List<Object> waitList = new LinkedList<Object>();

    private List<Cart> cartList = new LinkedList<Cart>();

    public void insertItemToCart(Cart l) {cartList.add(l);}

    public void insertWaitList(Cart l) { waitList.add(l); };

    // Contructor
    Cart(String productName, int Quantity, double Price, double PriceTotal){
        this.productName = productName;
        this.Quantity = Quantity;
        this.Price = Price;
        this.PriceTotal = PriceTotal;
    }

    void putIntoWaitList(String productName, int Quantity){
        this.productName = productName;
        this.Quantity = Quantity;

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

    // Process Shopping Cart
    public void processCart(productList pList){

        Iterator<products> prodIt = pList.getProduct();
       
        // Shopping Cart
        for (Cart c: cartList){

            boolean found = false; 

            // Product List
            while (prodIt.hasNext()){

                products  pL = prodIt.next();

                // If Product List Have Enought Quantity
                if(c.getproductName().equals(pL.getProductName()) && c.getQuantity() <= pL.getQuantity() ){
                    
                   int num = (pL.getQuantity() - c.getQuantity());

                   totalPrice += (c.getPrice() * c.getQuantity());

                   // Update Quantity In Product List
                   pL.setQuantity(num);

                   found = true; 

                   break;
                }
            }

            // If There Isn't Enought Quantity In Product List
            /************ ISSUE HERE: PRODUCT IS NOT ADDED TO WAITLIST ***************************/
            if(found == false){

                c.putIntoWaitList(c.getproductName(), c.getQuantity());

                // Put Into WaitList
               waitList.add(c);
            }
        } 

        // Remove Cart
        cartList.clear();
    }

    // Display Wait List
    public void displayWList(){

        for (Cart c : cartList) 
            System.out.println(c);
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

    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }


    // Getter
    public double getPriceTotal() { return this.PriceTotal; }

    public String getproductName() { return this.productName;}

    public double getPrice() { return this.Price;}

    public int getQuantity() { return this.Quantity; }

    public double getTotalPrice() { return this.totalPrice; }

    @Override
    public String toString(){ return this.productName + " " + this.Quantity + "  " + this.Price + " " + this.PriceTotal; }
}




