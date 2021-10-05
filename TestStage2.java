import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Stage 2 Client, ClientList, Cart, Transaction Test
public class TestStage2 {
   
    public static void main(String[] args){
        
        String input, input2;

        Scanner in = new Scanner(System.in);

        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        Cart b = new Cart("Pen", "12.32", "14", "172.48");

        Cart c = new Cart("Apple", "15.32", "12", "183.84");

        Cart f = new Cart("Notebook", "2.23", "14", "32.48");

        products g = new products( "Tom", "Pen", "Box of Pen", 12.32, 100);

        products h = new products("Tom", "Apple", "Bag of Apple", 15.32, 100);

        products i = new products("Tom", "Notebook", "Notebook 80 Sheet", 2.23, 100);

        productList j = new productList();

        ClientList d = new ClientList();

        // Client List
        d.insertClientInfo(a);

        // Product List
        j.addProduct(g);
        j.addProduct(h);
        j.addProduct(i);

        // Shopping Cart
        b.insertItemToCart(b);
        b.insertItemToCart(c);
        b.insertItemToCart(f);

        // Display Shopping Cart
        b.displayAllCart();

        j.displayAllProductList();

        // Search For A Client
        System.out.print("Please Enter The Product Name To Update The Cart: ");
        input = in.nextLine();

        System.out.print("Please Enter The Product Name To Update The Cart: ");
        input2 = in.nextLine();
        b.updateCart(input, input2);

    }

}
