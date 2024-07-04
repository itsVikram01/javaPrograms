package java_codes.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//ArrayList is non-synchronized and should not be used in multithreaded environment 
	//without explicit synchronization.
public class SynchronizedArrayList {
	public static void main(String args[]) {

		// Converting ArrayList to Synchronized ArrayList
		List<String> synchronizedarraylist = Collections
				.synchronizedList(new ArrayList<String>());
		
		// Adding elements to synchronized ArrayList
		synchronizedarraylist.add("Football");
		synchronizedarraylist.add("Basketball");
		synchronizedarraylist.add("Baseball");
		System.out.println(synchronizedarraylist);

		System.out.println("Synchronized ArrayList Iteration:");
		synchronized (synchronizedarraylist) {
			Iterator<String> iterator = synchronizedarraylist.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
		
		// Creating Synchronized ArrayList Object    
	    CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
	    //Adding elements to synchronized ArrayList
	    al.add("Football");
	    al.add("Basketball");
	    al.add("Baseball");

	    System.out.println("Showing synchronized CopyOnWriteArrayList Elements:");
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = al.iterator(); 
	    while (iterator.hasNext())
	       System.out.println(iterator.next());
	}
}