package com.array.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersecton {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr2 = {1,8,9};
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        List<Integer> lst = new ArrayList<>();
          int left =0;
          int right =0;
          while (left<arr.length || right<arr2.length){
              if (arr[left]<=arr2[right]){
                  lst.add(arr[left]);
                  left++;
                  right++;
              }else {
                  if (!lst.contains(arr[left])){
                      lst.add(arr[left]);
                  }

              }
          }

    }
}
