package com.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,3};
        int k=6;
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int subNum = k-arr[i];
            if (map.containsKey(subNum) && map.get(subNum)>0){
                count++;
                map.put(subNum,map.get(subNum)-1);
            }else {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

        }

        System.out.println(count);
    }
}
