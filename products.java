import java.util.*;
import java.io.*;
import java.lang.*;

public class products {
    private String supplierName;
    private String productName;
    private String description;
    private double costPrice;
    private int quantity;
    private String productID;

    public products(){};

    public products(String sName, String pName, String productID, String descipt, double cPrice, int quantity)
    {
        this.supplierName = sName;
        this.productName = pName;
        this.productID = productID;
        this.description = descipt;
        this.costPrice = cPrice;
        this.quantity = quantity;
    }

    // Setters
    public void setSupplier(String sName ){ this.supplierName = sName; }

    public void setProduct(String pName) { this.productName = pName; }

    public void setDescription(String productDescription) { this.description = productDescription; }

    public void setCostPrice(double cPrice) { this.costPrice = cPrice; }

    public void setProductID(String pID) { this.productID = pID; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    
    // Getters
    public String getProductID() { return productID; }

    public String getSupplierName() { return supplierName; }

    public String getProductName() { return productName; }
    
    public String getDescription() { return description; }

    public double getCostPrice() { return costPrice; }

    public int getQuantity() {  return quantity; }

    public String toString(){
        return supplierName + " " + productName + " "+ productID + " "+ description +  " "+ quantity + " " + costPrice; 
    }



}
