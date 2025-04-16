package com.Stream.API;

import java.util.Arrays;
import java.util.Comparator;

// sort Array in descending order
public class SortArray {
    public static void main(String[] args) {
        int [] arr = {12,10,56,2,78,63,8,4,9,};

        int[] finalArray = Arrays.stream(arr)

                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i : finalArray) {
            System.out.print(i + " ");
        }
    }
}
