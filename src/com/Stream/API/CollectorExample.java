package com.Stream.API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana");

        Map<String, Long> charCount =  words.stream()
                .flatMap(word->Arrays.stream(word.split("")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charCount);

        // Collect unique words into a Set
        Set<String> uniqueWords = words.stream()
                .collect(Collectors.toSet());
        System.out.println(uniqueWords);  // Output: [banana, apple, cherry]

        //to uppercase
        List<String> lststr = words.stream()
                .map(str ->str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(lststr);
        // to start with a
        List<String> startwitha = words.stream()
                        .filter(i->i.startsWith("a"))
                                .collect(Collectors.toList());
        System.out.println(startwitha);

        // Concatenate words into a single string
        String concatenated = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenated);  // Output: apple, banana, cherry, apple, banana
    }
}

