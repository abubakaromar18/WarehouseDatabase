import java.util.*;
public class Warehouse {
    private static Warehouse warehouse;
    ClientList CList = new ClientList();
    SupplierList SList = new SupplierList();
    ProductList PList = new ProductList();
    Scanner in = new Scanner(System.in);

    public static Warehouse instance()
    {
        if(warehouse == null)
        {
            warehouse = new Warehouse();
            return warehouse;
        }
        else
        {
            return warehouse;
        }
    }

    public Boolean FindSupplier(String Sid)
    
    {
        Iterator<Supplier> s = SList.getSupplierList();
        while(s.hasNext())
        {
            if(s.next().getID().equals(Sid))
            {
                return true;
            }
        }
        return false;
    }

    public String RandomID(int i)
    {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        if(i == 1)
        {
            return "C"+ number;
        }
        else if(i == 2)
        {
            return "S" + number;
        }
        else if(i == 3)
        {
            return "P" + number;
        }
        else
        {
            return "0";
        }
    }

    public void addClient()
    {
        System.out.println("Enter Name: ");
        String name = in.nextLine();
        System.out.println("Enter Address: ");
        String address = in.nextLine();
        System.out.println("Enter City: ");
        String city = in.nextLine();
        System.out.println("Enter State: ");
        String state = in.nextLine();

        String id = RandomID(1);

        while(id.equals("0"))
        {
            id = RandomID(1);
        }

        Client c = new Client(id, name, address, city, state);
        if(CList.addClient(c))
        {
            System.out.println("Client was Successfully added! \n");
            System.out.println(c.toString());
        }
        else
        {
            System.out.println("Sorry, something went wrong while adding new client\n");
            System.out.println("Please adding new client again\n");
        }
    }
    
    public void addSupplier()
    {
        System.out.println("Enter Name: ");
        String name = in.nextLine();
        System.out.println("Enter Address: ");
        String address = in.nextLine();
        System.out.println("Enter City: ");
        String city = in.nextLine();
        System.out.println("Enter State: ");
        String state = in.nextLine();

        String id = RandomID(2);

        while(id.equals("0"))
        {
            id = RandomID(2);
        }

        Supplier s = new Supplier(id, name, address, city, state);
        if(SList.addSupplier(s))
        {
            System.out.println("Supplier was Successfully added! \n");
            System.out.println(SList.getSupplier(id).toString());
        }
        else
        {
            System.out.println("Sorry, something went wrong while adding new supplier\n");
            System.out.println("Please adding new supplier again\n");
        }

    }

    public void addProduct()
    {
        System.out.println("Enter Supplier ID: ");
        String Sid = in.nextLine();

        

        if(FindSupplier(Sid))
        {
            System.out.println("Enter Name: ");
            String name = in.nextLine();
            System.out.println("Enter Description: ");
            String description = in.nextLine();
            System.out.println("Enter Quantity: ");
            String quantity = in.nextLine();
            System.out.println("Enter Price: ");
            String price = in.nextLine();

            String id = RandomID(3);

            while(id.equals("0"))
            {
                id = RandomID(3);
            }

            Product p = new Product(Sid, id, name, description, quantity, price);
            if(PList.addProduct(p))
            {
                System.out.println("Product was Successfully added!\n");
                System.out.println(p.toString());
            }
            else
            {
                System.out.println("Sorry, something went wrong while adding new product\n");
                System.out.println("Please adding new product again\n");
            }
        }
        else
        {
            System.out.println("Supplier was not found!");
        }
    }

    public void accessShoppingCart()
    {
        System.out.println("Enter ClientID: ");
        String Pid;
        String Cid = in.nextLine();

        Client c = CList.getClient(Cid);
        Product p;
        try{
        if(c.getID().equals(Cid))
        {
            boolean exit = false;
            int option;
            while(!exit)
            {
                System.out.println("--------------------------------------------------- \n");
                System.out.println("[1: to add Product || 2: Remove Product || 3: Display Cart || 4: Exit]");
                option = in.nextInt();
                switch(option)
                {

                    case 1: //add Product to cart
                        PList.displayProduct();
                        System.out.println("--------------------------------------------------- \n");
                        System.out.println(" or Enter a ProductID: ");
                        Pid = in.nextLine();

                        p = PList.getProduct(Pid);
                        try{
                            if(p.getProductID().equals(Pid))
                            {
                                c.addToCart(p);
                            }
                        } 
                        catch(NullPointerException e)
                        {
                            System.out.println("product was not found. \n");
                        }
                        break;
                    case 2: //Remove Product from cart
                        c.displayCart();
                        System.out.println("--------------------------------------------------- \n");
                        System.out.println(" or Enter a ProductID: ");
                        Pid = in.nextLine();

                        p = PList.getProduct(Pid);

                        try{
                            if(p.getProductID().equals(Pid))
                            {
                                c.addToCart(p);
                            }
                        } 
                        catch(NullPointerException e)
                        {
                            System.out.println("product was not found. \n");
                        }
                        break;
                    case 3: //Print Cart
                        c.displayCart();
                        break;
                    case 4: //Exit
                        exit = true;
                        break;
                    default:
                        break; 
                }
            }
        }
    }
    catch(NullPointerException e)
    {
        System.out.println("Client Not Found");
    }

    }
}
