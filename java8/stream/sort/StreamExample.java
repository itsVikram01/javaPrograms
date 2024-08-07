package java_codes.java8.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 65000),
                new Employee("Charlie", 48000)
        );

        Optional<Employee> highestPaidEmployee = employees.stream().max(Comparator.comparingInt(Employee::getSalary));
        highestPaidEmployee.ifPresent(employee -> System.out.println("Highest paid employee: " + employee.getName()));

        List<Employee> sortedEmployees = employees.stream().sorted().collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);
    }
}