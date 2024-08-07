package java_codes.interfaces.comparator;

import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Student[] arr = { new Student(111, "AAA", 23),
                new Student(131, "BBB", 22),
                new Student(121, "CCC", 24) };

        // Sorting students by name using Comparator
        Arrays.sort(arr, new NameComparator());

        for (Student st : arr) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
