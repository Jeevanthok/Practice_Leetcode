package com.Stream.API;

import java.util.*;
import java.util.stream.Collectors;

public class JoiningInStream {
    public static void main(String[] args) {
        List<String> lststr = Arrays.asList("Jeevan","Shubham","Sanket","Vikas");

        List<String> finalstr = Collections.singletonList(lststr.stream().
                collect(Collectors.joining(",","Mr","Thok")));
        finalstr.forEach(System.out::println);

        Map<Integer,List<String>> map = lststr.stream()
                .collect(Collectors.groupingBy(String::length));
        map.forEach((key,value)-> System.out.println("key  " + key + " value  " + value));
    }


}
