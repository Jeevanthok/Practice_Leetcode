package com.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionByInStream {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> maplst = lst.stream()
                                           .collect(Collectors.partitioningBy(x->x%2==0));

        System.out.println("Even" + maplst.get(true));
        System.out.println("Even" + maplst.get(false));
    }
}
