package java_codes.collection.map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Map.Entry;

// HashMap class is serialized by default.
//It means HashMap class  does not need to implement Serializable interface in order to make it eligible for Serialization.
public class HashMapSerializeExample {
	public static void main(String args[]) {

		// Creating a HashMap of Integer keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(3, "Value3");
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		hashmap.put(1, "Value1");
		hashmap.put(2, "Value2");
		Map<Integer, String> map = Collections.synchronizedMap(hashmap);
		Set<Entry<Integer, String>> set = map.entrySet();
		synchronized (map) {
			Iterator<Entry<Integer, String>> i = set.iterator();
			// Display elements
			while (i.hasNext()) {
				Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>) i.next();
				System.out.print(pair.getKey() + ": ");
				System.out.println(pair.getValue());
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hashmap);
			oos.close();
			fos.close();
			System.out.printf("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}