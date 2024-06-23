package java_codes.collection.Comparable;

import java.util.*;

public class ArrayListSorting {

	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(223, "Chaitanya", 26));
		arraylist.add(new Student(245, "Rahul", 24));
		arraylist.add(new Student(209, "Ajeet", 32));

		System.out.println("Before sorting : ");
		for (Student s : arraylist) {
			System.out.println(s);
		}

		Collections.sort(arraylist);
		// Collections.sort only working for - public class Student implements
		// Comparable<Student>{
		// give error for
		// public class Student { // error
		// public class Student implements Comparable { // error

		System.out.println("After sorting : ");
		for (Student s : arraylist) {
			System.out.println(s);
		}
	}
}