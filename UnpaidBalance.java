import java.io.*;
import java.util.*;

public class UnpaidBalance implements Serializable{
	private static final long serialVersionUID = 1L;
	private static UnpaidBalance UnpaidBalanceList;
	private List<String> aList = new LinkedList<String>();

	public static UnpaidBalance instance() {
		if (UnpaidBalanceList == null) {
			return (UnpaidBalanceList = new UnpaidBalance());
		} else {
			return UnpaidBalanceList;
		}
	}
	
	//add clientId to list
	public boolean add(String clientId) {
		aList.add(clientId);
		return true;
	}
	
	//find clientId in list
	public String find(String clientId) {
		for(String id : aList) {
			if(id.equalsIgnoreCase(clientId))
				return clientId;
		}
		return "none";
	}
	
	//remove client from list
	public boolean remove(String clientId) {
		for(String id: aList) {
			if(id.equalsIgnoreCase(clientId)) {
				aList.remove(id);
				return true;
			}
		}
		return false;
	}
	
	//return list iterator
	public Iterator<String> getIterator() {
		return aList.iterator();
	}
	
	private void writeObject(java.io.ObjectOutputStream output) {
  		try {
  			output.defaultWriteObject();
  			output.writeObject(UnpaidBalanceList);
  		} catch(IOException ioe) {
  			System.out.println(ioe);
  		}
  	}
  
  	private void readObject(java.io.ObjectInputStream input) {
  		try {
  			input.defaultReadObject();
  			if (UnpaidBalanceList == null) {
  				UnpaidBalanceList = (UnpaidBalance) input.readObject();
      		} else {
      			input.readObject();
      		}
  		} catch(IOException ioe) {
  			ioe.printStackTrace();
  		}catch(Exception e) {
  			e.printStackTrace();
  		}
  	}
	
	public String toString() {
		return aList.toString();
	}
	
	
}
