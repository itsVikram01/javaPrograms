package java_codes.interfaces.functionalinterface.enablehigherorderfunctions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emily"};

        // Filter names starting with "A" (higher-order function)
        List<String> filteredNames = filter(names, name -> name.startsWith("A"));
        System.out.println("Names starting with A: ");
        for (String name : filteredNames) {
            System.out.println(name);
        }
    }

    // Higher-order function that takes a NameFilter as argument
    public static List<String> filter(String[] names, NameFilter filter) {
        List<String> filteredList = new ArrayList<>();
        for (String name : names) {
            if (filter.test(name)) {
                filteredList.add(name);
            }
        }
        return filteredList;
    }
}
