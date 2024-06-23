package java_codes.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class StrArrayListSortDescUsingReverse {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dell");
		al.add("Acer");
		al.add("HP");

		/* Unsorted List: ArrayList content before sorting */
		System.out.println("ArrayList content before sorting: ");
		for (String s : al) {
			System.out.println(s);
		}

		/* Sorting in decreasing (descending) order */
		Collections.sort(al);
		Collections.reverse(al);

		/* Sorted List in reverse order */
		System.out.println("ArrayList in descending order:");
		for (String str : al) {
			System.out.println(str);
		}
	}
}