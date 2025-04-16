package com.Stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IsStringPallindrome {


    public static void main(String[] args) {
     String [] str = {"level", "world", "madam", "racecar", "apple", "noon", "java"};
     String finalstring = Arrays.stream(str)
             .filter(IsStringPallindrome::isPalindrome)
             .max(Comparator.comparing(String::length))
             .toString();
        System.out.println(finalstring);
    }

    private static boolean isPalindrome(String s) {
        String reverseString = new StringBuffer(s).reverse().toString();
        if (s.equals(reverseString)) {
            return true;
        }
        return false;
    }
}