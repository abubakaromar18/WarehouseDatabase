import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.Format;

public class Client{
    
    private String name;
    private String address;
    private String phone;
    private String clientID;

    // Constructor
    public Client(String name, String address, String phone, String clientID){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.clientID = clientID;
    }
    
    public String returnClientName(){
        return name; 
    }

    public String returnClientAddress(){
        return address;
    }

    public String returnClientPhone(){
        return phone;
    }

    public String returnClientID(){
        return clientID;
    }

    @Override
    public String toString(){ return this.name+ "  " + this.address + " " + this.phone + "  " + this.clientID; }

}

