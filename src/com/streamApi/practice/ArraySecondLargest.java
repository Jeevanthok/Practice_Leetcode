package com.streamApi.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class ArraySecondLargest {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7, 6};

        // Sort the array in descending order
        Optional<Integer> sortedArr = Arrays.stream(Arrays.stream(arr)
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .toArray(Integer[]::new)).skip(1).findFirst(); // Collect into a new array

        // Print the sorted array
        System.out.println(sortedArr);
    }
}
