package com.random.question;

public class PallindromNumber {
    public static void main(String[] args) {
        int num =121;
        int temp=num;
        int sum=0;
        int r=0;
        while(num>0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

