package java_codes.zavaprogram.synchronization;

public class SynchronizedMethodBlockCounter {
    private int count;

    public void increment() {
        synchronized (this) { // Synchronize on the current object
            count++;
        }
    }
}