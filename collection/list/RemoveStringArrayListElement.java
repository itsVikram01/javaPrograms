package java_codes.collection.list;

import java.util.ArrayList;

public class RemoveStringArrayListElement {
	public static void main(String args[]) {
		// Creating an object of ArrayList of String Type
		ArrayList<String> list = new ArrayList<>();
		list.add("CC");
		list.add("AA");
		list.add("BB");
		list.add("DD");
		list.add("AA");
		list.add("ZZ");
		System.out.println("Given ArrayList before remove method: ");
		for (String str : list) {
			System.out.println(str);
		}
		
		list.remove(0);
		list.remove(2);
		list.remove(3);
		System.out.println("ArrayList after applying remove method: ");
		for (String str2 : list) {
			System.out.println(str2);
		}
	}
}