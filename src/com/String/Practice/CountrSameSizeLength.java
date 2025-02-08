package com.String.Practice;

import java.util.*;

public class CountrSameSizeLength {
    public static void main(String[] args) {
        List<String> lststr = Arrays.asList("dog","cat","jeevan","thok","jeevan","thok","jeesan","aa","b");
int len1 = lststr.size();

        countFrequencyOfEachWord(lststr,len1);
        Map<Integer,List<String>> mapoflst = new HashMap<>();
        for (int i=0;i<len1;i++){
            List<String> lsta = new ArrayList<>();
                int len = lststr.get(i).length();
                if (mapoflst.containsKey(len)){
                    mapoflst.get(len).add(lststr.get(i));

                } else {
                    lsta.add(lststr.get(i));
                    mapoflst.put(len,lsta);
                }
        }

        for (Map.Entry<Integer,List<String>> mapent: mapoflst.entrySet()){
            System.out.println("key " + mapent.getKey() + " value " + mapent.getValue());
        }
    }

    private static void countFrequencyOfEachWord(List<String> lststr, int len1) {
        Map<String,Integer> mapoflst = new HashMap<>();
        for (int i=0;i<len1;i++){
            if (mapoflst.containsKey(lststr.get(i))){
                    int value = mapoflst.get(lststr.get(i)) +1;
                mapoflst.put(lststr.get(i),value);
            }else {
                mapoflst.put(lststr.get(i), 1);
            }
        }
        for (Map.Entry<String,Integer> mapent: mapoflst.entrySet()){
            System.out.println(" repeat key " + mapent.getKey() + " value " + mapent.getValue());
        }
    }
}
