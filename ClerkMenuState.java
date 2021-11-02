import java.util.Scanner;

import java.util.Random;

public class ClerkMenuState {

    // Menu
    public int menu(){

        int choice;

        System.out.println("CLERK MENU");
        System.out.println("==========");
        System.out.println("Please Choose An Option Below: ");
        System.out.println("Enter 1 To Add A Client.");
        System.out.println("Enter 2 To Search For A Client.");
        System.out.println("Enter 3 To Display All Client.");
        System.out.println("Enter 4 To Log Out Into The UI/Main Menu.");
        System.out.println("Enter 0 To Exit.");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();

        return choice;
    }

    // Generate Clerk ID
    public static int numGenerator(){

        Random rand = new Random();

        int randInt1 = rand.nextInt(1000);

        return randInt1;

    }
       
    // Add A New Client
    public void addClient(ClientList list1){

        String cName;
        String cAddress;
        String cPhone;
        String clientID;
        double cBalance; 

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Client Name: ");
        cName = in.nextLine();
        
        System.out.println("Enter The Client Address: ");
        cAddress = in.nextLine();

        System.out.println("Enter The Client Phone Number: ");
        cPhone = in.nextLine();

        clientID = String.valueOf(ClerkMenuState.numGenerator());

        Client cOne = new Client(cName, cAddress, clientID, cPhone, 0);

        list1.insertClientInfo(cOne);

    }

    // Menu Option
    public void option(){

        ClerkMenuState clerkManu = new ClerkMenuState();

        ClientList client1 = new ClientList();

        Scanner ins = new Scanner(System.in);

        String cName;

        int chosen = clerkManu.menu();

        while (chosen != 0){

            switch(chosen){
                // Add Client
                case 1: 
                    clerkManu.addClient(client1);
                    chosen = clerkManu.menu();
                    break;
                // Search For Client
                case 2:
                    System.out.println("Enter The Client Name To Search For A Client: ");
                    cName = ins.nextLine();
                    System.out.println(client1.searchClient(cName));
                    chosen = clerkManu.menu();
                    break;
                case 3:
                    System.out.println(client1.displayAllClient());
                    chosen = clerkManu.menu();
                    break; 
                case 4:
                   //Login.main(a);
                case 0:
                    return;  
            }
        }
    }

    // Main 
    public static void InClerk(){

        ClerkMenuState clerk1 = new ClerkMenuState();

        clerk1.option();

    }

}
