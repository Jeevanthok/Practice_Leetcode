package com.array.practice;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int length = arr.length;
        System.out.println(length);
        for(int i=length-1;i>=0;i--){
            System.out.print("," +arr[i]);
        }

        //recursive way
        reverseArrayinrecursvive(arr,0,5);
        for(int k:arr){
            System.out.print(k + ",");
        }
    }

       private static void reverseArrayinrecursvive(int[] arr, int i, int i1) {
        int temp;
        if(i>=i1){
            return ;
        }
          temp = arr[i];
          arr[i] = arr[i1];
          arr[i1] = temp;
          reverseArrayinrecursvive(arr,i+1,i1-1);
    }

}
