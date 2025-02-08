package com.random.question;

import java.util.HashMap;
import java.util.Map;

public class CharToIntSum {
    public static void main(String[] args) {
        final String str ="MCMXCIV";
        int sum =0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        //III --->5
        //LVIII --->58
        //MCMXCIV ---->1994 M=1000 CM=900 XC=90 IV =4
        for(int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);
            int num1 = map.get(c);
            int firstvalue = map.get(str.charAt(i));
            int secondvalue = map.get(str.charAt(i+1));
            if (secondvalue>firstvalue){
                sum =sum+ (secondvalue-firstvalue);
               i= i+1;
            }
            else {
                sum = sum+ map.get(str.charAt(i));
            }
        }

        System.out.println(sum);
    }
}
