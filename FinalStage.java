public class FinalStage {
    public static void main(String[] args){

        /* Question 1 */


        /* Question 2 */


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



        /* Question 17 */


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
