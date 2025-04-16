package com.SlidingWindow.Problems;

public class MaximumArraySubArray {
    public static void main(String[] args) {
        int arr[] ={1,12,-5,-6,50,3};
        int k= 4;
        int sum=0;
        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxsum = sum;
        for (int j=k;j<arr.length;j++){
            sum = arr[j]-arr[j-k];
           maxsum = Math.max(maxsum,sum);
        }

        System.out.println((double) maxsum/k);
    }
}
