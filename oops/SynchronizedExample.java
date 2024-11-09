package oops;

class SharedCounter {
    private int count = 0;

    // Synchronized method to ensure only one thread can access it at a time
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to retrieve the value of the counter
    public synchronized int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        // Creating two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
