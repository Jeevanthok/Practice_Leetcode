package com.random.question;

public class FindFactorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial=0;
        for (int i=num;i>0;i--){
             factorial+=num*num-1;
        }
        System.out.println(factorial);
    }
}
