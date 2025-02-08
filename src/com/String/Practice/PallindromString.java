package com.String.Practice;

public class PallindromString {
    public static void main(String[] args) {
        String str = "TTSTsT";
        boolean isPallindrome = false;
        int intial = 0;
        int end = str.length()-1;
        while (intial<=end){
            if (str.charAt(intial)==str.charAt(end)){
                isPallindrome = true;
            }else {
                isPallindrome = false;
                break;
            }
            intial++;
            end--;
        }
        if (isPallindrome){
            System.out.println("String is Pallindrome");
        }
        else {
            System.out.println("String is not pallindrome");
        }
    }
}
