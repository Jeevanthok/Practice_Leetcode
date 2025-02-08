package com.array.practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,34,23,42,5,12,6};
        int n=3;
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for (int j=1;j<n;j++){

              pq.remove(pq.peek());
             }
        System.out.println("Kth largest Element " + pq.peek());
        }

    }


