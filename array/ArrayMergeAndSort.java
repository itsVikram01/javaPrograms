package java_codes.array;

import java.util.*;

public class ArrayMergeAndSort {
    public static void main(String[] args) {
        int [] arr1 = {4,5,2,6,7,8};
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

        // Finding and printing uncommon elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : mergedList) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> uncommonValues = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonValues.add(entry.getKey());
            }
        }

        System.out.println("Uncommon Values: " + uncommonValues);
    }
}
