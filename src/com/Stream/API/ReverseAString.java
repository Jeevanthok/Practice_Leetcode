package com.Stream.API;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        String ginal = Arrays.stream(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(ginal);



    }
}
