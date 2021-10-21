import java.io.*;

public class Supplier implements Serializable{

	private static final long serialVersionUID = 1L;
	private productList pList = new productList();	
	private String id;	
	private String name;			
	private String address;			
		
	//constructor
	public Supplier() {};	
	public Supplier(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// Setter
	public void setid(String id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setAddress(String address) {this.address = address; }
	public boolean AssignProduct(products Item) {
		//pList.add(Item);
		return true;
	}	
	//public boolean RemoveProduct(products Item) {
		//return pList.removeProduct(Item);
	//}
	// Getter
	public String getId() { return id;}	
	public String getName() { return name; }
	public String getAddress() { return address; }
	//public Iterator<products> getProductAssigned() {
		//return pList.iterator();
	//}	
	
	public String toString() { return "Supplier ID: " + id + ";  Name: " + name + ";  Address: " + address; }	
}	
