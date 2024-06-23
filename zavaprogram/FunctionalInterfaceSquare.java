package java_codes.zavaprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*functional interface is an interface that contains exactly one abstract method. They are also known as Single Abstract Method (SAM) interfaces.*/
@FunctionalInterface
public interface FunctionalInterfaceSquare extends Function<Integer, Integer> {
    int square(int x);

    @Override
    default Integer apply(Integer x) {
        return square(x);
    }

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    // Using lambda expression
    List<Integer> squaresLambda = numbers.stream()
            .map(x -> x * x)  // Use lambda directly
            .collect(Collectors.toList());





    /*int compare(String a, String b);
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    List<String> sortedNames = names.stream()
                                    .sorted((String a, String b) -> a.compareTo(b))
                                    .collect(Collectors.toList());*/

}
