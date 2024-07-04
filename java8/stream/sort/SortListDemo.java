package java_codes.java8.stream.sort;

import java_codes.java8.stream.example.Employee;
import java_codes.java8.stream.example.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		// traditional method
		Collections.sort(list); // ascending
		System.out.println(list);
		Collections.reverse(list); // descending
		System.out.println(list);
		
		// using stream api
		list.stream().sorted().forEach(s -> System.out.println(s)); // ascending
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); // descending
		
		List<Employee> employees=EmployeeDAO.getEmployees();
		/*
		Collections.sort(employees,new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				//return (int) (o1.getSalary()-o2.getSalary()); // ascending
				return (int) (o2.getSalary()-o1.getSalary()); // descending
			}			
		});
		// instead of this we use lambda expression
		*/

		// traditional way of sorting data from db
		Collections.sort(employees, (o1, o2) -> {
			// return (int) (o1.getSalary()-o2.getSalary()); // ascending
			return (int) (o2.getSalary() - o1.getSalary()); // descending
		});
		System.out.println(employees);

		// sorting data from db using stream api lambda expression
		employees.stream()
			.sorted((o1, o2) -> {
				// return (int) (o1.getSalary()-o2.getSalary()); // ascending
				return (int) (o2.getSalary() - o1.getSalary()); // descending
			})
			.forEach(System.out::println);
		

		// sorting data from db using stream api Comparator lambda expression
		employees.stream()
			.sorted(Comparator.comparing(emp -> emp.getSalary()))
			.forEach(System.out::println);

		// sorting data from db using stream api Comparator reference 
		employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(System.out::println);
		
	}
}
/*
class MyComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		//return (int) (o1.getSalary()-o2.getSalary()); // ascending
		return (int) (o2.getSalary()-o1.getSalary()); // descending
	}
}
// instead of using this traditional approach we use anonymous function
*/