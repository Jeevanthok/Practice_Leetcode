package com.array.practice;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
    }
}
