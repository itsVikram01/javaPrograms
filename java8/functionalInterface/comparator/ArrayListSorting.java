package java_codes.java8.functionalInterface.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(111, "Ronaldo", 30));
		arraylist.add(new Student(222, "Messi", 31));
		arraylist.add(new Student(333, "John", 29));

		System.out.println("Before Sorting:");
		System.out.println(arraylist);

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, Student.studentNameComparator);
		for (Student s : arraylist) {
			System.out.println(s);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Student.studentRollNoComparator);
		for (Student s : arraylist) {
			System.out.println(s);
		}

		/* Sorting on Age property */
		System.out.println("Age Sorting:");
		Collections.sort(arraylist, Student.studentAgeComparator);
		for (Student s : arraylist) {
			System.out.println(s);
		}
	}
}