package java_codes.z_interview;

public class Double1For30Days {
    public static void main(String[] args) {
        int value = 1;

        for (int i = 0; i < 30; i++) {
            value = value * 2;
            System.out.println("Iteration " + (i + 1) + ": " + value);
        }
        // 1073741824
    }
}
