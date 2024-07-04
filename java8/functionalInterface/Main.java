package java_codes.java8.functionalInterface;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello, world!";

        // Using lambda expression with StringModifierImpl
        StringModifier modifier = new StringModifierImpl();
        String modifiedString = modifier.modify(hello);
        System.out.println(modifiedString); // HELLO, WORLD!


        // OR


        //define the lambda expressions or method references directly within the Main class. These expressions provide the implementation for the modify method on the fly. While this approach keeps the logic within Main, it might slightly decrease readability for more complex modifications.
        // Using lambda expression directly using FunctionalInterface
        StringModifier toUpperCase = str -> str.toUpperCase();
        StringModifier reverse = str -> new StringBuilder(str).reverse().toString();

        String result1 = toUpperCase.modify(hello);
        String result2 = reverse.modify(hello);

        System.out.println("Uppercase: " + result1); // Uppercase: HELLO, WORLD!
        System.out.println("Reversed: " + result2); // Reversed: !dlrow ,olleH

        // Using method reference
        StringModifier trimSpaces = String::trim;
        String trimmedGreetings = trimSpaces.modify(hello);
        System.out.println("Trimmed: " + trimmedGreetings); // Trimmed: Greetings from Java!
    }
}
