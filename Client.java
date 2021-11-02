import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.Format;
import java.util.Random;

public class Client{
    
    private String cName;
    private String cAddress;
    private String cPhone;
    private String clientID;
    private double cBalance; 

    // Constructor
    public Client(String cName, String cAddress, String cPhone, String clientID, double balance){
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPhone = cPhone;
        this.clientID = clientID;
        this.cBalance = balance;
    }

    public int numGenerator(){

        Random rand = new Random();

        int randInt1 = rand.nextInt(1000);

        return randInt1;
       
    }

    // Getter
    public String getClientName(){ return cName; }
    public String getClientAddress(){ return cAddress; }
    public String getClientPhone(){ return cPhone; }
    public String getClientID(){ return clientID; }
    public double getClientBalance() {return cBalance; }

    // Setter
    public void setCName(String cName) { this.cName = cName; }
    public void setCAddress(String cAddress) { this.cAddress = cAddress; }
    public void setCPhone(String cPhone) { this.cPhone = cPhone; }
    public void setCID(String cID) { this.clientID = cID; }
    public void setCBalance(double cBalance) {this.cBalance = cBalance; }

    @Override
    public String toString(){ return this.cName+ "  " + this.cAddress + " " + this.cPhone + "  " + this.clientID + " " + this.cBalance; }

}

