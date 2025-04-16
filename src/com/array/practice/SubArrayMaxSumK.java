package com.array.practice;

public class SubArrayMaxSumK {
    public static void main(String[] args) {
        int []arr = {1,2,7,95,6,7,8,9};
        int k=3;
        int sum=0;
        int max=0;

        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        max = sum;
        int i=0;
        for (int j=k;j<arr.length;j++){
            //sum += arr[j] - arr[j-k];
            sum += arr[j];
            sum -=arr[i];
            i++;
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
