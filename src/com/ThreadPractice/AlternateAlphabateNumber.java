package com.ThreadPractice;

public class AlternateAlphabateNumber {

    private static  final Object loack = new Object();
    private static boolean isAlphabet = true;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() ->{
            for (char ch = 'A'; ch <= 'Z'; ch++){
                 synchronized (loack){
                     if (isAlphabet){
                         System.out.print(ch + " ");
                     }
                     isAlphabet = false;
                     loack.notify();
                     try {
                         loack.wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i=1;i<=26;i++){
                synchronized (loack){
                    if (!isAlphabet){
                        System.out.print(i + " ");
                    }
                    isAlphabet = true;
                    loack.notify();
                    try {
                        loack.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
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
