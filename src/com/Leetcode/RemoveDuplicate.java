package com.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,2,2,3,3,4};
        List<Integer> lst = new ArrayList<>();
        int pointer =0;
        lst.add(arr[pointer]);

        // Start from the second element
        for (int pointertwo = 1; pointertwo < arr.length; pointertwo++) {
            if (arr[pointer] != arr[pointertwo]) {
                lst.add(arr[pointertwo]);  // Add the unique element to the list
                pointer = pointertwo;      // Move the pointer
            }
        }
        System.out.println(lst);
    }
}
