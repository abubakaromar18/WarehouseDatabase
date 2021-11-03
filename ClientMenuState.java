import java.util.Scanner;

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
        System.out.println("Enter 5 To Modify Client Shopping Cart.");
        System.out.println("Enter 0 To Exit.");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();

        return choice;
    }

    // Menu Option
    public void option(ClientMenuState clerkManu, ClientList clist, Client c){

        Scanner ins = new Scanner(System.in);

        int chosen = clerkManu.menu();

        while (chosen != 0){

            switch(chosen){
                // Show Client Information
                case 1: 
                   
                    break;
                // Show Product List
                case 2:
                    break;
                // Show Client Transaction
                case 3:
                 
                    break; 
                // Add Item To Shopping Cart    
                case 4:
                    break;
                // Modify Client Shopping Cart
                case 5: 
                    break;
                case 0:
                    break;  
            }
        }
    }

    
    public static void main(){

        ClientMenuState one = new ClientMenuState();

        ClientList cList = Login.cListObj();

        Client cClient = Login.clientObject();

        one.option(one, cList, cClient);


    }
    
}
