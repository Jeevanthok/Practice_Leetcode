package com.Stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IncreasingOrderLength {
    public static void main(String[] args) {
        List<String> strLst = Arrays.asList("Jeevan","Rajendra","Thok","aa");
         strLst.stream()
                .sorted((Comparator.comparing(String::length)))
                .forEach(System.out::println);
         String str = "Jeevan Rasjendra THok";

        Optional<String>  outputstring = Optional.ofNullable(String.valueOf(Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length))));
        System.out.println(outputstring.get());
    }
}
