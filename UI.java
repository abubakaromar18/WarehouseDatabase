import java.util.Scanner;

public class UI{
    public static void main(String args[])
    {
        Warehouse warehouse = new Warehouse();
        Scanner input = new Scanner(System.in);
        boolean endProgram = false;
        String intro = "Loading Warehouse DataBase ... \n";
        String exit = "Program exiting ... \n";
        
        System.out.println(intro);

        while(!endProgram)
        {
            int option;
            System.out.println(
                "1: Add New Client \n" + 
                "2: Add New Product \n" +
                "3: Add New Supplier \n" +
                "4: Access ShoppingCart \n" +
                "5: Show All Transaction For A Client \n" +
                "6: Request Product Infromation \n" +
                "7: Request List of Oustanding Balance \n" +
                "8: Request List of Purchased Items Not In Stock \n" +
                "9: Exit the DataBase \n" +
                "--------------------------------------------------- \n");

            option = input.nextInt();
            
            switch(option)
            {
                case 1: //add client
                    warehouse.addClient();
                    break;
                case 2: //add product
                    warehouse.addProduct();
                    break;
                case 3: //add supplier
                    warehouse.addSupplier();
                    break;
                case 4: //shopping cart
                    warehouse.accessShoppingCart();
                    break;
                case 5: //List of Products not in stock
                    break;
                case 6: //List Outstanding Balance
                    break;
                case 7: //Show Transactions
                    break;
                case 8: //Request Product Information
                    break;
                case 9: 
                    endProgram = true;
                    break;
                default:
                    System.out.println("The input you provided was not vaild \n");
                    System.out.println("Please try again \n");
                    break;
            }
        }
        input.close();
        System.out.println(exit);
        System.out.println("Bye \n");

    }
}
