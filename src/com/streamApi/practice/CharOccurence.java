package com.streamApi.practice;

//write a program to count the number of occurrence of each character in string using stream

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurence {
    public static void main(String[] args) {
        String str = "Jeevan";
        Map<String, Long> output = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : "+output);
    }
}
