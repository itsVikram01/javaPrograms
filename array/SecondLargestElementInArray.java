package java_codes.array;

import java.util.Arrays;
import java.util.Optional;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 1};

        int largest = Arrays.stream(numbers)
                .boxed() // Convert int[] to Stream<Integer>
                .max(Integer::compareTo) // Get the maximum element
                .orElse(-1); // Return -1 if array is empty

        System.out.println("Largest number is: " + largest);

        int smallest = Arrays.stream(numbers)
                .boxed() // Convert int[] to Stream<Integer>
                .min(Integer::compareTo) // Get the minimum element
                .orElse(Integer.MAX_VALUE); // Return Integer.MAX_VALUE if array is empty

        System.out.println("Smallest number is: " + smallest);

        /*Optional<Integer> secondLargest = Arrays.stream(numbers)
                .boxed() // Convert int[] to Stream<Integer>
                .sorted((a, b) -> b - a) // Sort the stream in descending order
                .distinct() // Remove duplicates
                .skip(1) // Skip the largest element
                .findFirst(); // Get the first element in the remaining stream*/


        int secondLargest = Arrays.stream(numbers)
                .boxed() // Convert int[] to Stream<Integer>
                .sorted((a, b) -> b - a) // Sort the stream in descending order
                .distinct() // Remove duplicates
                .skip(1) // Skip the largest element
                .findFirst() // Get the first element in the remaining stream
                .orElse(-1); // Return -1 if there is no second-largest element

        System.out.println("Second largest number is: " + secondLargest);

        double average = Arrays.stream(numbers)
                .average()
                .orElse(0.0);// Return 0.0 if the array is empty

        System.out.println("Average of number is: " + average);
    }
}
