package com.SearchingAlgo;



public class BinarySearchAlgo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,9,10,12,13};
        int key = 11;
        int length = a.length-1;
        System.out.println(findTheKeyUsingBinary(a,key,0,length));
    }

    private static boolean findTheKeyUsingBinary(int[] a, int key, int l, int r) {
        while (l<=r){
            int m = (l+r)/2;
            if (a[m] == key) return true;
            else if (key < a[m]){
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return false;
    }


}
