import java.util.*;
import java.text.*;
import java.io.*;

public class Tester {
	  
	public static void main(String[] s) {
		Supplier s1 = new Supplier("1111","jim","MN");
		Supplier s2 = new Supplier("2222","adam","NW");		
		SupplierList supplierlist = SupplierList.instance();
		supplierlist.addSupplier(s1);
		supplierlist.addSupplier(s2);		
		
		System.out.println("supplier1 info:" + supplierlist.getSupplier("2222") + "\n");
		System.out.println("supplier1 info:" + supplierlist.getSupplier("1111") + "\n");
		Iterator supplier = supplierlist.getSupplierList();
		System.out.println("testing get list:\n");
		while(supplier.hasNext()){
			System.out.println(supplier.next());
		}
	}
}