import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Vector;

public class ClientList{

    private Vector<Client> list = new Vector<Client>();

    // Add Client Object 
    public void insertClientInfo(Client l) {list.addElement(l);}
    
    // Display All Client Information
    public void displayAllClient(){

        for (Client c : list) 
            System.out.println(c);
     
    } 

    // Search For Client
    public Client searchClient(String find){

        for (Client c : list) 
            if(c.setClientName().equals(find) ||c.setClientAddress().equals(find) || c.setClientPhone().equals(find) || c.setClientID().equals(find))
                return c;  
        
        return null;
    }

}


