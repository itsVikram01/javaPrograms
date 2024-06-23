package java_codes.array;

import java.util.Arrays;

public class ArrayOfElementProductExceptItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input array is : "+Arrays.toString(nums));

        int[] result = productExceptSelf(nums);
        System.out.println("Product of array elements except itself is : "+ Arrays.toString(result));
        // prints [24, 12, 8, 6]
    }
    /*public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Compute product of all elements
        int product = 1;
        *//*for (int i = 0; i < n; i++) { // normal for loop
            product =product*nums[i];
        }*//*
        for (int num : nums) { // enhanced for loop
            product = product * num;
        }
        int[] result = new int[n];
        Arrays.fill(result, 1);
        // Compute product of all elements except current element
        for (int i = 0; i < n; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }*/

    /*public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        // Multiply all the elements to the left of the current element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        // Multiply all the elements to the right of the current element
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }*/

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Multiply all the elements
        int product = Arrays.stream(nums)
                            .reduce(1, (a, b) -> a * b);

        int[] result = new int[n];
        Arrays.fill(result, 1);

        // Now divide product by current element
        for (int i = 0; i < n; i++) {
            result[i] = result[i] * (product / nums[i]);
        }

        return result;
    }
}
