import java.util.Scanner;

public class Login {

    public static ClientList cList;
    public static productList pList;
    public static Client client; 

    public static Client clientObject() {return client; };
    public static ClientList cListObj() {return cList; }; 
    public static productList pListObj() {return pList; };

    // UI Menu
    public int menu(){

        int choice;

        System.out.println("\nUI: ");
        System.out.println("====");
        System.out.println("Please Choose An Option Below: ");
        System.out.println("Enter 1 For Client");
        System.out.println("Enter 2 For Clerk");
        System.out.println("Enter 3 For Manager");
        System.out.println("Enter 0 To Exit");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();

        return choice;

    }

    public static void option(){

        Login in = new Login();

        int chosen = in.menu();

        while (chosen != 0){

            switch(chosen){
                // Client
                case 1: 
                    break;

                // Clerk
                case 2: ClerkMenuState.InClerk();
                    break;

                // Manager
                case 3:
                    break;

                case 0:
                    break;  
            }
        }


    }

    public static void main(String[] args){

        // Load Database
        LoadData.run(cList, pList);

        // Client, Clerk, Manager Login
        Login.option();

    }
    
}
