import java.io.*;
import java.util.*;
import java.lang.*;

public class ClientList implements Serializable{

    private List<Client> clientList = new LinkedList<Client>();

    private int index;

    // Add Client Object 
    public void insertClientInfo(Client l) {clientList.add(l);}
    
    // Display All Client Information
    public void displayAllClient(){

        for (Client c : clientList) 
            System.out.println(c);
    } 

    // Search For Client
    public Client searchClient(String find){

        for (Client c : clientList) 
            if(c.getClientName().equals(find))
                return c;  
        
        return null;
    }

}


