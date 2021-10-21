import java.io.*;
import java.util.*;
import java.lang.*;

public class ClientList{

    private List<Client> clientList = new LinkedList<Client>();

    private int index;

    // Add Client Object 
    public void insertClientInfo(Client l) {clientList.add(l);}
    
    // Display All Client Information
    public void displayAllClient(){

        for (Client c : clientList) 
            System.out.println(c);
    } 

    // Set Client Balance
    public Client setCBalance(String name, double amount){

        for (Client c: clientList){

            if (c.getClientName().equals(name))
                c.setCBalance(amount);
        }
        return null; 
    }

    // Display Client With Balance
    public Client displayCBalance(){

        for (Client c : clientList){
            if (c.getClientBalance() > 0)
                System.out.println(c.getClientName());
        }

        return null; 
    }

    // Search For Client
    public Client searchClient(String find){

        for (Client c : clientList) 
            if(c.getClientName().equals(find))
                return c;  
        
        return null;
    }

}


