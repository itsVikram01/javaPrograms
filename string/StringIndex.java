package java_codes.string;

public class StringIndex {
    public static void main(String[] args) {

        String sentence = "Find the word 'word'";
        int firstIndex = sentence.indexOf("word");
        int lastIndex = sentence.lastIndexOf("word");

        /* index counting start from 0 to n */
        System.out.println(firstIndex); // Output: 5
        System.out.println(lastIndex); // Output: 15



        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println(reversed);
    }
}
