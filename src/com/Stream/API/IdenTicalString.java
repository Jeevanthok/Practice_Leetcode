package com.Stream.API;
// find whether two string are identical or not
public class IdenTicalString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

            boolean isStringIdentical = str1.length() == str2.length()
                    && str1.equals(str2);
        System.out.println(isStringIdentical);
    }
}
