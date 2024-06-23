package java_codes.zavaprogram;

public class StaticSynchronizedMyClass {
    private static int counter = 0;

    public static synchronized void incrementCounter() {
        counter++;
    }
}
