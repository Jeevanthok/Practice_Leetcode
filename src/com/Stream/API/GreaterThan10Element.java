package com.Stream.API;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class GreaterThan10Element {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(12);
        lst.add(3);
        lst.add(30);
        lst.add(56);
        lst.add(65);
        lst.add(5);
        lst.add(89);

        OptionalDouble lst1 = lst.stream().filter(x->x>=10)
                .mapToInt(n->n)
                .average();
        System.out.println(lst1);
    }
}
