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

    // Remove Client
    public Client removeClient(String find){

        for (Client c : list) 
            if(c.returnClientName().equals(find) || c.returnClientAddress().equals(find) || c.returnClientPhone().equals(find)|| c.returnClientID().equals(find))
                list.remove(c);

        return null;
    }

    // Search For Client
    public Client searchClient(String find){

        for (Client c : list) 
            if(c.returnClientName().equals(find) ||c.returnClientAddress().equals(find) || c.returnClientPhone().equals(find) || c.returnClientID().equals(find))
                return c;  
        
        return null;
    }

}


