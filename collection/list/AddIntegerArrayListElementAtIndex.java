package java_codes.collection.list;

import java.util.ArrayList;

public class AddIntegerArrayListElementAtIndex {
	public static void main(String args[]) {
		// Declaration of Integer ArrayList
		ArrayList<Integer> al2 = new ArrayList<>();		
		// Simple add() method for adding element at the end of the ArrayList		
		al2.add(12);
		al2.add(32);
		al2.add(22);
		al2.add(42);
		System.out.println(al2);

		// Adding element to the 4th position
		// 4th position = 3rd index as index starts with 0
		al2.add(3, 36);
		System.out.println("ArrayList after adding Integer 36 : " + al2);

		// Addition of Integer element at 1st position i.e. 0th index
		al2.add(0, 48);

		// Displaying the ArrayList
		System.out.println("ArrayList after adding Integer 48 : " + al2);
	}
}