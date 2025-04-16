package com.random.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringAlphabetCount {
    public static void main(String[] args) {
        String str="aaattttsdss";
        Map<Character,Integer> mao = new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (mao.containsKey(str.charAt(i))){
                mao.put(str.charAt(i),mao.get(str.charAt(i))+1);
            }else {
                mao.put(str.charAt(i),1);
            }

        }
    for (Map.Entry<Character,Integer> entry : mao.entrySet()){
        System.out.println("Key  " + entry.getKey() + " Balue " + entry.getValue());
    }
        Map<String,Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                map.entrySet().forEach(entry->System.out.println(entry.getKey() +" " + entry.getValue()));
    }
}
