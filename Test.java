import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Client, ClientList, Cart, Transaction Test
public class Test {
   
    public static void main(String[] args){
        String input;

        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Client b = new Client("Lucy", "456 2ND Ave", "(456) 799-1324", "ID2");

        Cart e = new Cart("Pen", "Jack", "ID1", "12.32", "14", "100");

        Cart f = new Cart("Apple", "Lucy", "ID2", "15.32", "12", "456");

        Transaction g = new Transaction("ID456", "A123264", "152.32");

        Transaction h = new Transaction("ID789", "A98764", "1542.23");

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


        System.out.print("Please Enter Client Name, Address, Phone number, or ID to search for that Client");
        Scanner in= new Scanner(System.in)
        input = in.nextline();

       System.out.println("The Person You Are Looking For Is: " + d.searchClient(input))


       System.out.print("Please Enter Client Name, Product Name, or ID to search for that Cart");
        Scanner in= new Scanner(System.in)
        input = in.nextline();

       System.out.println("The Person You Are Looking For Is: " + e.searchCart(input))

       System.out.print("Please Enter Transaction ID, Order Number");
        Scanner in= new Scanner(System.in)
        input = in.nextline();

       System.out.println("The Person You Are Looking For Is: " + g.searchTransaction(input))

       
        
        
    }

}






 
