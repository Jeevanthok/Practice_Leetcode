package com.ThreadPractice;

public class PrintOddEvenNumber {

    private static final Object lock = new Object();
    private static  boolean isOddTurn = true;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 100; i+=2) {
                synchronized (lock) {
                    if (!isOddTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("Thread1 " + i + " ");
                    isOddTurn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 2; i <= 100; i+=2) {  // Even numbers
                synchronized (lock) {
                    if (isOddTurn) {
                        try {
                            lock.wait();  // Wait until it's thread2's turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("Thread2 "+i + " ");
                    isOddTurn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
