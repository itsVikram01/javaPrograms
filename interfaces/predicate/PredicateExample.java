package java_codes.interfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        int number = 12;

        System.out.println(isEven.test(number)); // Output: true
        System.out.println(isGreaterThan10.test(number)); // Output: true

        // Combining predicates
        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10);
        System.out.println(isEvenAndGreaterThan10.test(number)); // Output: true
    }
}