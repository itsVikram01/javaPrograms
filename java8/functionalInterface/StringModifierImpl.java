package java_codes.java8.functionalInterface;

public class StringModifierImpl implements StringModifier {
    @Override
    public String modify(String str) {
        // Your string modification logic here (e.g., uppercase, reverse)
        return str.toUpperCase();
    }
}
