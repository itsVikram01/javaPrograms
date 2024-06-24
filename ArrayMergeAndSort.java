package java_codes.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMergeAndSort {
    public static void main(String[] args) {
        int [] arr1 = {4,5,2,6};
        int [] arr2 = {9,1,3,7,8};

        // merge two array
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        for (int num : arr1) {
            mergedList.add(num);
        }
        for (int num : arr2) {
            mergedList.add(num);
        }

        // sort array
        Collections.sort(mergedList);
        System.out.println(mergedList);
    }
}
