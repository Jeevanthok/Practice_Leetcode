package com.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberOfVowelsSubstring {
    public static void main(String[] args) {
        String str = "leetcode";
        int k=3;
        int count=0;
        List<Character> isvowels = new ArrayList<>();
        int max =Integer.MIN_VALUE;
         for (int i=0;i<k;i++){
             if (isVowel(str.charAt(i))){
                 count++;
             }
         }
        max = count;
        for (int j=k;j<str.length();j++){
            if (isVowel(str.charAt(j))) max++;
            if (isVowel(str.charAt(j-k))) max--;
            max = Math.max(max,count);
        }
        System.out.println(max);
    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
