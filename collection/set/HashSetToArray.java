package java_codes.collection.set;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String args[]) {

		// Create a HashSet object
		HashSet<String> hashset = new HashSet<String>();
		// Adding elements to HashSet object
		hashset.add("Lawyer");
		hashset.add("Police");
		hashset.add("Doctor");
		hashset.add("Engineer");
		// Printing HashSet elements
		System.out.println("HashSet contains: " + hashset);

		// Creating an Array of HashSet size
		String[] array = new String[hashset.size()];

		// Converting HashSet to Array using toArray() method
		hashset.toArray(array);

		// Printing Array elements
		System.out.println("Array contains: ");
		for (String str : array) {
			System.out.println(str);
		}
	}
}