package com.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static void main(String[] args) {
        String str = "abcabcab";
        List<Character>  lst = new ArrayList<>();
        int start =0;
        int end =0;
        int max_lenght =0;
        while (end<str.length()){
            if (!lst.contains(str.charAt(end)))
            {
                lst.add(str.charAt(end));
                max_lenght = Math.max(max_lenght,lst.size());
                end++;
            }else{
                lst.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println(max_lenght);
    }
}
