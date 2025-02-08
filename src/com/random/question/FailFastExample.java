package com.random.question;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        Collections.sort(list);
//Testing stash feature

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate over the list
        while (iterator.hasNext()) {
            String fruit = iterator.next();


            // Modifying the list while iterating will cause ConcurrentModificationException
           // if (fruit.equals("Banana")) {
                list.remove(fruit); // This will cause a fail-fast behavior
           // }
        }
        list.forEach(System.out::println);
    }
}
