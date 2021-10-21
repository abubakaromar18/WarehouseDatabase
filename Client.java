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
    public String getClientName(){ return cName; }
    public String getClientAddress(){ return cAddress; }
    public String getClientPhone(){ return cPhone; }
    public String getClientID(){ return clientID; }

    // Setter
    public void setCName(String cName) { this.cName = cName; }
    public void setCAddress(String cAddress) { this.cAddress = cAddress; }
    public void setCPhone(String cPhone) { this.cPhone = cPhone; }
    public void setCID(String cID) { this.clientID = cID; }

    @Override
    public String toString(){ return this.cName+ "  " + this.cAddress + " " + this.cPhone + "  " + this.clientID; }

}

