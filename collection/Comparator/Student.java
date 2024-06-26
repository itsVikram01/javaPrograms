package java_codes.collection.Comparator;

import java.util.Comparator;

public class Student {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	/* Comparator for sorting the list by Student Name */
	public static Comparator<Student> studentNameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();
			// ascending order
			return StudentName1.compareTo(StudentName2);
			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	/* Comparator for sorting the list by roll no */
	public static Comparator<Student> studentRollNoComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();
			/* For ascending order */
			return rollno1 - rollno2;
			/* For descending order */
			// rollno2-rollno1;
		}
	};
	
	/* Comparator for sorting the list by roll no */
	public static Comparator<Student> studentAgeComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			int age1 = s1.getStudentage();
			int age2 = s2.getStudentage();
			/* For ascending order */
			return age1 - age2;
			/* For descending order */
			// age2-age1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}
}