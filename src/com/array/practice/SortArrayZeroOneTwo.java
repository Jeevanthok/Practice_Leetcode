package com.array.practice;

public class SortArrayZeroOneTwo {
    public static void main(String[] args) {
        int[] arr ={1,1,0,2,2,0,1,0,2};
        int[] sortedarray = new int[arr.length];
        int zero=0;
        int one =0;
        int two =0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if (arr[i]==1){
                one++;
            }
            else if (arr[i]==2){
                two++;
            }
        }
        for (int j=0;j<zero;j++){
            sortedarray[j] =  0;
        }
        for(int k=zero;k<zero+one;k++){
            sortedarray[k] = 1;
        }
        for(int l=zero+one;l<zero+one+two;l++){
            sortedarray[l]=2;
        }

        sortwithalgo(arr,arr.length);
    }

    private static void sortwithalgo(int[] arr, int length) {
        int low=0;
        int mid=0;
        int high=length-1;

        while (mid<=high){
            if (arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] ==1) {
                mid++;
            }
            else if (arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;


            }
        }

    }
}
