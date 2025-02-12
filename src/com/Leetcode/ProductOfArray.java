package com.Leetcode;

public class ProductOfArray {
    public static void main(String[] args) {
        int arr[] = {2,1,5,0,4,6};
        increasingTriplet(arr);
    }

    public static boolean increasingTriplet(int[] nums) {
        int j=1;
        int k=2;
        boolean isTriplet = false;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i] < nums[j] && nums[j] < nums[k]){
                return true;
            }
            j +=1;
            k +=1;
        }
        return false;
    }
}
