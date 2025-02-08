package com.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String finstring ="";
        Vector<String> strs = new Vector<>();

       int initial =0;
       boolean ismatch = false;
        String first = strs.get(0);

       for (int i=0;i<strs.size();i++){
           char ch = first.charAt(initial);
           for (int j=1;j<strs.size();j++){
               String ongoing = strs.get(j);
               if (ch==ongoing.charAt(initial)){
                   ismatch=true;
               } else {
                   ismatch = false;
               }
           }
           if (ismatch){

               finstring += first.charAt(initial);
           }
           initial++;
       }
        System.out.println(finstring);

    }
}
