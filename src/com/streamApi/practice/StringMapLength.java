package com.streamApi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringMapLength {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Jeevan","Rajendra","Thok","Khadangali");
        Map<String,Integer> map = lst.stream().collect(Collectors.toMap(name->name,name->name.length()));
        System.out.println(map);
    }
}
