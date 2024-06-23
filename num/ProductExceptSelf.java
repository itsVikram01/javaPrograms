package java_codes.num;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Array elements : "+Arrays.toString(nums));
        int[] result = productExceptSelf(nums);
        System.out.println("Product of array elements other than itself : "+Arrays.toString(result));
        // Output: [24, 12, 8, 6]
    }
	
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            final int index = i; // create a final variable to hold the value of i
            int product = IntStream
            		.range(0, n)
            		.filter(j -> j != index) // use the final variable inside the lambda expression
            		.map(j -> nums[j])
            		.reduce(1, (a, b) -> a * b);
            result[i] = product;
        } 
        /*
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < i; j++) {
                product *= nums[j];
            }
            for (int j = i + 1; j < n; j++) {
                product *= nums[j];
            }
            result[i] = product;
        } 
        */      
        return result;        
    }
}
