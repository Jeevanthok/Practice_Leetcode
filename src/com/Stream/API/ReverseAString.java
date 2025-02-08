package com.Stream.API;

import java.util.Comparator;

// reverse a String using third varaible
public class ReverseAString {
    public static void main(String[] args) {
        String str = "Jeevan";
        String reverseStr = str.chars()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(Character::toString)
                .toString();
        System.out.println(reverseStr);
    }
}
