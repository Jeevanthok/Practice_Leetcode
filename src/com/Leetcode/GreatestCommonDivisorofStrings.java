package com.Leetcode;

import java.util.HashSet;
import java.util.stream.Collectors;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if(str1.equals(str2)){
            return str1;
        }



        return "";
    }
}
