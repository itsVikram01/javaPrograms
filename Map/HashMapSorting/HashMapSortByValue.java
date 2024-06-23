package java_codes.Map.HashMapSorting;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSortByValue {
	public static void main(String args[]) {
		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		
		System.out.println("Before Sorting:");
		System.out.println("hashmap : "+hashmap);
		// iterate using Iterator
		/*
	    Set<Entry<Integer, String>> set = hashmap.entrySet();
	    Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry1 = iterator.next();
            System.out.println(entry1.getKey() +": " + entry1.getValue());
		}
		*/
		System.out.println("After Sorting:");
        Map<Integer, String> map = sortByValue(hashmap);
		System.out.println("map : "+map);
		// print the sorted hashmap
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
	}


    // function to sort hashmap by values
    public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hashmap)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, String> > list =
               new LinkedList<Map.Entry<Integer, String> >(hashmap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> aa : list) {
        	linkedHashMap.put(aa.getKey(), aa.getValue());
        }
        return linkedHashMap;
    }
}