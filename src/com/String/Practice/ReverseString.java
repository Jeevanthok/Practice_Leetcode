package com.String.Practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Jeevan";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuffer.append(str);
        stringBuilder.append(str);
        StringBuffer stringBuffer1 =  stringBuffer.reverse();
        StringBuilder stringBuilder1 = stringBuilder.reverse();
        System.out.println("Using a StringBuffer :- " + stringBuffer1);
        System.out.println("Using a StringBuilder :- " + stringBuilder);
        System.out.println("Using For Loop");
        reverseAString(str);
    }

    private static void reverseAString(String str) {
        String reverString = "";
        for (int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            reverString += c;
        }
        System.out.println("USING FOR LOOP = " + reverString);
    }
}
