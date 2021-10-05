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

    public boolean setQuantity(products p, int quantity)
    {
        p.setQuantity(quantity);
        return true;
    }
    
    public Iterator getProduct(){
        return pList.iterator();
    }

    public products searchProduct(String product)
    {
        for (products p : pList) 
        {
            if(p.getProductName().equals(product))
            {
                return p;
            }
        }
        return null;
    }

    public int getQuantity(products p)
    {
        return p.getQuantity();
    }

    public String toString() {
        return pList.toString();
    }
}
