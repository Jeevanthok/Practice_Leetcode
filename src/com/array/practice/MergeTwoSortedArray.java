package com.array.practice;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,3,6,8,10,11};
        int arr2[] ={1,2,4,7,9};
        int tem[] = new int[arr.length + arr2.length];
        int pointer1=0;
        int pointer2=0;
        int pointer3=0;
        while (pointer1 < arr.length && pointer2 < arr2.length){
                if (arr[pointer1] < arr2[pointer2]){
                    tem[pointer3] = arr[pointer1];
                    pointer1++;
                    pointer3++;
                } else if (arr[pointer1] > arr2[pointer2]){
                    tem[pointer3] = arr2[pointer2];
                    pointer3++;
                    pointer2++;
                }
        }
        while (pointer1<arr.length){
            tem[pointer3] = arr[pointer1];
            pointer1++;
            pointer3++;
        }
        while (pointer2<arr2.length){
            tem[pointer3] = arr2[pointer2];
            pointer3++;
            pointer2++;
        }
    }
}
