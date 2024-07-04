package java_codes.collection.list;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//We do not need to implement the Serializable interface in the below example because ArrayList
	//is serialized by default.
public class ArrayListSerialization {
	public static void main(String args[]) {
		// ArrayList object creation
		ArrayList<String> list = new ArrayList<String>();
		// Adding elements to the ArrayList object
		list.add("New York");	
		list.add("Boston");
		list.add("Dallas");	
		System.out.println(list);

		try {
			FileOutputStream fileOS = new FileOutputStream("inputfile");
			ObjectOutputStream objOS = new ObjectOutputStream(fileOS);
			objOS.writeObject(list);
			objOS.close();
			fileOS.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}