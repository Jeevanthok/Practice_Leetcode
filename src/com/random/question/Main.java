package com.random.question;

public class Main {
    public static void main(String[] args) {
        StringBuilder sharedStringBuilder = new StringBuilder();

        // Create two threads that modify the same StringBuilder instance
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedStringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedStringBuilder.append("B");
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final result
        System.out.println("Result (StringBuilder): " + sharedStringBuilder.toString().length());
    }
}

