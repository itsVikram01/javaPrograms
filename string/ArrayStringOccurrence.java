package java_codes.string;

import java.util.HashMap;
import java.util.Map;

public class ArrayStringOccurrence {
	public static void main(String[] args) {
		String[] str = {"arsh", "arsh", "ashwini", "ashwini", "ashwini", "sea", "red", "green"};
		Map<String, Integer> map = new HashMap<>();
		for (String s : str) { // Iterate through the String array
		    Integer count = map.get(s); // Get the current existing count for the string (could be null).
		    if (count == null) { // Check if the string is new (count is null)
			count = 0; // Initialize the count to 0 for the new string
		    }
		    map.put(s, count + 1); // Increment the count for the string
		}
		// Print the count of each string
		map.forEach((key, value) -> System.out.println(key + ": " + value));
	}

	// OR 

    
	String []str1 = {"arsh", "ashwini", "arsh", "ashwini", "ashwini", "sea", "red", "green"};
	Map<String, Long> stringCountMap = Arrays.stream(str1)
						.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
	stringCountMap.forEach((k, v) -> System.out.println(k + " : " + v));
}
