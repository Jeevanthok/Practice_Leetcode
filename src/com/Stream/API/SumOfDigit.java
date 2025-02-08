package com.Stream.API;

import java.util.Arrays;
import java.util.stream.IntStream;

// find sum of digit in given String
public class SumOfDigit {
    public static void main(String[] args) {
        String str = "123456";

        int sum = str.chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
