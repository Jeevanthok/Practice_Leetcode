package com.random.question;

public class DeadlockExample {

    // Resources that threads will attempt to lock
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.createDeadlock();
    }

    private void createDeadlock() throws InterruptedException {
        // Thread 1: tries to lock lock1 and then lock2
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & lock 2...");
                }
            }
        });

        // Thread 2: tries to lock lock2 and then lock1
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 2 & lock 1...");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

