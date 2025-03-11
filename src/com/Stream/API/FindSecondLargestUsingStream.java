package com.Stream.API;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestUsingStream {
    public static void main(String[] args) {
        List<Integer> lst = List.of(4,15,2,3,78,55,48);
        Optional<Integer> secondLargest = lst.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondLargest);


    }
}
