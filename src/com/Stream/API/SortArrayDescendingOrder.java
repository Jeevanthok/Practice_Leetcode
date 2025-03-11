package com.Stream.API;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayDescendingOrder {
    public static void main(String[] args) {
        int [] arr = {5,4,8,2,45,63,12,47,10};
     //   List<Integer> list = Arrays.asList(arr);

        List<Integer> lst = Arrays.stream(arr)
                           .boxed()
                           .sorted(Comparator.reverseOrder())
                           .collect(Collectors.toList());

         //Collections.reverse(lst);

        System.out.println(lst.toString());
    }
}
