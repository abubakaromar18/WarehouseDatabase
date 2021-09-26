import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Vector;

public class ClientList{

    private Vector<Client> clientList = new Vector<Client>();

    private int index;

    // Add Client Object 
    public void insertClientInfo(Client l) {clientList.addElement(l);}
    
    // Display All Client Information
    public void displayAllClient(){

        for (Client c : clientList) 
            System.out.println(c);
    } 

    // Search For Client
	// Test TESt
    public Client searchClient(String find){

        for (Client c : clientList) 
            if(c.setClientName().equals(find) ||c.setClientAddress().equals(find) || c.setClientPhone().equals(find) || c.setClientID().equals(find))
                return c;  
        
        return null;
    }

}


