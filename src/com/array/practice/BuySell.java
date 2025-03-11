package com.array.practice;

public class BuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
      //  System.out.println(maxProfit(arr));
        int i=0;
        int max=0;

        System.out.println(maxProfitusinfoneLoop(arr));
    }

    private static int maxProfitusinfoneLoop(int[] arr) {
        if (arr.length == 0 || arr == null) return 0;

        int minprice=arr[0];
        int maxProfit = 0;
        for (int i=1;i<arr.length;i++){
            if (minprice > arr[i]){
                minprice = arr[i];
            }else {
                int max = arr[i] - minprice;
                maxProfit = Math.max(max,maxProfit);
            }
        }
        return maxProfit;
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



