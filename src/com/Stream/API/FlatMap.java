package com.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> lst = Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(8,9,7,4,5,6));

    lst.stream().flatMap(List::stream)
                .collect(Collectors.toList())
            .forEach(System.out::println);

    }
}
