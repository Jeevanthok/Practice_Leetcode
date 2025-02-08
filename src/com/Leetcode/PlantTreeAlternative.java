package com.Leetcode;

public class PlantTreeAlternative {
    public static void main(String[] args) {
        int arr[] ={1,0,0,0,0,0,0,0,1};
        int n=3;

        System.out.println((planttree(arr,n)));
    }

    private static boolean planttree(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0){
            return true;
        }
        for(int i=0;i<flowerbed.length-1;i++){

            if(flowerbed.length%2 ==0){
                if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i+2]!=0){
                    n--;
                    i=i+1;
                    break;
                }
            }
            if(flowerbed[i]==0 && flowerbed[i+1]==0 ){
                n--;
                i=i+1;
            }


        }
        if(n==0){
            return true;
        }
        return false;
    }
}
