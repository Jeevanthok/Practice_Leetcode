package com.SortingAlgo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {14,12,1,23,8,2,69,41};
        int length = arr.length;
        selectionSort(arr,length);
    }

    private static void selectionSort(int[] arr, int length) {
        for (int i=0;i<length;i++){
            int min_idx = i;
            for (int j = i+1;j<length;j++){
                if (arr[j] < arr[min_idx])
                {
                   min_idx = j;
                }
            }
           int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        IntStream lst = Arrays.stream(arr);
        lst.forEach(System.out::println);

    }
}
