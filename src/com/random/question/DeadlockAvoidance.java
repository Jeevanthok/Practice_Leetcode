package com.random.question;

public class DeadlockAvoidance {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockAvoidance example = new DeadlockAvoidance();
        example.avoidDeadlock();
    }

    private void avoidDeadlock() {
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

        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {  // Both threads lock in the same order
                System.out.println("Thread 2: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock 1 & lock 2...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

