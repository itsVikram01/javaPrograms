package java_codes.Map.HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDeserializeExample {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		HashMap<Integer, String> map = null;
		try (FileInputStream fis = new FileInputStream("hashmap.ser");
			     ObjectInputStream ois = new ObjectInputStream(fis)) {
			    Object obj = ois.readObject();
			    if (obj instanceof HashMap) {
			        map = (HashMap<Integer, String>) obj;
			    } else {
			        throw new ClassNotFoundException("Deserialized object is not a HashMap");
			    }
			} catch (IOException | ClassNotFoundException e) {
			    e.printStackTrace();
			    return;
			}
		
		System.out.println("Deserialized HashMap");
		// Display content using Iterator
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> mentry = (Map.Entry<Integer, String>) iterator.next();
			System.out.print("key: " + mentry.getKey() + " & Value: ");
			System.out.println(mentry.getValue());
		}
	}
}