package java_codes.java8.stream.sort;

import java_codes.java8.stream.example.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {

		//Map<String, Integer> map=new TreeMap<>(); // preserve sorting order
		Map<String, Integer> map=new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		System.out.println("before sorting : "+map);
				
		//Collections.sort(List<T> list);		
		//collection expect list for sorting
		// so convert map into string and then sort using Collections
		
		/**
		List<Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		**/
		/*
		//traditional way
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		*/
		/**
		// using lambda expression
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

			
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		**/
		// using stream Comparator
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue())
			.forEach(System.out::println);
		
		
		// using map to sort object data
		/**
		//traditional aproach
		Map<Employee, Integer> employeesMap=new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		**/
		
		// using lambda expression
		Map<Employee, Integer> employeesMap=new TreeMap<>((o1, o2) ->  (int) (o1.getSalary()-o2.getSalary()));
		
		employeesMap.put(new Employee(101, "Akshansh", "hero", 400000), 40);
		employeesMap.put(new Employee(102, "Shaurya", "sport", 500000), 50);
		employeesMap.put(new Employee(103, "Mikael", "scientist", 600000), 60);
		employeesMap.put(new Employee(104, "Abhi", "singer", 900000), 90);
		employeesMap.put(new Employee(105, "Mayank", "dba", 1200000), 120);
		employeesMap.put(new Employee(106, "Vikram", "developer", 1500000), 150);
		System.out.println(employeesMap);
		
		// using stream 
		employeesMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
			.forEach(System.out::println);
		
	}
}
