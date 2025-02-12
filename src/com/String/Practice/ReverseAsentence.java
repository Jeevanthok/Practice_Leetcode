package com.String.Practice;

public class ReverseAsentence {
    public static void main(String[] args) {
        String str = "Jeevan Rajendra Thok";
      //  reverseWordOfSentencce(str);
        reverseSentence(str);
    }

    private static void reverseWordOfSentencce(String str) {
        String[] splitstr = str.split(" ");
        String afterreverse = "";
        for (int i=splitstr.length-1;i>=0;i--){
            String temp = splitstr[i];
            for (int j=temp.length()-1;j>=0;j--){
                afterreverse +=temp.charAt(j);
            }
            afterreverse +=" ";
        }
        System.out.println(afterreverse);

    }

    private static void reverseSentence(String str) {
        String reversstring ="";
        String[] splitstr = str.split(" ");
        for (int i=splitstr.length-1;i>=0;i--){
            reversstring += splitstr[i];
            if(i!=0){
                reversstring +=" ";
            }
        }
        System.out.println(reversstring);
    }
}
