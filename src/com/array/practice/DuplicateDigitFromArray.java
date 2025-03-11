package com.array.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDigitFromArray {
    public static void main(String[] args) {
        int arr[] = {123,456,789,234,321,567,888};
        int arr2[] = {1,2,3,3,4,4,5,6,7,3,6};
        findDuplicateDigit(arr2);
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

    private static void findDuplicateDigit(int[] arr2) {
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> alreadyavalailbe = new HashSet<>();
        for (int i=0;i<arr2.length;i++) {
            if (!duplicate.add(arr2[i])) {
                alreadyavalailbe.add(arr2[i]);
            }
        }
    }
}
