package com.Stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

// find 5th largest element
public class Find5thLargest {
    public static void main(String[] args) {
        int[]  arr = {2,3,1,5,4,6};

        Optional<Integer> fifthlargest = Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(4)
                .findFirst();
        System.out.println(fifthlargest);
        if (fifthlargest.isPresent()){
            System.out.println(fifthlargest.get());
        }
    }

}
