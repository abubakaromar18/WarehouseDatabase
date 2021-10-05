import java.util.*;
import java.io.*;
import java.lang.*;

public class products {
    private String supplierName;
    private String productName;
    private String description;
<<<<<<< HEAD
    private double costPrice;
    private String productID;

    public products(String sName, String pName, String descipt, double cPrice)
=======
    private float costPrice;
    private int quantity;
    private String productID;

    public products(String sName, String pName, String descipt, float cPrice, int quantity)
>>>>>>> cf477d1134edc2d85baf3f7311601d123fefd386
    {
        this.supplierName = sName;
        this.productName = pName;
        this.description = descipt;
        this.costPrice = cPrice;
        this.quantity = quantity;
    }

    //setters
    public void setSupplier(String sName){
        this.supplierName = sName;
    }
    public void setProduct(String pName){
        this.productName = pName;
    }
    public void setDescription(String productDescription){
        this.description = productDescription;
    }
    public void setCostPrice(float cPrice){
        this.costPrice = cPrice;
    }
    public void setProductID(String pID)
    {
        this.productID = pID;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    
    //getters
    public String getProductID(){
        return productID;
    }
    public String getSupplierName(){
        return supplierName;
    }

    public String getProductName(){
        return productName;
    }
    
    public String getDescription(){
        return description;
    }
    public double getCostPrice(){
        return costPrice;
    }
    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return "Supplier Name "+ supplierName + 
        "Product Name" + productName + 
        "Product ID" + productID +
        "Product Description" + description + 
        "Cost Price" + costPrice;
    }
}
