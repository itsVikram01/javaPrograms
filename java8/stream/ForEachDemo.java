package java_codes.java8.stream;

import java_codes.java8.functionalinterface.consumer.Consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Vikram");
		list.add("Mayank");
		list.add("Abhi");
		list.add("Mikael");
		list.add("Shaurya");
		list.add("Akshansh");
		
		//traditional for 
		System.out.println("Traditional for : ");
		for(String s:list) {
			System.out.println(s);
		}
		

		System.out.println("  ");
		
		//stream api forEach
		System.out.println("Stream api forEach : ");
		list.stream().forEach(t -> System.out.println(t));		

		System.out.println("  ");
		
		//forEach with Map
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Vikram");
		map.put(2, "Mayank");
		map.put(3, "Abhi");
		map.put(4, "Mikael");
		map.put(5, "Shaurya");
		map.put(6, "Akshansh");

		System.out.println("forEach with map : ");
		map.forEach((key, value) -> System.out.println(key+" : "+value));

		System.out.println("forEach with map using stream api : ");
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		
		
		// internal working of forEach
		//Consumer<String> consumer=void accept(T t);

		Consumer<String> consumer= t -> System.out.println(t);
		//consumer.accept("Hello Vikram");
		for(String s1:list) {
			consumer.accept(s1);
		}
		
	}

}
