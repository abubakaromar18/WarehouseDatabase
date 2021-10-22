


import java.util.*;

public class TestStage3 
{

    String pName;

    int productFound = 0, pQuantity = 0;

    Scanner in = new Scanner(System.in);

        // Client
    Client client1 = new Client("Jack", "123 1ST Ave", "(123) 456-8789", "ID1",0);

        // Shopping Cart
    Cart cart1 = new Cart("Pen", 150, 12.35, (12.35 * 14));

    Cart cart2 = new Cart("Apple", 12, 15.32, (15.32 * 12));

    Cart cart3 = new Cart("Notebook", 14, 2.23, (2.23 * 14));

    // Product
    products prod1 = new products("Pen", "PID123", "Box of Pen", 100, 12.32);

    products prod2 = new products("Apple", "PID456", "Bag of Apple", 100, 15.32);

    products prod3 = new products("Notebook","PID789", "Notebook 80 Sheet", 100, 2.23);

    products prod4 = new products("Computer","PID321", "A Machine To Do Cool Stuff", 100, 599.99);

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
    System.out.println("Shopping Cart: ");
    cart1.displayAllCart();

    System.out.println("");

    // Display Product List
    System.out.println("Product List: ");
    pList1.displayAllProductList();

    System.out.println("");

    // Search For A Client
    System.out.print("Please Enter The Product Name To Update The Cart: ");
    pName = in.nextLine();

    System.out.print("Please Enter The Product Quantity To Update The Cart: ");
    pQuantity = in.nextInt();
        
    System.out.println("");
        
    // Is Product In Shopping Cart. If Yes, Update Quantity
    productFound = cart1.updateCart(pName, pQuantity, pList1);

    // Product Is In Shopping Cart. Display Update Cart
    if(productFound == 1)
    {
        System.out.println("Updated Shopping Cart: ");
        cart1.displayAllCart();
    }
    else
        System.out.println("Warehouse Doesn't Carry This Product: " + pName);


    // Process Shopping Cart
    cart1.processCart(pList1);

    // Create Invoice 
    Transaction t1 = new Transaction("T123", "123456", cart1.getTotalPrice());
    t1.insertItemToTransaction(t1);

        
    // Is Cart Empty After Cart Is Process
    if (cart1.CheckEmpty() == 0)
        System.out.println("\nCart Is Not Empty After Processing Shopping Cart!" + "\n");
        
    else
        System.out.println("\nCart Is Empty After Processing Shopping Cart!" + "\n");
        

    // Display All Product List
    System.out.println("Product List After Shopping Cart Is Process : ");
    pList1.displayAllProductList();
        
    // Display Transaction 
    System.out.println("\nTransaction: ");
    t1.displayAllTranscation();


    // Display WaitList
    if (cart1.checkWaitList() == 1)
        System.out.println("\nWait List Is Empty");
    else
    {
        System.out.println("\nWait List Item:");
        cart1.displayWList();
    }

    /* New shipment is recieved, waitlist needs to be updated, and products quanity should be updated */

    System.out.println("New Shippment? Y/N: ");
    Char input = in.nextChar();
    int quanity;

    if(input.toLowerCase().equals('y'))
    {
        Cart temp;
        Iterator<Product> p = cart1.getwaitList();
        while(p.hasNext)
        {
            temp = p.next();
            System.out.println(temp.toString());
            System.out.println("Would you like to full this Item? Y/N");
            input = in.nextChar();
            if(input.toLowerCase().equals("y"))
            {
                System.out.println("Enter the quantity of the shippment: ");
                quanity = in.nextInt();
                if(temp.getQuantity() < quanity)
                {
                    for(products p: pList1)
                    {
                        if(temp.getProductID().equals(p.getProductID()))
                        {
                            int addToInventory = quanity - temp.getQuantity();
                            p.setQuantity(addToInventory);
                            temp.setQuantity(0);
                        }
                    }
                }
                else if(temp.getQuantity() == quanity)
                {
                    temp.setQuantity(0);
                }
                else
                {
                    int remainder = temp.getQuantity() - quanity;
                    temp.setQuantity(remainder);
                }
            }
        }
    }

    
}
