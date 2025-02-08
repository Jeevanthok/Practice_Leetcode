package com.array.practice;

public class RotateArrayClockWise {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
          // Expected 5 6 1 2 3 4
        int [] arr1 = {1,2,3,4,5,6};
        System.out.println(arr.length);
        int n=2;
        leftrotate(n, arr);
        rightroate(n,arr1);
    }


    private static void rightroate(int n, int[] arr) {
        for(int i=0;i<n;i++){
            int temp = arr[0];
            for(int k=0;k<arr.length-1;k++){
                arr[k] = arr[k+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println();
        for(int j=0;j<arr.length;j++){

            System.out.print(" " + arr[j]);
        }

    }

    private static void leftrotate(int n, int[] arr) {
        for(int i = 0; i< n; i++){
            int temp = arr[arr.length-1];
            for (int j = arr.length-1; j>0; j--){
                    arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println();
        for(int k = 0; k< arr.length; k++){
            System.out.print(" " + arr[k]);
        }
    }
}
