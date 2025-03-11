package com.ThreadPractice;

public class PracticOdDeven {


        private static final Object lock = new Object();
        private static  boolean isOddTurn = true;

        public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                synchronized (lock) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }


                   // isOddTurn = false;
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {  // Even numbers
                synchronized (lock) {
                    if (i%2==0) {
                        System.out.print(i + " ");

                    }

                    lock.notify();
                    try {
                        lock.wait();  // Wait until it's thread2's turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
    }

