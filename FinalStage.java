public class FinalStage {
    public static void main(String[] args){

        /* Question 1 */
		Client c1= new Client("John","21 Ave SE", "736-345-4434", "03949");
        Client c2= new Client("Mike","7th Ave SE", "493-948-5039", "34283");
        Client c3= new Client("Emily","2088 3rd Ave NE", "459-394-3984", "49582");
        Client c4= new Client("Tim","864 2th Ave S", "073-895-5938", "93029");
        Client c5= new Client("Paul","212 Ave N", "304-683-1647", "95827");
        Client c6= new Client("Ken","468 8th Ave", "594-474-5920", "62456");
        Client c7= new Client("Tom","2100 2th Ave", "968-483-2648", "68798");
        Client c8= new Client("Fray","956 9th Ave NE", "485-960-4839", "12584");
        Client c9= new Client("Jack","39932 3rd Ave SE", "990-594-9483", "32855");
        Client c10= new Client("Miku","Milkyroad 2453 N", "445-839-4060", "10552");

        /* Question 2 */
        System.out.println("\nCLIENT LIST: ");
		ClientList clist=new ClientList();
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

        SupplierList db = new SupplierList();
        db.addSupplier(sup1);
        db.addSupplier(sup2);
        db.addSupplier(sup3);
        db.addSupplier(sup4);
        db.addSupplier(sup5);
        db.addSupplier(sup6);
        db.addSupplier(sup7);
        db.addSupplier(sup8);
        db.addSupplier(sup9);
        db.addSupplier(sup10);

       
        /* Question 6 */
        /*Iterator<?> allSupplier = getSupplierList();
        System.out.println("-----Ten Suppliers listed-----");
    	while(allSupplier.hasNext()) {
    		Supplier supplier = (Supplier) allSupplier.next();
    		System.out.println(supplier.toString());
    	}*/
        
      
        /* Question 7 */
        Cart cart1 = new Cart("Pen", 10, 1.75, (1.75 * 10));
        Cart cart2 = new Cart("Folders", 10, 2.5, (2.50 * 10));
        Cart cart3 = new Cart("Backpack", 10, 34.99, (34.99 * 10));
        Cart cart4 = new Cart("Sharpener", 10, 7.99, (7.99 * 10));
        Cart cart5 = new Cart("Calculator", 10, 114.99, (114.99 * 10));

        // Client 1 Shopping Cart
        cart1.insertItemToCart(cart1);
        cart1.insertItemToCart(cart2);
        cart1.insertItemToCart(cart3);
        cart1.insertItemToCart(cart4);
        cart1.insertItemToCart(cart5);

        // Client 2 Shopping Cart
        cart2.insertItemToCart(cart1);
        cart2.insertItemToCart(cart3);
        cart2.insertItemToCart(cart4);
        cart2.insertItemToCart(cart5);

        // Client 3 Shopping Cart
        cart3.insertItemToCart(cart1);
        cart3.insertItemToCart(cart3);
      
        // Client 4 Shopping Cart
        cart4.insertItemToCart(cart4);
        cart4.insertItemToCart(cart5);

        System.out.println("\nCLIENT 1 SHOPPING CART:");
        cart1.displayAllCart();

        // Update Client 1 Shopping Cart
        cart1.updateCart("Pen", 250, inventory);
        cart1.updateCart("Folders", 150, inventory);
        cart1.updateCart("Sharpener", 112, inventory);
        int productFound = cart1.updateCart("Calculator", 130, inventory);

        // Display Client 1 Updated Shopping Cart
        if(productFound == 1){
            System.out.println("\nCLIENT 1 UPDATED SHOPPING CART: ");
            cart1.displayAllCart();

        }
        else
            System.out.println("\nWarehouse Doesn't Carry This Product: ");
        


<<<<<<< HEAD
        /* Question 8 */
        System.out.println("\nINVENTORY LIST:");
        inventory.displayAllProductList();
=======
        /* Question 13 */
        System.out.println("-----------List of Products-----------");
        inventory.displayAllProductList();
        System.out.println("--------------------------------------");
        /* Question 14 */
        
        /* Question 15 */
        System.out.println("-----------List of Products-----------");
        inventory.displayAllProductList();
        System.out.println("--------------------------------------");
>>>>>>> 2240e59b0f42331656ffc4eac0104fb713f62d6e

        /* Question 9 */
        System.out.println("\nCLIENT WITH/WITHOUT BALANCE: ");
        System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + cart1.cartTotal());
        System.out.println("Name: " + clist.searchClient("Mike") + "\n" + "Cart Balance: $" + cart2.cartTotal());
        System.out.println("Name: " + clist.searchClient("Emily") + "\n" + "Cart Balance: $" + cart3.cartTotal());
        System.out.println("Name: " + clist.searchClient("Tim") + "\n" + "Cart Balance: $" + cart4.cartTotal());
        System.out.println("Name: " + clist.searchClient("Paul") + "\n" + "Cart Balance: $" + cart5.cartTotal());

        /* Question 11 */

        /* Question 12 */
        System.out.println("\nPROCESSING ALL SHOPPING CART: ");
        cart1.processCart(inventory);
        cart2.processCart(inventory);
        cart3.processCart(inventory);
        cart4.processCart(inventory);

        System.out.println("\nCLIENT 1 WAITLIST: ");
        cart1.displayWList();

        /* Question 17 */
        System.out.println("\nACCEPTING PAYMENT: ");
        System.out.println("\nFOLLOWING CLIENT STILL HAVE AMOUNT DUE: ");
        int n = cart1.acceptPayment(1623, cart1);
            if (n == 0)
            System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + cart1.getTotalPrice());

        n = cart2.acceptPayment(150, cart2);
            if (n == 0)
            System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + cart2.getTotalPrice());

        n = cart3.acceptPayment(200, cart3);
            if (n == 0)
            System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + cart3.getTotalPrice());

        n = cart4.acceptPayment(500, cart4);
            if (n == 0)
            System.out.println("Name: " + clist.searchClient("John") + "\n" + "Cart Balance: $" + cart4.getTotalPrice());




        /* Question 18 */

        /* Question 18 */       
        
 		/*Iterator<String> Unpaidbalance = getUnpaidbalanceList();
 		if(!Unpaidbalance.hasNext()) {
 			System.out.println("...No client in the list...!!!!");
 		}
 	 	System.out.println("\n-----Client(id) that had unpaid Balance-----");
 	 	while(Unpaidbalance.hasNext()) {
 	 		String id = (String) Unpaidbalance.next();
 	 		System.out.println(id);
 	 	}      */ 
          


        /* Question 19 */

        
    

        




    } 	
        private SupplierList supplierList;
      	private UnpaidBalance UnpaidBalanceList;
  	    /*public Iterator<Supplier> getSupplierList() {
  		    return supplierList.getSupplierList();
    	}
      	public Iterator<String> getUnpaidbalanceList() {
  		    return UnpaidBalanceList.getIterator();
      	}*/
    
}
