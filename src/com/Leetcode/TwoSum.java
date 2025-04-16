package com.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {14,2,7,11,15};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num = target-arr[i];
            if (map.containsKey(num)){
                System.out.println(map.get(num) + " " + i);
                break;
            }else {
                map.put(arr[i],i);
            }
        }
    }
}
