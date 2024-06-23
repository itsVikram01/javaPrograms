package java_codes.string;

public class SpecificCharacterCount {
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
    }
}
