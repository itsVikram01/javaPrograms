package java_codes._javaprogram;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "abdccba";

        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)){
            System.out.println(reverse+" is Palindrome");
        }
        else {
            System.out.println(reverse+" is not Palindrome");
        }


    }

}
