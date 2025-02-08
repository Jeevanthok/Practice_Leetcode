package com.SortingAlgo;

public class BubbleSortCode {
    public static void main(String[] args) {
        int arr[] = {14,12,1,23,8,2,69,41};
        int length = arr.length-1;
        sortUsingBubbleSort(arr,length);

    }

    private static void sortUsingBubbleSort(int[] arr, int length) {
        int temp;
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int k=0;k<length;k++){
            System.out.println(arr[k]);
        }
    }
}
