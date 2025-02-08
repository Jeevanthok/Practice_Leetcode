package com.streamApi.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddIndexCharacter {
    public static void main(String[] args) {
        String str ="Welcome";

        String finalstr =null;
        finalstr = IntStream.range(0,str.length())
                          .filter(i->i%2==0)
                          .mapToObj(str::charAt)
                          .map(String::valueOf)
                          .collect(Collectors.joining());
        System.out.println(finalstr);
    }
}
