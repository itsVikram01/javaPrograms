package java_codes.collection.list;

import java.util.*;

public class ArrayDuplicateAndUniqueElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        System.out.println(Arrays.toString(arr));

        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) <= 1) {
                uniqueList.add(key);
            }else {
                duplicateList.add(key);
            }
        }
        System.out.println("Unique Elements in  Array : " + uniqueList);
        System.out.println("Duplicate Elements in  Array : " + duplicateList);*/

        // OR

        HashSet<Integer> duplicateSet = new HashSet<>();
        Set<Integer> uniqueElementsSet = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElementsSet.add(num)) {
                uniqueElementsSet.remove(num);
                duplicateSet.add(num);
            }
        }
        System.out.println(" ");
        System.out.println("Unique elements : " + uniqueElementsSet);
        System.out.println("Repeating elements : " + duplicateSet);
    }
}
