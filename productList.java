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

    // Update Cart: Search Product Price + Return Product Price
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

    public void checkQuantity()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Check Quantity: Enter product");
        String pName = in.nextLine();
        products product = searchProduct(pName);


        System.out.println("Product " + pName + " has " + product.getQuantity() + " Quantities\n");
        System.out.println("would you like to decrease the quantity? ");
        String response = in.nextLine();

        if(response.equals("yes"))
        {
            System.out.println("enter the new quantity: ");
            int quantity = in.nextInt();
            product.setQuantity(quantity);

            System.out.println("Product " + pName + " has " + product.getQuantity() + " Quantities\n");
        }
        else
        {
            System.out.println("Done");
        }

        in.close();
    }

    public boolean setQuantity(products p, int quantity){
        p.setQuantity(quantity);
        return true;
    }
    
    public Iterator getProduct(){
        return pList.iterator();
    }


    public int getQuantity(){
        return getQuantity();
    }

    public String toString() {
        return pList.toString();
    }
}
