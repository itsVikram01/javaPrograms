package java_codes._javaprogram.synchronization;

public class StaticSynchronizedMyClass {
    private static int counter = 0;

    public static synchronized void incrementCounter() {
        counter++;
    }
}
