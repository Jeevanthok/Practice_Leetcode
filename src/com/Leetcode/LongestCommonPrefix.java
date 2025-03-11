package com.Leetcode;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] str = {"flower","flow","flask"};
        Arrays.sort(str);
        String strone = str[0];
        StringBuffer stringBuffer = new StringBuffer();
        String strlast = str[str.length-1];
        for (int i=0;i<strone.length();i++){
            if (strone.charAt(i) == strlast.charAt(i)){
                stringBuffer.append(strone.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }
}
