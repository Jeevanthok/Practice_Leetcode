package com.Leetcode;

public class StringComparison {
    public static void main(String[] args) {
        char arr[] = {'a'};
        String str="";
        int k=0;
        int index=0;
        for (int i=0;i<=arr.length;i++) {
            if (k < i) {
                int count = 0;
                char curch = arr[k];
                for (int j = k; j <arr.length; j++) {
                    if (curch == arr[j]) {
                        count++;
                    }
                }
                k = k + count;
                str = str + curch;
                str = str + count;

            }
        }
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if(index<str.length()-1){
            arr[index] = ch;
            index = index + 1;
            }
        }
    }
}
