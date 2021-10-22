import java.io.*;
import java.util.*;
import java.lang.*;

public class productList{

    private List<products> pList = new LinkedList<products>();

    private static productList ProductList;

    // Add To Product List
    public boolean addProductList(products p){
        pList.add(p);
        return true;
    }

    public static productList instance()
    {
        if(ProductList == null){
            ProductList = new productList();
            return ProductList;
        }
        else{
            return ProductList;
        }
    }

     // Display All Product List
     public void displayAllProductList(){

        for (products c : pList) 
            System.out.println(c);
    } 

    // Search Product Price + Return Product Price
    public double searchCartPrice(String find){

        for (products a : pList) 
            if(a.getProductName().equals(find))
                return a.getCostPrice();  
        
        return 0;
    }

    // Remove Product
    public boolean removeProduct(products p){
        pList.remove(p);
        return true;
    }

    // Search For A Produce
    public products searchProduct(String product){
        
        for (products p : pList) {
            if(p.getProductName().equals(product)){
                return p;
            }
        }
        return null;
    }

    public void checkQuantity(){
        Scanner in = new Scanner(System.in);

        System.out.println("Check Quantity: Enter product");
        String pName = in.nextLine();
        products product = searchProduct(pName);


        System.out.println("Product " + pName + " has " + product.getQuantity() + " Quantities\n");
        System.out.println("would you like to decrease the quantity? ");
        String response = in.nextLine();

        if(response.equals("yes")) {
            System.out.println("enter the new quantity: ");
            int quantity = in.nextInt();
            product.setQuantity(quantity);

            System.out.println("Product " + pName + " has " + product.getQuantity() + " Quantities\n");
        }
        else{
            System.out.println("Done");
        }

        in.close();
    }

    public boolean setQuantity(products p, int quantity){
        p.setQuantity(quantity);
        return true;
    }
    
    public Iterator<products> getProduct() { return pList.iterator(); }

    public int getQuantity() { return getQuantity(); }

    public String toString() { return pList.toString();}

    /* New shipment is recieved, waitlist needs to be updated, and products quanity should be updated */
    public void newShipment(Cart cart1, productList pList1)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("New Shippment? YES/NO: ");

        String input = in.next();
        int quanity;

        Cart tempC;
        products tempP;

        Iterator<Cart> c = cart1.getWaitList();
        Iterator<products> p = pList1.getProduct();

        while(c.hasNext())
        {
            tempC = c.next();
            System.out.println(tempC.toString());
            System.out.println("Would you like to full this Item? YES/NO");
            input = in.next();
            if(input.toLowerCase().equals("yes"))
            {
                System.out.println("Enter the quantity of the shippment: ");
                quanity = in.nextInt();
                if(tempC.getQuantity() < quanity)
                {
                    while(p.hasNext())
                    {
                        tempP = p.next();
                        if(tempC.getproductName().equals(tempP.getProductName()))
                        {
                            int addToInventory = quanity - tempC.getQuantity();
                            tempP.setQuantity(addToInventory);
                            tempC.setQuantity(0);

                            System.out.println("The Updated values");

                            System.out.println(tempC.toString());
                            System.out.println(tempP.toString());
                        }
                    }
                }
                else if(tempC.getQuantity() == quanity)
                {
                    tempC.setQuantity(0);

                    System.out.println("The Updated values");
                    System.out.println(tempC.toString());
                }
                else
                {
                    int remainder = tempC.getQuantity() - quanity;
                    tempC.setQuantity(remainder);

                    System.out.println("The Updated values");
                    System.out.println(tempC.toString());
                }
            }
        }
        in.close();
    }
        
}

