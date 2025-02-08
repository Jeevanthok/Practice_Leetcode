package com.array.practice;

public class BuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

        // using recursion
        int i=0;
        int max=0;
        maxProfitUsingRecursion(i,max,arr);
    }

    private static void maxProfitUsingRecursion(int i, int max, int[] arr) {
        
    }


    private static int maxProfit(int[] prices) {
        int maxProfit=0;
        int newmaxprofit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    maxProfit=prices[j]-prices[i];
                     newmaxprofit = Math.max(maxProfit,newmaxprofit);
                }
            }
        }
        return newmaxprofit;
    }
}



