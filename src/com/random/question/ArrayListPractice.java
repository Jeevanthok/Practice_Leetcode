package com.random.question;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
         addnumberinlist(lst);
        lst.forEach(System.out::println);

    }
    public static void addnumberinlist(List<Integer> lst){
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
      //  return lst;
    }

}
