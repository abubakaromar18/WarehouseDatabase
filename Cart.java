import java.io.PrintStream;
import java.util.*;

public class Cart {

    private String productName;
    private double Price;
    private int Quantity;
    private double PriceTotal;
    private double totalPrice; 

    private List<Cart> waitList = new LinkedList<Cart>();

    private List<Cart> cartList = new LinkedList<Cart>();

    public void insertItemToCart(Cart l) {cartList.add(l); }

    public void insertWaitList(Cart l) { waitList.add(l); }

<<<<<<< HEAD
    private List<Double> cDebt = new LinkedList<Double>();

    public void insertCDebt(Double a) { cDebt.add(a); }

=======
>>>>>>> parent of 28e0972 (update)
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
    public int updateCart(String pName, int Q, productList pList){


        Iterator<products> prodIt = pList.getProduct();
<<<<<<< HEAD

        for (Cart c : cartList) {

=======

        for (Cart c : cartList) {

>>>>>>> parent of 910138a (Merge branch 'main' of https://github.com/abubakaromar18/WarehouseDatabase)
            // Product In Cart
            if(c.getproductName().equals(pName)){
                c.setQuantity(Q);
                return 1; 
            }   
        }

        while (prodIt.hasNext()){

            products  pL = prodIt.next();

            // Product Not In Cart, But Warehouse Carry The Product
            if (pL.getProductName().equals(pName)){

                Cart newC = new Cart(pName, Q, pL.getCostPrice(), Q *pL.getCostPrice());
                cartList.add(newC);
                return 1; 
            }
        }

        return 0;
    }

    // Process Shopping Cart
    public void processCart(productList pList){
       
        // Shopping Cart
        for (Cart c: cartList){

            Iterator<products> prodIt = pList.getProduct();

            // Product List
            while (prodIt.hasNext()){

                products  pL = prodIt.next();

                // If Product List Have Enought Quantity
                if(c.getproductName().equals(pL.getProductName()) && c.getQuantity() <= pL.getQuantity() ){
                    
                   int num = (pL.getQuantity() - c.getQuantity());

                   totalPrice += (c.getPrice() * c.getQuantity());

                   // Update Quantity In Product List
                   pL.setQuantity(num);

                   break;
                }

                // If There Isn't Enought Quantity In Product List
                if(c.getproductName().equals(pL.getProductName()) && c.getQuantity() > pL.getQuantity()){
                    
                    int num1 = (c.getQuantity() - pL.getQuantity());

                    totalPrice += (c.getPrice() * c.getQuantity());

                    Math.abs(num1);
                    
                    pL.setQuantity(0);

                    c.putIntoWaitList(c.getproductName(), num1);

                    // Put Into WaitList
                    waitList.add(c);

                    break;
                }
            }
        } 

        // Remove Cart
        cartList.clear();
    }

    // Display All Wait List
    public void displayWList(){

        for (Cart c : waitList) 
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

    // Is WaitList Empty?
    public int checkWaitList(){
        if (waitList.isEmpty())
            return 1;
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
    public Iterator getwaitList() { return waitList.iterator(); }

    @Override
    public String toString(){ return this.productName + " " + this.Quantity + "  " + this.Price + " " + this.PriceTotal; }
}




