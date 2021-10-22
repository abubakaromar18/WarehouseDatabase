import java.util.*;
import java.io.*;

public class FinalStage {

    // Accept Payment From Client
    public void acceptPayment(ClientList clist, Cart cart1, String cName, double amountPay){
    
        int n = cart1.acceptPayment(amountPay, cart1);
            if (n == 0){
                clist.setCBalance(cName, cart1.getTotalPrice());
                System.out.println("Name: " + clist.searchClient(cName) + "\n" + "Cart Balance: $" + cart1.getTotalPrice());
            }
            else
                clist.setCBalance(cName, cart1.cartTotal());
    }

    public static void main(String[] args){

        FinalStage f1 = new FinalStage();

        /* Question 1 */
		Client c1= new Client("John","21 Ave SE", "736-345-4434", "03949", 0);
        Client c2= new Client("Mike","7th Ave SE", "493-948-5039", "34283", 0);
        Client c3= new Client("Emily","2088 3rd Ave NE", "459-394-3984", "49582", 0);
        Client c4= new Client("Tim","864 2th Ave S", "073-895-5938", "93029", 0);
        Client c5= new Client("Paul","212 Ave N", "304-683-1647", "95827", 0);
        Client c6= new Client("Ken","468 8th Ave", "594-474-5920", "62456", 0);
        Client c7= new Client("Tom","2100 2th Ave", "968-483-2648", "68798", 0);
        Client c8= new Client("Fray","956 9th Ave NE", "485-960-4839", "12584", 0);
        Client c9= new Client("Jack","39932 3rd Ave SE", "990-594-9483", "32855", 0);
        Client c10= new Client("Miku","Milkyroad 2453 N", "445-839-4060", "10552", 0);

        /* Question 2 */
        System.out.println("\nCLIENT LIST: ");
		ClientList clist = new ClientList();
        clist.insertClientInfo(c1);
        clist.insertClientInfo(c2);
        clist.insertClientInfo(c3);
        clist.insertClientInfo(c4);
        clist.insertClientInfo(c5);
        clist.insertClientInfo(c6);
        clist.insertClientInfo(c7);
        clist.insertClientInfo(c8);
        clist.insertClientInfo(c9);
        clist.insertClientInfo(c10);

        clist.displayAllClient();

        /* Question 3 */
        products prod1 = new products("Pen","P1245", "Ball-point Pen", 100, 1.75 );
        products prod2 = new products("NoteBook","P3267", "College Ruled 80 page", 200, 3.75 );
        products prod3 = new products("Backpack","P1795", "8 Pocket Backpack", 250, 34.99 );
        products prod4 = new products("Planners","P1345", "2021 Daily Planner", 100, 12.99 );
        products prod5 = new products("Pencil","P1655", "No.7 Pencil", 150, 1.75 );
        products prod6 = new products("Sharpener","P2135", "Electrical Sharpener", 50, 7.99 );
        products prod7 = new products("Folders", "P2897", "2 Pocket Folder", 150, 2.50);
        products prod8 = new products("Binder","P6455", "2 inch Binder", 125, 4.99 );
        products prod9 = new products("Highlighter","P3657", "8 Pack Multi-Color", 0, 5.49 );
        products prod10 = new products("Calculator","P4526", "TI-84 Graphing Calculator", 20, 114.99 );


        /* Question 4 */
        productList inventory = new productList();
        inventory.addProductList(prod1);
        inventory.addProductList(prod2);
        inventory.addProductList(prod3);
        inventory.addProductList(prod4);
        inventory.addProductList(prod5);
        inventory.addProductList(prod6);
        inventory.addProductList(prod7);
        inventory.addProductList(prod8);
        inventory.addProductList(prod9);
        inventory.addProductList(prod10);
        
        
        /* Question 5 */
        Supplier sup1 = new Supplier("5892","Ben","address1");
        Supplier sup2 = new Supplier("7442","Adam","address2");
        Supplier sup3 = new Supplier("3707","David","address3");
        Supplier sup4 = new Supplier("9666","Annie","address4");
        Supplier sup5 = new Supplier("1796","Jenny","address5");
        Supplier sup6 = new Supplier("2102","Cathy","address6");
        Supplier sup7 = new Supplier("4487","Thomas","address7");
        Supplier sup8 = new Supplier("8985","Jackson","address8");
        Supplier sup9 = new Supplier("9698","Cathrine","address9");
        Supplier sup10 = new Supplier("2233","Amy","address10");

        SupplierList supplierList = new SupplierList();
        supplierList.addSupplier(sup1);
        supplierList.addSupplier(sup2);
        supplierList.addSupplier(sup3);
        supplierList.addSupplier(sup4);
        supplierList.addSupplier(sup5);
        supplierList.addSupplier(sup6);
        supplierList.addSupplier(sup7);
        supplierList.addSupplier(sup8);
        supplierList.addSupplier(sup9);
        supplierList.addSupplier(sup10);

       
        /* Question 6 */
        Iterator<?> allSupplier = supplierList.getSupplierList();
        System.out.println("\n-----Suppliers listed-----");
    	while(allSupplier.hasNext()) {
    		Supplier supplier = (Supplier) allSupplier.next();
    		System.out.println(supplier.toString());
    	}
        
      
        /* Question 7 */
        Cart cart1 = new Cart("Pen", 10, 1.75, (1.75 * 10));
        Cart cart2 = new Cart("Folders", 10, 2.5, (2.50 * 10));
        Cart cart3 = new Cart("Backpack", 10, 34.99, (34.99 * 10));
        Cart cart4 = new Cart("Sharpener", 10, 7.99, (7.99 * 10));
        Cart cart5 = new Cart("Calculator", 10, 114.99, (114.99 * 10));

        // Client 1 Shopping Cart
        Cart client1Cart = cart1; 
        cart1.insertItemToCart(cart1);
        cart1.insertItemToCart(cart2);
        cart1.insertItemToCart(cart3);
        cart1.insertItemToCart(cart4);
        cart1.insertItemToCart(cart5);
       

        // Client 2 Shopping Cart
        Cart client2Cart = cart2; 
        cart2.insertItemToCart(cart1);
        cart2.insertItemToCart(cart3);
        cart2.insertItemToCart(cart4);
        cart2.insertItemToCart(cart5);
       

        // Client 3 Shopping Cart
        Cart client3Cart = cart3; 
        cart3.insertItemToCart(cart1);
        cart3.insertItemToCart(cart3);
        
      
        // Client 4 Shopping Cart
        Cart client4Cart = cart4; 
        cart4.insertItemToCart(cart4);
        cart4.insertItemToCart(cart5);

        // Client 5 Shopping Cart
        Cart client5Cart = cart5; 
       

        System.out.println("\nCLIENT 1 SHOPPING CART:");
        cart1.displayAllCart();

        // Update Client 1 Shopping Cart
        client1Cart.updateCart("Pen", 250, inventory);
        client1Cart.updateCart("Folders", 150, inventory);
        client1Cart.updateCart("Sharpener", 112, inventory);
        int productFound = client1Cart.updateCart("Calculator", 130, inventory);

        // Display Client 1 Updated Shopping Cart
        if(productFound == 1){
            System.out.println("\nCLIENT 1 UPDATED SHOPPING CART: ");
            client1Cart.displayAllCart();

        }
        else
            System.out.println("\nWarehouse Doesn't Carry This Product: ");
        
        /* Question 8 */
        System.out.println("\nINVENTORY LIST:");
        inventory.displayAllProductList();

        
        

        /* Question 9 */
        System.out.println("\nCLIENT WITH/WITHOUT BALANCE: ");
        System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + client1Cart.cartTotal());
        System.out.println("Name: " + clist.searchClient("Mike") + "\n" + "Cart Balance: $" + client2Cart.cartTotal());
        System.out.println("Name: " + clist.searchClient("Emily") + "\n" + "Cart Balance: $" + client3Cart.cartTotal());
        System.out.println("Name: " + clist.searchClient("Tim") + "\n" + "Cart Balance: $" + client4Cart.cartTotal());
        System.out.println("Name: " + clist.searchClient("Paul") + "\n" + "Cart Balance: $" + client5Cart.cartTotal());

        /* Question 10 */
        Transaction transID=new Transaction("10392", "55345", 1204);
        Transaction transID1=new Transaction("49492", "95823", 5928);
        Transaction transID2=new Transaction("95933", "59696", 1434);
        Transaction transID3=new Transaction("59472", "03452", 6642);
        Transaction transID4=new Transaction("10392", "55345", 1204);
        
        transID.insertItemToTransaction(transID);
        transID.insertItemToTransaction(transID1);
        transID.insertItemToTransaction(transID2);
        transID.insertItemToTransaction(transID3);
        transID.insertItemToTransaction(transID4);

        System.out.println("Client Transaction");
        transID.displayAllTranscation();



        /* Question 11 */
        System.out.println("\nCLIENT WITH UNPAID BALANCE: ");
        clist.setCBalance("John", client1Cart.cartTotal());
        clist.setCBalance("Mike", client2Cart.cartTotal());
        clist.setCBalance("Emily", client4Cart.cartTotal());
        clist.setCBalance("Tim", client4Cart.cartTotal());
        clist.displayCBalance();

        /* Question 12 */
        System.out.println("\nPROCESSING ALL SHOPPING CART: ");
        client1Cart.processCart(inventory);
        client2Cart.processCart(inventory);
        client3Cart.processCart(inventory);
        client4Cart.processCart(inventory);

        System.out.println("\nCLIENT 1 WAITLIST: ");
        client1Cart.displayWList();

        

        /* Question 13 */
        System.out.println("\n-----------List of Products-----------");
        inventory.displayAllProductList();
        System.out.println("--------------------------------------");

        /* Question 14 */
        inventory.newShipment(cart1, inventory);

        /* Question 15 */
        System.out.println("\n-----------List of Products-----------");
        inventory.displayAllProductList();
        System.out.println("--------------------------------------");

        /* Question 16 */
        System.out.println("\nCLIENT WITH UNPAID BALANCE: ");
        clist.displayCBalance();


        /* Question 17 */
        System.out.println("\nPROCESSING PAYMENT! ");
        System.out.println("\nFOLLOWING CLIENT STILL HAVE AMOUNT DUE: ");
        f1.acceptPayment(clist, client1Cart, "John" , 1623);
        f1.acceptPayment(clist, client2Cart, "Mike" , 150);
        f1.acceptPayment(clist, client3Cart, "Emily" , 300);
        f1.acceptPayment(clist, client4Cart, "Tim" , 500);
     
      
    

        /* Question 18 */	
        System.out.println("\nCLIENT WITH UNPAID BALANCE: ");
        clist.displayCBalance();


			/* Question 19 */      
		sup1.AssignProduct(prod1);
		sup6.AssignProduct(prod2);	
		sup9.AssignProduct(prod3);
		System.out.println("\nprice in productlist: \n");
		System.out.println(prod1.getCostPrice() + "\n");
		System.out.println(prod2.getCostPrice() + "\n");
		System.out.println(prod3.getCostPrice() + "\n");
		
		System.out.println("price in Supplierlist: \n");
		System.out.println(sup1.getProductPrice("Pen") + "\n");
		System.out.println(sup6.getProductPrice("NoteBook") + "\n");
		System.out.println(sup9.getProductPrice("Backpack") + "\n");	
        
    
    } 	
    
}
