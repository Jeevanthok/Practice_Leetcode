package com.ThreadPractice;

public class ThreadStringExample {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();

        Thread thread1 = new Thread(() -> {
            for (int i=0;i<1000;i++){
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i=0;i<1000;i++){
                stringBuilder.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try{
           thread1.join();
           thread2.join();
        } catch (InterruptedException e){
           e.printStackTrace();
        }
        System.out.println("Result is"+ stringBuilder.toString().length());
    }
}
