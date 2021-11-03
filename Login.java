import java.util.Scanner;

public class Login {

    public static ClientList cList = new ClientList();
    public static productList pList =  new productList();
    public static Client client = new Client("", "", "", "", 0); 

    public static Client clientObject() {return client; };
    public static ClientList cListObj() {return cList; }; 
    public static productList pListObj() {return pList; };

    String cName, cID; 
    Client cReference; 


    public void clientLog(String Name, String ID, Client Reference){
        this.cName = Name;
        this.cID = ID; 
        this.cReference = Reference;
    }

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

    // User Pick An Option
    public static void option(){

        Login in = new Login();

        int chosen = in.menu();

        while (chosen != 0){

            switch(chosen){
                // Client
                case 1: 
                    ClientMenuState.InClient();
                    break;

                // Clerk
                case 2:
                    break;

                // Manager
                case 3:
                    break;
                default :
                    System.out.println("Invaild Entry");
                    break;
            }
        }


    }

    public static void main(String[] args){

        // Load Database Contain Client List + Product List
        LoadData.run(cList, pList);

        // Client, Clerk, Manager Login
        Login.option();

    }
    
}
