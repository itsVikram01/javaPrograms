package java_codes.palindrome;

import java.util.Scanner;

public class PalindromeStrWithoutReverseFunction {
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
        
    	int len=str.length();
    	System.out.println("len : "+len);
    	for(int i=0; i<len/2; i++) {
	    	System.out.println("i : "+i);
	    	System.out.println("str.charAt(i) : "+str.charAt(i));
	    	System.out.println("str.charAt(len-i-1) : "+str.charAt(len-i-1));
    		if (str.charAt(i) != str.charAt(len-i-1)) {    			
                System.out.println(str + " is not a palindrome.");
                break;
			} else {
	            System.out.println(str + " is a palindrome.");
			}
    	}
    }
}