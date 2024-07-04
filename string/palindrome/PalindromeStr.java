package java_codes.string.palindrome;

import java.util.Scanner;

public class PalindromeStr {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : "); 
        String str = sc.nextLine();
        System.out.println("Input String is : "+str); 
        sc.close();         
        
	    str = str.replaceAll("\\s", ""); // remove all whitespace characters
        System.out.println("String without whitespace : "+str);
        
	    str = str.toLowerCase(); // remove all whitespace characters
        System.out.println("String in lowerCase : "+str);
        
        // reverse the str
        String reverse=new StringBuilder(str).reverse().toString();          
        System.out.println("Reversed String is : "+reverse);
        
        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
