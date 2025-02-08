package com.random.question;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample1 {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate over the list
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Modifying the list while iterating will cause ConcurrentModificationException
          //  if (fruit.equals("Banana")) {
                list.remove(fruit); // This will cause a fail-fast behavior
          //  }
        }
    }
}

