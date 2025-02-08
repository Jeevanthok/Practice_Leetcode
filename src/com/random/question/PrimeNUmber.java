package com.random.question;

public class PrimeNUmber {
    public static void main(String[] args) {
        int num =11;
        int flag=0;
        if(num==0 || num ==1){
            System.out.println("number is not prime");
        }else {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("not prime number");
                     flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }
}
