package com.Leetcode;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "leetcode";

        char[] str1 = str.toCharArray();
        int firstIndex=0;
        int lasrtInde=str.length()-1;
        for(int i=0;i<str1.length/2;i++){
           if (str1[firstIndex] == 'a' || str1[firstIndex] == 'A' || str1[firstIndex] == 'e' || str1[firstIndex] == 'E'||
                   str1[firstIndex] == 'i' ||  str1[firstIndex] == 'I' || str1[firstIndex] == 'o' || str1[firstIndex] == 'O' ||
                   str1[firstIndex]  == 'u' || str1[firstIndex]  == 'U'){
                 if (str1[lasrtInde] == 'a' || str1[lasrtInde] == 'A' || str1[lasrtInde] == 'e' || str1[lasrtInde] == 'E'||
                         str1[lasrtInde] == 'i' ||  str1[lasrtInde] == 'I' || str1[lasrtInde] == 'o' || str1[lasrtInde] == 'O' ||
                         str1[lasrtInde]  == 'u' || str1[lasrtInde]  == 'U'){
                       char temp = str1[firstIndex] ;
                       str1[firstIndex]= str1[lasrtInde];
                       str1[lasrtInde] = temp;
                     firstIndex++;
                 }
               lasrtInde--;
           }
           else {
               firstIndex++;
           }

        }

      String rsult =new String(str1);
        System.out.println(rsult);
    }
}
