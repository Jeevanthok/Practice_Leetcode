package com.Stream.API;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6};
        Integer[] arr1 = {5, 2, 9, 1, 7, 6};


        Optional<Integer> value = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(value);

        // Sort the array in descending order
        Optional<Integer> sortedArr = Arrays.stream(Arrays.stream(arr1)
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .toArray(Integer[]::new)).skip(1).findFirst(); // Collect into a new array

       //  Print the sorted array
        System.out.println(sortedArr);

        Optional<Integer> second = Arrays.stream(arr1)
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(second);
    }
}
