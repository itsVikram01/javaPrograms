package java_codes.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
	public static void main(String args[]) {
		// Creating LinkedList Object
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add("Pear");
		linkedlist.add("Apple");
		linkedlist.add("Orange");
		System.out.println(linkedlist);
		
		// Converting LinkedList to ArrayList
		List<String> list = new ArrayList<String>(linkedlist);
		for (String s : list) {
			System.out.println(s);
		}
	}
}