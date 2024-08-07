package java_codes.z_interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Programs {
	public static void main(String[] args) {
		String input="aabbcdddfggggh";
		input=input.replaceAll("\\s", "");
		input=input.toLowerCase();
		
		//convert string into array considering each character as array element
		String[] strToArr = input.split("");
		//print string array 
		System.out.println("strToArr : "+Arrays.toString(strToArr));
		
		//convert array to stream
		Stream<String> arrToStream = Arrays.stream(strToArr);
		System.out.println("arrToStream : "+ arrToStream);
		
		// character occurrence
		Map<String, List<String>> map = Arrays.stream(strToArr)
				.collect(Collectors.groupingBy(s -> s));
		System.out.println("map : "+map);
		
		// character occurrence count
		Map<String, Long> map1 = Arrays.stream(strToArr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map1 : "+map1);
		
		
		//duplicate elements
		List<String> duplicate = map1
				.entrySet().stream()
				.filter(x -> x.getValue() > 1)
				.map(Map.Entry::getKey)
				.toList();
		System.out.println("duplicate : "+duplicate);
		
		//non repeating element
		List<String> nonRepeat = map1
				.entrySet().stream()
				.filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey)
				.toList();
		System.out.println("nonRepeat :" + nonRepeat);
		
		//first non-repeating element
		String firstNonRepeat = map1
				.entrySet().stream()
				.filter(x -> x.getValue() == 1)
				.findFirst().get().getKey();
		System.out.println("firstNonRepeat : "+firstNonRepeat);
			
	}
}
