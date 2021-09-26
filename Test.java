import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Client, ClientList, Cart, Transaction Test
public class Test {
   
    public static void main(String[] args){

        String search; 

        Scanner input = new Scanner(System.in);
     
        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Client b = new Client("Lucy", "456 2ND Ave", "(456) 799-1324", "ID2");

        Client c = new Client("Kevin", "789 3Th Ave", "(987) 654-3211", "ID3");

        ClientList d = new ClientList();

        // Insert Client Object
        d.insertClientInfo(a);
        d.insertClientInfo(b);
        d.insertClientInfo(c);

        // Display All Client
        d.displayAllClient();  

        // Search For A Client
        System.out.print("Enter The Client Name, Address Or ID To Search: ");
        
        search = input.nextLine();

        System.out.println("The Cleint Information You Are Looking For Is: " + d.searchClient(search));

       Cart e = new Cart("Pen", "Jack", "ID1", "12.32", "14", "100.32");

       Cart f = new Cart("Apple", "Lucy", "ID2", "15.32", "12", "456");

       


    }

}




 
