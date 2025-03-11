package com.String.Practice;

public class StrinFormation {
    public static void main(String[] args) {
        String str = "a2b4c2";
        StringBuffer stringBuffer =new StringBuffer();

        for (int i=0;i<str.length();i++){

            if (Character.isDigit(str.charAt(i))){
                int num = str.charAt(i) - '0';
                char ch = str.charAt(i-1);
                for (int j=0;j<num;j++){
                    stringBuffer.append(ch);
                }
            }
        }
    }
}
