import java.util.*;
import java.util.function.Supplier;
import java.io.*;

public class productList{
    private List<products> pList = new LinkedList<products>();
    private static productList ProductList;

    public static productList instance()
    {
        if(ProductList == null)
        {
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
    
    public Iterator getProduct(){
        return pList.iterator();
    }

    public String toString() {
        return pList.toString();
      }
}
