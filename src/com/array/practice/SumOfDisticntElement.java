package com.array.practice;

import java.util.HashMap;
import java.util.Map;

public class SumOfDisticntElement {
    public static void main(String[] args) {
        int arr[] = {10,15,20,10,30,15};
        int coun =0;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                 coun = (map.get(arr[i]) + 1);
                 map.put(arr[i],coun);
            }else {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map1 : map.entrySet()){
            if(map1.getValue()<=1){
               sum = sum + map1.getKey() ;
            }
        }
        System.out.println(sum);
    }
}
