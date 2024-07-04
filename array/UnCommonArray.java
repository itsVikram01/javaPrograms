package java_codes.array;

import java.util.*;

class UnCommonArray {
    public static void main (String [] args){
        int [] arr1 = {1,3,5,7,8};
        int [] arr2 = {2,4,6,7,8};
        
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : arr2){
            set2.add(num);
        }

        ArrayList<Integer> unCommonValues = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)){
                unCommonValues.add(num);
            }
        }
        for(int num : set2){
            if(!set1.contains(num)){
                unCommonValues.add(num);
            }
        }
        System.out.println(unCommonValues);
    }
}

