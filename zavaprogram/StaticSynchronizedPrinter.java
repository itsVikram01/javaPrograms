package java_codes.zavaprogram;

public class StaticSynchronizedPrinter {
    public static synchronized void printDocument(String document) {
        // Simulate printing process (slow)
        System.out.println("Printing document: " + document);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
