import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Stage 1 Client, ClientList, Cart, Transaction Test
public class TestStage1 {
   
    public static void main(String[] args){
        
        String input;

        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Client b = new Client("Lucy", "456 2ND Ave", "(456) 799-1324", "ID2");

        Cart e = new Cart("Pen", 12.32, 14, 100);

        Cart f = new Cart("Apple", 15.32, 12, 456);

        Transaction g = new Transaction("ID456", "A123264", 152.32);

        Transaction h = new Transaction("ID789", "A98764", 1542.23);

        ClientList d = new ClientList();


        // Inset Class Object To Vector
        d.insertClientInfo(a);
        d.insertClientInfo(b);

        e.insertItemToCart(e);
        e.insertItemToCart(f);

        g.insertItemToTransaction(g);
        g.insertItemToTransaction(h);


        // Display Information
        d.displayAllClient();  
        e.displayAllCart();
        g.displayAllTranscation();


        // Search For A Client
        System.out.print("Please Enter The Client Name To Search For A Client: ");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        System.out.println("The Person You Are Looking For Is: " + d.searchClient(input));

        // Search For A Shopping Cart
        System.out.print("Please Enter The Product Name To Search For The Shopping Cart: ");
        input = in.nextLine();
        System.out.println("The Shopping Cart Contain The Following Information: " + e.searchCart(input));

        // Search For A Transaction 
        System.out.print("Please Enter The Transaction ID, Order Number To Search For A Transaction: ");
        input = in.nextLine();
        System.out.println("The Transaction Information Is: " + g.searchTransaction(input));
   
    }

}






 
