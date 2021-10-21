import java.util.*;
import java.io.*;
public class Cart {

    private products product;
    private String productName;
    private double Price;
    private int Quantity;
    private double PriceTotal;
    private double totalPrice; 
    private double clientDebt; 

    private List<products> waitList = new LinkedList<products>();

    private List<Cart> cartList = new LinkedList<Cart>();

    public void insertItemToCart(Cart l) {cartList.add(l); }

    public void insertWaitList(products l) { waitList.add(l); }

    private List<Double> cDebt = new LinkedList<Double>();

    public void insertCDebt(Double a) { cDebt.add(a); }

    // Contructor
    Cart(String productName, int Quantity, double Price, double PriceTotal){
        this.productName = productName;
        this.Quantity = Quantity;
        this.Price = Price;
        this.PriceTotal = PriceTotal;
    }

    //WaitList
    void putIntoWaitList(String productName, int Quantity){
        product = new products();
        product.setProduct(productName);
        product.setQuantity(Quantity);
        

        waitList.add(product);

    }

    // Update Shopping Cart
    public int updateCart(String pName, int Q, productList pList){


        Iterator<products> prodIt = pList.getProduct();  


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
                    // waitList.add(c);

                    break;
                }
            }

            c.insertCDebt(totalPrice);
        } 

        // Debt Client
        Cart c1 = new Cart("", 0, 0, 0);
        c1.insertCDebt(totalPrice);

        // Remove Cart
        cartList.clear();
    }

    // Display Client Debt
    public void displayCDebt(){

        for (double c : cDebt) 
            System.out.println(c);
    } 

    // Display All Wait List
    public void displayWList(){

        for (products c : waitList) 
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
    public void setCDebt(double cDebt) {this.clientDebt = cDebt; }


    // Getter
    public double getPriceTotal() { return this.PriceTotal; }
    public String getproductName() { return this.productName;}
    public double getPrice() { return this.Price;}
    public int getQuantity() { return this.Quantity; }
    public double getTotalPrice() { return this.totalPrice; }
    public Iterator getwaitList() { return waitList.iterator(); }
    public double getClientDebt(){return clientDebt; }

    @Override
    public String toString(){ return this.productName + " " + this.Quantity + "  " + this.Price + " " + this.PriceTotal; }
}




