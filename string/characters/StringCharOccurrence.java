package java_codes.string.characters;

import java.util.*;
import java.util.stream.Collectors;

public class StringCharOccurrence {
	public static void main(String[] args) {
		String str = "occurrence of character";
		//int n=str.length();

		Map<Character, Long> charCounts = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		charCounts.forEach((k, v) -> System.out.println(k + " : " + v));

		//OR
		char[] chars = str.toCharArray();
		Map<Character, Integer> charsMap = new HashMap<>();
		for (char ch : chars) {
			if (charsMap.containsKey(ch)) {
				charsMap.put(ch, charsMap.get(ch) + 1);
			} else
				charsMap.put(ch, 1);
		}
		//System.out.println(charsMap); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
		charsMap.forEach((key, value) -> System.out.println(key + " : " + value));

		//OR
	    /*str = str.replaceAll("\\s", ""); // remove all whitespace characters
        System.out.println("String without whitespace : "+str);
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);*/

		//OR
	    /*TreeMap<Character, Integer> freq = new TreeMap<>();
	    for (int i=0; i<str.length(); i++) {
	        char c = str.charAt(i);
	        freq.put(c, freq.getOrDefault(c, 0) + 1);
	    }
	    System.out.println("str : " + str);
	    for (char c : freq.keySet()) {
	        System.out.println(c + " " + freq.get(c));
	    }*/

		//OR
		/*Map<Character, Integer> charMap = new HashMap<>();
		for (int i=0; i<=n-1; i++) {
	    	int count;
	    	if(charMap.containsKey(str.charAt(i))) {
				count = charMap.get(str.charAt(i));
				charMap.put(str.charAt(i), ++count);
			} else {
				count=0;
				charMap.put(str.charAt(i), ++count);
			}
		}  
		//System.out.println(charMap);
		charMap.forEach((key, value) -> System.out.println(key + " : " + value));*/
    }
}
