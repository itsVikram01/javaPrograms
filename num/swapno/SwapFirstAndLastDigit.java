package java_codes.num.swapno;

import java.util.Scanner;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //System.out.println("Input num is : " + num);
        sc.close();

        // Validate input and handle single-digit numbers
        if (num < 10) {
            System.out.println("Input number must be 2 digits.");
            return;
        }

        // Calculate number of digits and position value (combined logic)
        int length = (int) Math.log10(num) + 1;
        //System.out.println("Length of no is : " + length);
        int positionValue = (int) Math.pow(10, length - 1);
        //System.out.println("positionValue of no is : "+positionValue);

        // Extract first and last digits (combined logic)
        int firstDigit = num / positionValue;
        //System.out.println("FirstDigit of no is : " + firstDigit);
        int lastDigit = num % 10;
        //System.out.println("LastDigit of no is : " + lastDigit);

        // Swap the digits (combined logic)
        num = num - firstDigit * positionValue - lastDigit + lastDigit * positionValue + firstDigit;

        System.out.println("Number after swapping first and last digit: " + num);
    }

}

