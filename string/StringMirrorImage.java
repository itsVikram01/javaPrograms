package java_codes.string;

import java.util.Scanner;

public class StringMirrorImage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Inter a String : ");
        String input = sc.nextLine();
        sc.close();
        
        String output = mirrorImage(input);
        System.out.println("Mirror image: " + output);
    }
    
    public static String mirrorImage(String input) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb);
        int n=input.length();
        for (int i = n-1; i >= 0; i--) {
            System.out.println("input.charAt(i): " + input.charAt(i));
            StringBuilder mi = sb.append(input.charAt(i));
            System.out.println(mi);
        }
        return sb.toString();
    }
}
