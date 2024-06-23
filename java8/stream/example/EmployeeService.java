package java_codes.java8.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public static List<Employee> taxEmployees(String input){
		/**
		if (input.equalsIgnoreCase("tax")) {			
			return EmployeeDAO.getEmployees().stream()
					.filter(emp -> emp.getSalary()>500000).collect(Collectors.toList());
		} else {
			return EmployeeDAO.getEmployees().stream()
					.filter(emp -> emp.getSalary()<=500000).collect(Collectors.toList());
		}
		**/

		// use of ternary operator
		return (input.equalsIgnoreCase("tax"))
				? EmployeeDAO.getEmployees().stream()
						.filter(emp -> emp.getSalary() > 500000)
						.collect(Collectors.toList())
				: EmployeeDAO.getEmployees().stream()
						.filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());
	
	}

	public static void main(String[] args) {
		System.out.println(taxEmployees("tax"));
		System.out.println(taxEmployees("non tax"));
	}
	
}
