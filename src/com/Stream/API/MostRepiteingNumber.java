package com.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepiteingNumber {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,4,6,4,6,2,2);
        int mostRepetingNumber = lst.stream()
                                            .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                                            .entrySet().stream()
                                            .max(Map.Entry.comparingByValue()).get().getKey()
                                            ;
        System.out.println(mostRepetingNumber);
    }
}
