package java_codes.collection.list;

import java.util.ArrayList;

public class RemoveIntegerArrayListElement {
	public static void main(String args[]) {
		// Initializing an object of ArrayList of Integer Type
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(23);
		list2.add(34);
		list2.add(45);
		list2.add(56);
		list2.add(25);
		list2.add(33);
		System.out.println("Integer ArrayList before remove method: ");
		for (Integer i : list2) {
			System.out.println(i);
		}

		list2.remove(1);
		list2.remove(0);
		System.out.println("Integer ArrayList after applying remove method: ");
		for (Integer i2 : list2) {
			System.out.println(i2);
		}
	}
}