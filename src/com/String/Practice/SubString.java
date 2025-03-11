package com.String.Practice;

public class SubString {
    public static void main(String[] args) {
        String s="acb",t="ahbgdc";
        int index=0;
        boolean isSubstring = true;

        if (t.isEmpty() && s.isEmpty()){
           // return true;
        }
        if (t.isBlank() || (s.isBlank() && t.isBlank())){
            isSubstring = false;
        }
        for (int i=0;i<t.length();i++){
            if (index<s.length()){
               if (!t.contains(String.valueOf(s.charAt(index)))){
                   isSubstring= false;
                   
                   if (t.indexOf(s.charAt(index)) > t.indexOf(s.charAt(index+1))){
                       isSubstring= false;
                       break;
                   }
                }

               index++;
            }
        }
        System.out.println(isSubstring);
    }
}
