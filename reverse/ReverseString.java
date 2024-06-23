package java_codes.reverse;

public class ReverseString {
    public static void main (String[]args){
        String input = "Hello, world!";
        System.out.println ("Original string: " + input);

        String reversed = reverseString (input); //method calling
        System.out.println ("Reversed string: " + reversed);
        // OR
        System.out.print("After reverse string is: ");
        for(int i=input.length(); i>0; --i) {
            System.out.print(input.charAt(i-1));
        }


        System.out.println(" ");
        System.out.print("After reverse string is: ");
        StringBuilder sb = new StringBuilder(input);
        String reverse = String.valueOf(sb.reverse());
        System.out.print(reverse);
    }
    public static String reverseString (String input){
        StringBuilder reversed = new StringBuilder ();
        for (int i = input.length () - 1; i >= 0; i--){
            reversed.append (input.charAt (i));
        }
        return reversed.toString ();
    }
}
