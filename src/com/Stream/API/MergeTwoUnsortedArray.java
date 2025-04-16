package com.Stream.API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int [] arr1 = {11,10,5,6,9,4};
        int [] arr2 = {1,10,5,16,9,40};

        int [] finalaaray = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .sorted()
                .toArray();

        for (int i : finalaaray){
            System.out.print(i + " ");
        }
    }
}
