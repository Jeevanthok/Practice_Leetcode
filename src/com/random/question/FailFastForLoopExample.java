package com.random.question;
import java.util.ArrayList;

public class FailFastForLoopExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Fail-fast behavior here
        for (String fruit : list) {
            System.out.println(fruit);

            // This will cause a fail-fast behavior
           // if (fruit.equals("Banana")) {
                list.remove(fruit); // ConcurrentModificationException occurs here
           // }
        }
    }
}

