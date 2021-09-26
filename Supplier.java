import java.io.*;

public class Supplier implements Serializable{

	private static final long serialVersionUID = 1L;
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
	//temp code for id
	public void setid(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	//get Supplier ID
	public String getId() {
		return id;
	}	
	
	//get Supplier name
	public String getName() {
		return name;
	}
	
	//get Supplier address
	public String getAddress() {
		return address;
	}
	
	//get all Supplier info
	public String toString() {
		return "Supplier ID: " + id + ";  Name: " + name + ";  Address: " + address;
	}	
}	