package java_codes.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCharOccurrence {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		String str = sc.nextLine();
		//str=str.replaceAll("\\s", "");
		//str=str.toLowerCase();
		int n=str.length();
		sc.close();*/

		/*
		String str = "occurrence of character";
		int n=str.length();
		Map<Character, Long> charCounts = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println("Character occurences in : "+str);
		charCounts.forEach((k, v) -> System.out.print(k+" : "+v +" "));
		*/

		/*
		String str = "occurrence of character";
		int n=str.length();
	    str = str.replaceAll("\\s", ""); // remove all whitespace characters
        System.out.println("String without whitespace : "+str);
		
		Map<String, Long> result = Arrays
				.stream(str.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
		System.out.println(result); 
		*/
		
	    /*
	    String str = "occurrence of character";
		int n=str.length();
	    TreeMap<Character, Integer> freq = new TreeMap<>();
	    for (int i=0; i<str.length(); i++) {
	        char c = str.charAt(i);
	        freq.put(c, freq.getOrDefault(c, 0) + 1);
	    }

	    System.out.println("str : " + str);
	    for (char c : freq.keySet()) {
	        System.out.println(c + " " + freq.get(c));
	    }
	    */

		/*String str = "occurrence of character";
		char[] chars = str.toCharArray();
		Map<Character, Integer> charsMap = new HashMap<>();
		for (char c : chars) {
			if (charsMap.containsKey(c)) {
				charsMap.put(c, charsMap.get(c) + 1);
			} else
				charsMap.put(c, 1);
		}
		//System.out.println(charsMap); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
		charsMap.forEach((key, value) -> System.out.println(key + " : " + value));*/


		/*String str2 = "occurrence of character";
		int n=str2.length();
		Map<Character, Integer> charMap = new HashMap<>();
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

		String str = "occurrence of character";
		Map<Character, Long> charCountMap = str.chars().mapToObj(ch -> (char) ch)
					.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		charCountMap.forEach((k, v) -> System.out.println(k + " : " + v));


		
		String []str1 = {"arsh", "ashwini", "arsh", "ashwini", "ashwini", "sea", "red", "green"};
		Map<String, Long> stringCountMap = Arrays.stream(str1)
					.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		stringCountMap.forEach((k, v) -> System.out.println(k + " : " + v));

		/*Map<String, Integer> stringsMap = new HashMap<>();
		for (String s : str1) { // Iterate through the String array
			Integer count = stringsMap.get(s); // Get the current existing count for the string (could be null).
			if (count == null) { // Check if the string is new (count is null)
				count = 0; // Initialize the count to 0 for the new string
			}
			stringsMap.put(s, count + 1); // Increment the count for the string
		}
		stringsMap.forEach((key, value) -> System.out.println(key + ": " + value)); // Print the count of each string*/
    }
}
