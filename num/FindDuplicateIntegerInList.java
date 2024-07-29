package java_codes.num;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateIntegerInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        HashSet<Integer> duplicateSet = new HashSet<>();
        for (int num : numbers) {
            if (!duplicateSet.add(num)) {
                System.out.print(num + ", ");
            }
        }
    }
}
