package com.Leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int sum=0;
        int leftsum=0;
        int rightsum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        leftsum = sum;
        for (int i=0;i<arr.length;i++){
            leftsum -=arr[i];

            if (rightsum==leftsum){
                System.out.println(i);
            }
            rightsum +=arr[i];
        }
    }
}
