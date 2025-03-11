package com.ThreadPractice;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("main thread start");

        Thread thread1 =new Thread(() -> {
            System.out.println("Thred1 is runing");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("threa2 is runing");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        //using runable interface

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("my runable interface 1");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("my runable interface 2");
            }
        };

        Thread threadrunable1 = new Thread(runnable1);
        Thread threadrunable2 = new Thread(runnable2);
        threadrunable1.start();
        threadrunable2.start();
        threadrunable1.join();
        threadrunable2.join();

        System.out.println("main thread end");
    }
}
