import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Stage 2 Client, ClientList, Cart, Transaction Test
public class TestStage2 {
   
    public static void main(String[] args){
        
        String pName, pQuantity, response;

        int productFound = 0, quantity;

        Scanner in = new Scanner(System.in);

        // Client
        Client a = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        // Shopping Cart
        Cart b = new Cart("Pen", "12.32", "14", "172.48");

        Cart c = new Cart("Apple", "15.32", "12", "183.84");

        Cart f = new Cart("Notebook", "2.23", "14", "32.48");


        // Product
        products g = new products( "Tom", "Pen", "Box of Pen", 12.32, 100);

        products h = new products("Tom", "Apple", "Bag of Apple", 15.32, 100);

        products i = new products("Tom", "Notebook", "Notebook 80 Sheet", 2.23, 100);

        products m = new products("Tom", "Computer", "A Machine To Do Cool Stuff", 599.99, 15);

        // Product List
        productList j = new productList();

        // Client List
        ClientList d = new ClientList();

        // Client List
        d.insertClientInfo(a);

        // Product List
        j.addProduct(g);
        j.addProduct(h);
        j.addProduct(i);
        j.addProduct(m);

        // Shopping Cart
        b.insertItemToCart(b);
        b.insertItemToCart(c);
        b.insertItemToCart(f);

        // Display Shopping Cart
        b.displayAllCart();

        // Display Product List
        j.displayAllProductList();

        // Search For A Client
        System.out.print("Please Enter The Product Name To Update The Cart: ");
        pName = in.nextLine();

        System.out.print("Please Enter The Product Quantity To Update The Cart: ");
        pQuantity = in.nextLine();
        
        // Is Product In Shopping Cart
        productFound = b.updateCart(pName, pQuantity);

        if(productFound == 1)
            b.displayAllCart();

        // Product Not In Shopping Cart
        if (productFound == 0){

            // Search for price
            double temp = j.searchCart(pName);

            String s = Double.toString(temp);

            // Cart(String productName, String Price, String Quantity, String PriceTotal)
            Cart l = new Cart(pName, s, pQuantity, "1,199.98");
            b.insertItemToCart(l);

            b.displayAllCart();

        }

        //check if product quantity is enough
        System.out.println("Check Quantity: Enter product name");
        pName = in.nextLine();
        products product = j.searchProduct(pName);


        System.out.println("Product " + pName + " has " + j.getQuantity(product) + " Quantities\n");
        System.out.println("would you like to decrease the quantity? ");
        response = in.nextLine();

        if(response.equals("yes"))
        {
            System.out.println("enter the new quantity: ");
            quantity = in.nextInt();
            product.setQuantity(quantity);

            System.out.println("Product " + pName + " has " + j.getQuantity(product) + " Quantities\n");
        }
        else
        {
            System.out.println("Done");
        }
        in.close();

    }

}
