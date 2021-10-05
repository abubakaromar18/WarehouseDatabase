import java.util.*;
import java.util.function.Supplier;
import java.io.*;

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
