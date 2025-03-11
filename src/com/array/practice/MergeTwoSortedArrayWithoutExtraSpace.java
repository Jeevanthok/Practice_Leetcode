package com.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class MergeTwoSortedArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int arr[] = {0,3,6,8,10,11};
        int arr2[] ={1,2,4,7,9};
        int pointer1=arr.length-1;
        int pointer2=0;

        while (pointer1 < arr.length && pointer2 < arr2.length){
            if (arr[pointer1] > arr2[pointer2]) {
                  int temp = arr[pointer1];
                  arr[pointer1] = arr2[pointer2];
                  arr2[pointer2] = temp;
                  pointer1--;
                  pointer2++;
              }
            else {
                break;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int k : arr){
            System.out.print(" " +k);
        }
        System.out.println();
        for (int l : arr2){

            System.out.print(" " + l);
        }

    }
}
