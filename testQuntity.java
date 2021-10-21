import java.util.*;
import java.text.*;
import java.io.*;


public class testQuntity {
	  
	public static void main(String[] s) {

        String input, response;
        int quantity;
        

		products p1 = new products("ABC","iron","Pound of iron", 109.99, 10);
		products p2 = new products("XYZ","wood","Pound of wood", 59.99, 25);		
		productList pList = productList.instance();
		pList.addProduct(p1);
		pList.addProduct(p2);		
		
		
		Iterator productIterator = pList.getProduct();
		System.out.println("testing get list:\n");
		while(productIterator.hasNext()){
			System.out.println(pList.toString());
            productIterator.next();
		}

        System.out.println("Check Quantity: Enter product");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        products product = pList.searchProduct(input);


        System.out.println("Product " + input + " has " + pList.getQuantity(product) + " Quantities\n");
        System.out.println("would you like to decrease the quantity? ");
        response = in.nextLine();
        System.out.println(input);

        if(response.equals("yes"))
        {
            System.out.println("enter the new quantity: ");
            quantity = in.nextInt();
            product.setQuantity(quantity);

            System.out.println("Product " + input + " has " + pList.getQuantity(product) + " Quantities\n");
        }
        else
        {
            System.out.println("Done");
        }
        in.close();
	}
}