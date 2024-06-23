package java_codes.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 2, 1, 2, 3};
        Map<Integer, Long> frequencyMap = countFrequency(arr);
        System.out.println(frequencyMap);
    }

    public static Map<Integer, Long> countFrequency(int[] arr) {
        return  new HashMap<>(Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting())));
    }

}
