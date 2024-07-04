package java_codes.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        int [] arr1 = {4,5,2,6};
        int [] arr2 = {9,1,3,7,8};
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i : arr1) {
            resultList.add(i);
        }
        for (int i : arr2) {
            resultList.add(i);
        }
        int[] arr = resultList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
