import java.util.*;
import java.util.function.Supplier;
import java.io.*;

public class productList{

    private List<products> pList = new LinkedList<products>();
    private static productList ProductList;

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

    // Update Cart: Search Product + Return Product Price
    public double searchCart(String find){

        for (products a : pList) 
            if(a.getProductName().equals(find))
                return a.getCostPrice();  
        
        return 0;
    }

    public boolean addProduct(products p)
    {
        pList.add(p);
        return true;
    }
    public boolean removeProduct(products p)
    {
        pList.remove(p);
        return true;
    }
    
    public Iterator getProduct(){
        return pList.iterator();
    }

    public String toString() {
        return pList.toString();
      }
}
