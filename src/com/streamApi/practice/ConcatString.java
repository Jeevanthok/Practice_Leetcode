package com.streamApi.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//concat a list of string in single string
public class ConcatString {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Jeevan");
        lst.add("Rajendra");
        lst.add("Thok");
        String str = lst.stream().collect(Collectors.joining(","));
        System.out.println(str);
    }
}
