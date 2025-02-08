package com.random.question;

public class FactorialOfnumber {
    public static void main(String[] args) {
        int i =6;
        int sum=1;

//        6! == 6*5*4*3*2*1 = 720.
//        5! == 5*4*3*2*1 = 120
//        4! == 4*3*2*1 =24
        for (int j=i;j>0;j--){
          sum= j*sum;
        }
        System.out.println(sum);
    }
}
