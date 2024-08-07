package java_codes._javaprogram;

import java.util.Scanner;

public class StringRotator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();

        if (isRotation(input1, input2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean isRotation(String input1, String input2) {
        // Check if lengths are equal
        if (input1.length() != input2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String temp = input1 + input2;

        // Check if str2 is a substring of temp
        return temp.contains(input2);
    }
}
