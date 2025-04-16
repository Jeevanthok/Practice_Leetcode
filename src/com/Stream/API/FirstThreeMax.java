package com.Stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstThreeMax {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,1,5,6,3,2,15,665,98,52,41,20);
        lst.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("after first stream ");
        lst.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
