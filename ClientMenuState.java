import java.util.Scanner;

public class ClientMenuState {

    
    public void run(){

        String iD; 

        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter The Client ID:");
        iD = in.nextLine();

        ClientList clientOne = new ClientList();
        clientOne.searchClient(iD);

        }

    public static void main(String[] args){


      

    }
    
}
