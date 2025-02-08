package com.array.practice;

public class MoveAllNegativeElement {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,34,-2,-1,-4,67};
        int firstpointer=0;
       // int secondpointer=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[firstpointer];
                arr[firstpointer] = temp;
                firstpointer++;
            }
        }
        for(int m=0;m<arr.length;m++){
            System.out.print(" "+arr[m]);
        }
    }

}
