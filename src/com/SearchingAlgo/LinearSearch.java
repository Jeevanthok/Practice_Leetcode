package com.SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {12,10,6,8,5,44,78};
        int key = 2;
        int length = a.length-1;
        System.out.println(findTheKey(a,key,length));
    }

    private static boolean findTheKey(int[] a, int key, int length) {
        boolean flag = false;
        for(int i=0;i<length;i++){
            if (a[i] == key){
                flag=true;
                break;
            }
            else flag=false;
        }
        return flag;
    }
}
