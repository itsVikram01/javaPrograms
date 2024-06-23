package java_codes.interfaces.functionalinterface;

public class StringModifierImpl implements StringModifier {
    @Override
    public String modify(String str) {
        // Your string modification logic here (e.g., uppercase, reverse)
        return str.toUpperCase();
    }
}
