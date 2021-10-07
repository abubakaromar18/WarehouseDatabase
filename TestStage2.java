import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

// Stage 2 Client, ClientList, Cart, Transaction Test
public class TestStage2 {
   
    public static void main(String[] args){
        
        String pName;

        int productFound = 0, pQuantity = 0;

        Scanner in = new Scanner(System.in);

        // Client
        Client client1 = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1");

        // Shopping Cart
        Cart cart1 = new Cart("Pen", 12.32, 14, 172.48);

        Cart cart2 = new Cart("Apple", 15.32, 12, 183.84);

        Cart cart3 = new Cart("Notebook", 2.23, 14, 32.48);


        // Product
        products prod1 = new products( "Tom", "Pen", "PID123", "Box of Pen", 12.32, 100);

        products prod2 = new products("Tom", "Apple", "PID456", "Bag of Apple", 15.32, 100);

        products prod3 = new products("Tom", "Notebook","PID789", "Notebook 80 Sheet", 2.23, 100);

        products prod4 = new products("Tom", "Computer","PID321", "A Machine To Do Cool Stuff", 599.99, 15);

        // Product List
        productList pList1 = new productList();

        // Client List
        ClientList cList1 = new ClientList();

        // Insert Client List
        cList1.insertClientInfo(client1);

        // Product List
        pList1.addProductList(prod1);
        pList1.addProductList(prod2);
        pList1.addProductList(prod3);
        pList1.addProductList(prod4);

        // Insert Shopping Cart
        cart1.insertItemToCart(cart1);
        cart1.insertItemToCart(cart2);
        cart1.insertItemToCart(cart3);

        // Display Shopping Cart
        cart1.displayAllCart();

        System.out.println("");

        // Display Product List
        pList1.displayAllProductList();

        // Search For A Client
        System.out.print("Please Enter The Product Name To Update The Cart: ");
        pName = in.nextLine();

        System.out.print("Please Enter The Product Quantity To Update The Cart: ");
        pQuantity = in.nextInt();
        
        System.out.println("");
        
        // Is Product In Shopping Cart
        productFound = cart1.updateCart(pName, pQuantity);

        if(productFound == 1)
            cart1.displayAllCart();

        // Product Not In Shopping Cart
        if (productFound == 0){

            // Search for price
            double temp = pList1.searchCartPrice(pName);

        
            // Cart(String productName, String Price, String Quantity, String PriceTotal)
            Cart l = new Cart(pName, temp, pQuantity , 1199.98);
            cart1.insertItemToCart(l);

            cart1.displayAllCart();

        }

        // Is Shopping Cart Empty?
        if (cart1.CheckEmpty() == 0)
            System.out.println("\nCart Is Not Empty!");

        System.out.println();

        // Process Shopping Card
        cart1.processCart(pList1);

        // Display Shopping Cart
        cart1.displayAllCart();


        //Check Quantity
        /*
        System.out.println("Check Quantity: Enter product");
        pName = in.nextLine();
        products product = pList1.searchProduct(pName);


        System.out.println("Product " + pName + " has " + pList1.getQuantity() + " Quantities\n");
        System.out.println("would you like to decrease the quantity? ");
        String response = in.nextLine();

        if(response.equals("yes"))
        {
            System.out.println("enter the new quantity: ");
            int quantity = in.nextInt();
            product.setQuantity(quantity);

            System.out.println("Product " + pName + " has " + pList1.getQuantity() + " Quantities\n");
        }
        else
        {
            System.out.println("Done");
        }

        in.close();

        */
    }

}
