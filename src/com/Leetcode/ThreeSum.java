package com.Leetcode;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        for (int i=0;i<arr.length-3;i++){
            for (int j=i+2;j<arr.length-2;j++){
                if (arr[i] + arr[i+1]+arr[j] == 0){
                    System.out.println(arr[j] +" "+ arr[j+1] + " "+arr[j+2]);
                }
            }
        }
    }
}
