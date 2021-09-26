import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Client and Client List Test 
public class Test {
   
    public static void main(String[] args){

        String search; 

        Scanner input = new Scanner(System.in);
     
        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Client c = new Client("Lucy", "456 2ND Ave", "(456) 799-1324", "ID2");

        Client d = new Client("Kevin", "789 3Th Ave", "(987) 654-3211", "ID3");

        ClientList b = new ClientList();

        // Insert Client Object
        b.insertClientInfo(a);
        b.insertClientInfo(c);
        b.insertClientInfo(d);

        // Display All Client
        b.displayAllClient();  

        // Search For A Client
        System.out.print("Enter The Client Name, Address Or ID To Search: ");
        
        search = input.nextLine();

        System.out.println("The Cleint Information You Are Looking For Is: " + b.searchClient(search));

        //Remove Client
        b.removeClient("Lucy");

        b.displayAllClient(); 
    }
 
}
