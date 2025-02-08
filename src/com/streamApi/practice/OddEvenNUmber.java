package com.streamApi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNUmber {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        lst.stream().filter(i->i%2!=0).forEach(System.out::println);
        lst.stream().filter(i->i%2==0).forEach(System.out::println
        );

    }
}
