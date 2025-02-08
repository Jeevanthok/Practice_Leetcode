package com.array.practice;

public class SubArrayMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3,-5,1,2,3,-1,6};
        //maxsumsubarray(arr);
        bykadansAlgo(arr);
    }

    private static void bykadansAlgo(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            max = Math.max(max,sum);
            if (sum<0){
                sum=0;
            }
        }
        System.out.println("Max sum is :-" + max);
    }

    private static void maxsumsubarray(int[] arr) {

        int maax=Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum= sum+arr[j];
                 maax = Math.max(maax,sum);
            }
        }
        System.out.println(maax);
    }
}
