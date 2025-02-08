package com.array.practice;

public class MinimumJumps {
    public static void main(String[] args) {
        int [] arr ={0, 10, 20};
        minimumjumps(arr);
    }

    private static void minimumjumps(int[] arr) {
        int jump=0;
        int i,j,k=0;
        for( i=k;i<arr.length;i++){
            if(arr[k]==0){
                System.out.println(-1);
            }
              if (arr.length>arr[k]){
                  jump++;
              }else{
                 // return1;
              }
              k =i+arr[k];
              if(k>=arr.length){
                 break;
              }
        }
        System.out.println(jump);
    }
}
