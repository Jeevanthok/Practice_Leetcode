package com.array.practice;

public class FindMaxandMin {
    public static void main(String[] args) {
        int [] arr= {13,22,67,45,78,90,6};
        int min1= Integer.MAX_VALUE;
        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }


        }
        System.out.println("minimun  " + min);
        System.out.println("maximun  "+ max);

    }
}
