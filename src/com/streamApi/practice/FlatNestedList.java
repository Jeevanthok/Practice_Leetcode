package com.streamApi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatNestedList {
    public static void main(String[] args) {
        List<List<Integer>> lst = Arrays.asList(Arrays.asList(2,1,45,67,3,2),Arrays.asList(12,23,25,56,89,45));

        List<Integer> finallst = lst.stream().flatMap(List::stream).collect(Collectors.toList());
        for (int i : finallst){
            System.out.print(" " +i);
        }
    }
}
