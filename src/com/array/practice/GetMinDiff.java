package com.array.practice;

public class GetMinDiff {
    public static void main(String[] args) {
        int[] arr ={1 ,5 ,8 ,10};
        int k=2;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minelement =0;
        int maxelement =0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);

        }
        maxelement = max - k;
        minelement = min + k;
        int maxe = maxelement - minelement;
        System.out.println(maxe);
    }
}
