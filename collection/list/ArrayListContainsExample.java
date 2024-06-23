package java_codes.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListContainsExample {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no to find : ");
    	int num=sc.nextInt();
    	sc.close();
        // initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        // check if ArrayList contains element
        if (al.contains(num)) {
            System.out.println(num+" was found in the list");
        } else {
            System.out.println(num+" was not found in the list");
        }
    }
}
