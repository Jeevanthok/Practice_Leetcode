package com.random.question;

import java.util.HashMap;
import java.util.Map;

public class StringAlphabetCount {
    public static void main(String[] args) {
        String str="aaatttt";

        Map<Character,Integer> map = new HashMap<>();
        System.out.println(str.length());
       for(int i=0;i<str.length();i++){
           if (!map.containsKey(str.charAt(i)))
           {
               map.put(str.charAt(i),1);
           }
           else {
               map.put(str.charAt(i),map.get(str.charAt(i))+1);
           }
       }
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           System.out.println("Alphabet  " + entry.getKey()+ "  Count  " + entry.getValue());
       }

    }
}
