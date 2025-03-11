package com.ThreadPractice;

class PrintNumbers implements Runnable {
    private static int number = 1; // Shared resource
    private final Object lock;
    private final int threadId;

    public PrintNumbers(Object lock, int threadId) {
        this.lock = lock;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (number <= 100) {
            synchronized (lock) {
                // Wait until it's this thread's turn to print the next number
                while (number % 2 != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                // Print the current number
                System.out.println(number);
                number++;

                // Notify the other thread to print the next number
                lock.notify();
            }
        }
    }
}

public class
MultiThreadingExample {
    public static void main(String[] args) {
        Object lock = new Object(); // Lock object to synchronize threads

        // Create two threads: thread1 prints odd numbers, thread2 prints even numbers
        Thread thread1 = new Thread(new PrintNumbers(lock, 1)); // Thread 1 prints 1, 3, 5...
        Thread thread2 = new Thread(new PrintNumbers(lock, 0)); // Thread 2 prints 2, 4, 6...

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
