package java_codes.java8.functionalInterface.functionalaproach;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Imperative Approach :
        int sum = 0;
        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);


        // OR

        //Functional Approach :
        // Define a lambda expression for addition
        IntBinaryOperator sum1 = (a, b) -> a + b; // lambda expression
        //IntBinaryOperator sum1 = Integer::sum; // method reference

        // Use the operation on the entire array with reduce()
        int totalSum = IntStream.of(numbers).reduce(0, sum1); // Initial value is 0

        System.out.println("Sum: " + totalSum);
    }
}