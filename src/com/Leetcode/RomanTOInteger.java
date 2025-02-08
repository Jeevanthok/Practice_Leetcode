package com.Leetcode;

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

import java.util.HashMap;
import java.util.Map;

public class RomanTOInteger {
    public static void main(String[] args) {


        String str = "III";
        System.out.println(romanToInt(str));
    }


    public static int romanToInt(String s) {
        Map<Character, Integer> romanmap = new HashMap<>();
        int j=0;
        char ch = s.charAt(j);
        romanmap.put('I', 1);
        romanmap.put('V', 5);
        romanmap.put('X', 10);
        romanmap.put('L', 50);
        romanmap.put('C', 100);
        romanmap.put('D', 500);
        romanmap.put('M', 1000);
        int lastch = romanmap.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0; i--) {
            int value = romanmap.get(s.charAt(i));
            if (lastch>value) {
                lastch =  (lastch - value);
            } else {
                lastch = lastch + value;
            }
        }
        return lastch;
    }
}
