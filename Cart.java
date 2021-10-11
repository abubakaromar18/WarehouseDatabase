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

    // Process Shopping Cart
    public void processCart(productList pList){

        Iterator<products> prodIt = pList.getProduct();
       
        // Shopping Cart
        for (Cart c: cartList){

            boolean found = false; 

            System.out.println("Warehouse Has Product 1");

            // Product List
            while (prodIt.hasNext()){

                products  pL = prodIt.next();

                System.out.println("Product " + pL.toString());
                System.out.println("Cart Product " + c.toString());

                System.out.println("Warehouse Has Product 2");

                // If Product List Have Enought Quantity
                if(c.getproductName().equals(pL.getProductName()) && c.getQuantity() <= pL.getQuantity())
                {
                   System.out.println("Warehouse Has Product 3");
<<<<<<< HEAD

                // If Product List Have Enought Quantity
                if(c.getproductName().equals(pL.getProductName()) && c.getQuantity() <= pL.getQuantity() ){

=======
>>>>>>> parent of 77cf1ee (Merge branch 'main' of https://github.com/abubakaromar18/WarehouseDatabase)
                    
                   int num = (pL.getQuantity() - c.getQuantity());

                   // Update Quantity In Product List
<<<<<<< HEAD

=======
>>>>>>> parent of 77cf1ee (Merge branch 'main' of https://github.com/abubakaromar18/WarehouseDatabase)
                   System.out.println(num);
                    pL.setQuantity(num);

                   // Remove Product From Shopping Cart
                   //cartList.remove(c);
<<<<<<< HEAD

                   pL.setQuantity(num);

=======
>>>>>>> parent of 77cf1ee (Merge branch 'main' of https://github.com/abubakaromar18/WarehouseDatabase)

                   // Create Invoice 
                   Transaction t = new Transaction("T123", "123456", num * pL.getCostPrice());
                   t.insertItemToTransaction(t);

                   System.out.println(t.toString());

                   found = true; 

                   break;
                }
            }

            // If There Isn't Enought Quantity In Product List
            if(found == false){
                int wQuantity = c.getQuantity();

                String wProductName = c.getproductName();

                System.out.println("Warehouse Has Product 4");

                // Put Into WaitList
               waitList.add(wQuantity + wProductName);
            }
        }   

        cartList.clear();
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




