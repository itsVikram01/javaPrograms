package java_codes.array;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    //every character occurrence count

    public static void main(String[] args) {
        String str = "Hello World";
        char c = 'l';
        long count = str.chars().filter(ch -> ch == c).count();
        System.out.println(c + " : " + count);

        /*int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(c + " : " + count);*/


        Map<Character, Long> charCountMap = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println("Character occurrences in string: " + str);
        charCountMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
