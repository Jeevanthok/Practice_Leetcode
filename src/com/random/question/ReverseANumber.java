package com.random.question;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 987654;  //456789
        int reverse = 0;
        while (number>0){
            int remainder = number % 10;

            reverse = reverse * 10 + remainder;
            number = number/10;
        }
    }
}
