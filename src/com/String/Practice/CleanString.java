package com.String.Practice;

public class CleanString {
    public static void main(String[] args) {
        String str = "D@iW$a#li";
        String cleanstring="";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z' || ch >='a' && ch <= 'z'){
                cleanstring +=ch;
            }
        }
        System.out.println(cleanstring);
    }
}
