package java_codes.java8.stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public static List<Employee> getEmployees(){
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Akshansh", "hero", 400000));
		list.add(new Employee(102, "Shaurya", "sport", 500000));
		list.add(new Employee(103, "Mikael", "scientist", 600000));
		list.add(new Employee(104, "Abhi", "singer", 900000));
		list.add(new Employee(105, "Mayank", "dba", 1200000));
		list.add(new Employee(106, "Vikram", "developer", 1500000));
		return list;		
	}
}
