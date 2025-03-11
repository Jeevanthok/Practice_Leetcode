package com.Stream.API;

import java.util.*;
import java.util.stream.Collectors;

public class StringMapLength {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Jeevan","Rajendra","Thok","Khadangali");
        Map<String,Integer> map = lst.stream().collect(Collectors.toMap(name->name,name->name.length()));
        System.out.println(map);

        Optional<String> maxlength = lst.stream()
                .max((s1,s2) -> Integer.compare(s1.length(),s2.length()));
        System.out.println(maxlength);

        Optional<String> max = lst.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(max);

        Optional<Integer> max1 = Optional.of(lst.stream()
                .mapToInt(String::length)
                .max().orElse(0));
        System.out.println(max1);
    }
}
