package java_codes.collection.list;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
	      // Creating and initializing ArrayList
	      ArrayList<String> fruits = new ArrayList<>();
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Mango");
	      fruits.add("Pear");

	      // ArrayList to String array conversion
	      String[] str = new String[fruits.size()];
	      for(int i=0; i < fruits.size(); i++) {
	          str[i] = fruits.get(i);
	      }
	      
	      // Print elements using for-each loop
	      for(String s : str) {
	        System.out.println(s);      
	      }
	    }
	}