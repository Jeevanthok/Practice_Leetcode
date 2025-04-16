package com.random.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharAccuranceInString {
    public static void main(String[] args) {
        String str = "Jeevan Rajendra Thok Thok Jeevan";
        String str1 = "Jeevan";

        Map<String,Long> map1 = Arrays.stream(str1.split("")).
                                        sorted().
                                       collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map1);

        Map<String,Integer> map = new HashMap<>();
        String[] splitstr = str.split(" ");
        for (int i=0;i<splitstr.length;i++){
            map.put(splitstr[i], map.getOrDefault(splitstr[i],0)+1);
        }

        System.out.println(map);
    }
}
