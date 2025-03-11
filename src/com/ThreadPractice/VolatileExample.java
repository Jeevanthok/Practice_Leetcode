package com.ThreadPractice;

class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        // Thread 1 - Writer thread
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some work
                flag = true;  // Set the flag to true
                System.out.println("Writer Thread: flag set to true");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread 2 - Reader thread
        Thread readerThread = new Thread(() -> {
            while (!flag) {  // Keep checking flag until it's true
                // Busy-waiting
            }
            System.out.println("Reader Thread: flag is true, exiting.");
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        writerThread.join();
        readerThread.join();
    }
}

