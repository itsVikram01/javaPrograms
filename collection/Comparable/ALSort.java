package java_codes.collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ALSort {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Vikram");
		list.add("DRaj");
		list.add("Mayank");
		
		Collections.sort(list);

		System.out.println("After sorting : " +list);
		for (String s : list) {
			System.out.println(s);
		}
	}

}
