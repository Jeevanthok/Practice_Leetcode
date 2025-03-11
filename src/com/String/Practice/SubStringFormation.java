package com.String.Practice;

import java.util.HashSet;
import java.util.Set;

public class SubStringFormation {
    public static void main(String[] args) {
        String str = "abcd";
        String str1 ="";
        Set<String> setstr= new HashSet<>();

        for (int i =0 ;i <str.length();i++){
            for (int j = i;j<str.length();j++) {
                   str1= str1 +str.charAt(j);
                   setstr.add(str1);
            }
            str1="";
        }


    }
}
