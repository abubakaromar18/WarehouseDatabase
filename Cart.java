import java.io.PrintStream;
import java.util.*;
import java.util.Random;

public class Cart {

    private String Name;
    private int ID;
    private int Price;
    private int Quantity;
    private int OrderNum;
    private int PriceTotal;
    private List transfer;
    private List transfers;



    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setOrderNumber(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public void setPriceTotal(int PriceTotal) {
        this.PriceTotal = PriceTotal;
    }

    public List getTransfer() {
        return transfer;
    }

    public List getTransfers() {
        return transfers;
    }

    public int getOrderNumber(int OrderNum) {
        return this.OrderNum;
    }

    public int getTotalPrice(int PriceTotal) {
        return this.PriceTotal;
    }

    public String getName() {
        return this.Name;
    }

    public int getID() {
        return this.ID;
    }

    public int getPrice() {
        return this.Price;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public static void main(String[] args) {
        Cart c = new Cart();
        PrintStream stream = new PrintStream(System.out);
        String systeminput;
        int systemprice;
        int Systemidenity;
        int SystemQuantity;
        int endcode = 1;
        int j = 0;
        int i = 0;
        int total = 0;
        boolean check = true;
        

        List books = new LinkedList();
        List prices = new LinkedList();
        List IDnum = new LinkedList();
        List qun = new LinkedList();

        List product = new LinkedList();

        //--------------------------------------------------------------------------------testing product inputs
        while (check) {
            System.out.println("hello Welcome to the Shopping Cart");
            System.out.printf("entering the product name \n");
            Scanner nam = new Scanner(System.in);
            systeminput = nam.next();

            System.out.printf("Enter Price \n");
            Scanner id = new Scanner(System.in);
            systemprice = id.nextInt();

            System.out.printf("Enter ID\n");
            Scanner p = new Scanner(System.in);
            Systemidenity = p.nextInt();

            System.out.printf("Enter Quantity \n");
            Scanner q = new Scanner(System.in);
            SystemQuantity = q.nextInt();
            c.setID(Systemidenity);
            c.setName(systeminput);
            c.setPrice(systemprice);
            c.setQuantity(SystemQuantity);
            c.setPriceTotal(0);


            String getName = c.getName();
            int getID = c.getID();
            int getPrice = c.getPrice();
            int getQuantity = c.getQuantity();

            books.add(i, getName);
            prices.add(i, getID);
            IDnum.add(i, getPrice);
            qun.add(i, getQuantity);


            System.out.println("ID: "+IDnum+""+books+" $"+prices+" Quantity"+qun+"");
            //---------------------------------------------------------------------------menu
            System.out.println("input 1 to remove a product");
            System.out.println("input 2 to add another product");
            System.out.println("input 3 to clear");
            System.out.println("input 4 to go to transactions");
            //System.out.println("input 5 to add another product");
            Scanner w = new Scanner(System.in);
            systemprice = w.nextInt();
            if (systemprice == 1) {                                             //remove
                System.out.println("which row of items do you want to remove");
                Scanner g = new Scanner(System.in);
                Systemidenity = g.nextInt();
                books.remove(Systemidenity);
                product.remove(Systemidenity);
                prices.remove(Systemidenity);
                IDnum.remove(Systemidenity);
                qun.remove(Systemidenity);
                System.out.println(books);
            }
            if (systemprice == 2) {                                        //add
                System.out.println("What do you want to add");
                Scanner k = new Scanner(System.in);
                systeminput = k.next();
                books.add(systeminput);
                System.out.println(books);
            }
            if (systemprice == 3) {                                     //clearing all
                System.out.println("Clearing all");
                books.clear();
                System.out.println(books);
            }
            if (systemprice == 4) {                                     //add the total price
                int finaltotal = 0;
                for (int v = 0; v < 3; v++) {
                    finaltotal = finaltotal + product.indexOf(v);
                    c.setID(finaltotal);
                }
                System.out.println("Total $" + finaltotal);

            }

            //c.setTransfer(books);
            //c.setTransfers(product);

            System.out.printf("do you want to exit?: Y/N\n");           //exit while loop
            Scanner end = new Scanner(System.in);
            endcode = end.nextInt();
            //  total=(getPrice+total);
            c.setPriceTotal(total);
            
            if (endcode == 0) {
                // int random=rand.setPrice;
                check = false;

            }

        }

    }
}




