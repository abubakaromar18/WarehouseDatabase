import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ClientMenuState {

    // Menu
    public int menu(){

        int choice;

        System.out.println("\nCLIENT MENU");
        System.out.println("=============");
        System.out.println("Please Choose An Option Below: ");
        System.out.println("Enter 1 To Show Client Information.");
        System.out.println("Enter 2 To Show List Of Products.");
        System.out.println("Enter 3 To Show Client Transaction.");
        System.out.println("ENter 4 To Add Item To Shopping Cart.");
        System.out.println("Enter 5 To Display The Shopping Cart: ");
        System.out.println("Enter 6 To Modify Client Shopping Cart.");
        System.out.println("Enter 7 To Return To Login. ");
        System.out.println("Enter 0 To Exit.");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();

        return choice;
    }

    // Add Item To Shopping Cart
    public void shoppingCart(ClientList cList, Cart client, productList pList){

        String pName; 
        char choice;

        int quantity;
        
        Scanner in = new Scanner(System.in);

        // Show Client A List Of Product
        System.out.println("BELOW IS A LIST OF PRODUCTS: ");
        System.out.println("============================");
        pList.displayAllProductList();
      
        System.out.print("Enter The Product Name To Add To The Shopping Cart: ");
        pName = in.nextLine();

        System.out.print("Enter The Product Quantity To Add To The Shopping Cart: ");
        quantity = in.nextInt();

        // Search For Product + Return Product Price
        pList.searchCartPrice(pName);
    
        Cart c = new Cart(pName, quantity, pList.searchCartPrice(pName), quantity * pList.searchCartPrice(pName));

        // Add To Shopping Cart
        client.insertItemToCart(c);

        System.out.print("Would You Like To Add Additional Product To The Shopping Cart: Enter Y/y For Yes N/n For No: ");
        choice = in.next().charAt(0);

        while(choice == 'Y' || choice == 'y'){

            Scanner ins = new Scanner(System.in);

            System.out.print("Enter The Product Name To Add To The Shopping Cart: ");
            pName = ins.nextLine();

            System.out.print("Enter The Product Quantity To Add To The Shopping Cart: ");
            quantity = ins.nextInt();

            Cart c1 = new Cart(pName, quantity, pList.searchCartPrice(pName), quantity * pList.searchCartPrice(pName));

            client.insertItemToCart(c1);

            System.out.print("Would You Like To Add Additional Product To The Shopping Cart: Enter Y/y For Yes N/n For No: ");
            choice = in.next().charAt(0);
        }

        // Set Client Balance: USE THIS METHOD FOR LATER STAGE
        //cList.setCBalance("John", client.cartTotal());

    }
    
    // Menu Option
    public void option(ClientMenuState clientMenu, ClientList cList, productList pList, Cart clientCart, String clientName){

        Scanner ins = new Scanner(System.in);

        int chosen = clientMenu.menu();

        while (chosen != 0){

            switch(chosen){
                // Show Client Information
                case 1: 
                    System.out.println(cList.searchClient(clientName));
                    chosen = menu(); 
                    break;
                // Show Product List
                case 2:
                    System.out.println("PRODUCT LIST");
                    System.out.println("============");
                    pList.displayAllProductList();
                    chosen = menu(); 
                    break;
                // Show Client Transaction
                case 3:
                    chosen = menu(); 
                    break; 
                // Add Item To Shopping Cart    
                case 4:
                    clientMenu.shoppingCart(cList, clientCart, pList);
                    chosen = menu(); 
                    break;
                // Display Shopping Cart
                case 5:
                    clientCart.displayAllCart();
                    chosen = menu();  
                    break;
                // Modify Shopping Cart
                case 6: 
                    chosen = menu();
                    break;
                case 7:
                    Login.option();
                    break;
                default :
                    System.out.println("Invaild Entry");
                    break;
            }
        }
    }

    public static void InClient(){

        ClientMenuState clientMenu = new ClientMenuState();
        ClientList cList = Login.cListObj();
        productList pList = Login.pListObj();
        Cart cart = new Cart("",0,0,0);
        Cart clientCart = cart; 

        clientMenu.option(clientMenu, cList, pList, clientCart, "John");

    }
    
}
