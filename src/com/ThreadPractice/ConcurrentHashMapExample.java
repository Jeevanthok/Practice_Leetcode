package com.ThreadPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap to store key-value pairs
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

      Thread thread1 = new Thread(()->{
          map.put("key1","value1");
          System.out.println("thread first");
      });

        Thread thread2 = new Thread(()->{
            map.put("key1","value2");
            System.out.println("thread second");
        });

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

        System.out.println("The value for Key1 is " + map.get("key1"));

    }
}

