package com.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int [] arr ={2, 1, 5, 1, 3, 2};
        int k=3;
        int sum=0;
        int max=0;
        int end=0,start=0;

        for (int i=0;i<arr.length-k;i++){
            while (end<k){
                  sum += arr[end];
                  max = Math.max(max,sum);
                  end++;
            }
            sum -= arr[start];
            start++;
            k = k+1;
        }
        System.out.println(max);
    }
}
