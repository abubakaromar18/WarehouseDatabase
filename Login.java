import java.util.Scanner;

public class Login {

    // UI Menu
    public int menu(){

        int choice;

        System.out.println("UI: ");
        System.out.println("Please Choose An Option Below: ");
        System.out.println("Enter 1 For Client");
        System.out.println("Enter 2 For Clerk");
        System.out.println("Enter 3 For Manager");
        System.out.println("Enter 0 To Exit");

        Scanner in = new Scanner(System.in);
        choice = in.nextInt();

        return choice;

    }

    public static void main(String[] args){

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
                    return;  
            }
        }
        
    }
    
}
