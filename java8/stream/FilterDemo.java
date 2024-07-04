package java_codes.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Vikram");
		list.add("Mayank");
		list.add("Abhi");
		list.add("Mikael");
		list.add("Shaurya");
		list.add("Akshansh");

		// traditional for
		System.out.println("Traditional for and condition : ");
		for (String s : list) {
			// condition check
			if (s.startsWith("M")) {
				System.out.println(s);
			}
		}

		System.out.println("  ");

		// stream api forEach and filter(predicate)
		System.out.println("Stream api forEach and filter: ");
		list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t));

		// forEach and filter with Map
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Vikram");
		map.put(2, "Mayank");
		map.put(3, "Abhi");
		map.put(4, "Mikael");
		map.put(5, "Shaurya");
		map.put(6, "Akshansh");
/*
		System.out.println("forEach with map : ");
		map.forEach((key, value) -> System.out.println(key + " : " + value));
*/
		System.out.println("forEach with map using stream and filter : ");
		map.entrySet().stream().filter(k -> k.getKey()%2==0).forEach(obj -> System.out.println(obj));

	}
}