package java_codes.zavaprogram;

public class SynchronizedBlockSharedCounter {
    private int count = 0;
    public void increment() {
        synchronized (this) { // Synchronize on the current object
            count++;
        }
    }
    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlockSharedCounter counter = new SynchronizedBlockSharedCounter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount()); // Should print 20000
    }
}