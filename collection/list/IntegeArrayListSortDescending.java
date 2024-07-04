package java_codes.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class IntegeArrayListSortDescending {
	public static void main(String args[]) {

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(13);
		arraylist.add(89);
		arraylist.add(45);
		/* Unsorted List: ArrayList content before sorting */
		System.out.println("ArrayList Before Sorting:");
		for (int num : arraylist) {
			System.out.println(num);
		}

		/* Sorting in decreasing (descending) order */
		Collections.sort(arraylist, Collections.reverseOrder());
		/* Sorted List in reverse order */
		System.out.println("ArrayList in descending order:");
		for (int num : arraylist) {
			System.out.println(num);
		}
	}
}