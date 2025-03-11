package com.array.practice;
import java.util.Collections;
import java.util.PriorityQueue;

    public class KthSmallestElement {

        public static int kthSmallest(int[] arr, int N, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i < N; i++) {
                pq.add(arr[i]);
            }
            for (int j=1;j<K;j++){
                pq.remove(pq.peek());
            }

            return pq.peek();
        }

        public static void main(String[] args) {
            int N = 10;
            int[] arr = { 10, 5, 4, 3, 48, 6, 2,33, 53, 10 };
            int K = 4;

            System.out.println("Kth Smallest Element is: " + kthSmallest(arr, N, K));
        }
    }


