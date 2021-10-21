import java.util.*;
import java.io.*;

public class SupplierList implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Supplier> aList = new LinkedList<Supplier>();
	private static SupplierList supplierList;
	
	SupplierList() {
	}
	
	public static SupplierList instance() {
		if(supplierList == null) {
			return (supplierList = new SupplierList());
		} else {
			return supplierList;
		}
	}

	public boolean addSupplier(Supplier aSupplier) {
		aList.add(aSupplier);
		return true;
	}

	public Iterator<Supplier> getSupplierList() {
		return aList.iterator();
	}

	
	private void readObject(java.io.ObjectInputStream inPut) {
		if(aList != null)
			return;
		else {
			try {
				inPut.defaultReadObject();
				if(supplierList == null) {
					supplierList = (SupplierList)inPut.readObject();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	private void writeObject(java.io.ObjectOutputStream outPut) {
		try {
			outPut.defaultWriteObject();
			outPut.writeObject(supplierList);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return aList.toString();
	}
}
