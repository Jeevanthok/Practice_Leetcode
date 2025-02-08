package com.array.practice;

import java.util.HashSet;

public class DuplicateDigitFromArray {
    public static void main(String[] args) {
        int arr[] = {123,456,789,234,321,567,888};
        HashSet<Integer> seenElement = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            int num = arr[i];
            while (num>0){
                int digit = num % 10;
                if (!seenElement.add(digit)){
                    duplicate.add(digit);
                }
                num = num/10;
            }

        }

            System.out.println("seen" + seenElement.toString());


            System.out.println("duplicate" +duplicate.toString());

    }
}
