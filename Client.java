import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.Format;

public class Client{
    
    private String cName;
    private String cAddress;
    private String cPhone;
    private String clientID;

    // Constructor
    public Client(String cName, String cAddress, String cPhone, String clientID){
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPhone = cPhone;
        this.clientID = clientID;
    }

    // Getter
    public void getCName(String cName) { this.cName = cName; }
    
    public void getCAddress(String cAddress) { this.cAddress = cAddress; }

    public void getCPhone(String cPhone) { this.cPhone = cPhone; }

    public void getCID(String cID) { this.clientID = cID; }

    // Setter
    public String setClientName(){ return cName; }

    public String setClientAddress(){ return cAddress; }

    public String setClientPhone(){ return cPhone; }

    public String setClientID(){ return clientID; }

    @Override
    public String toString(){ return this.cName+ "  " + this.cAddress + " " + this.cPhone + "  " + this.clientID; }

}

