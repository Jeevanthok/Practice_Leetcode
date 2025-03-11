package com.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("app", "app1", "bana1na", "cherryyyyyy", "apple", "ban11a");

        /*find 5 th largest point
        int[] arr = {11,2,13,40,5,65,7,8,9,10};
                                          // 2,5,7,8,9,10,11,13,40,65
        Optional<Integer> fifthLargest = Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(5)
                .findFirst();
        System.out.println(fifthLargest);
         */

        /*find distinct strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
                                  words.stream()
                                 .distinct()
                                 .forEach(System.out::println);

         /* to uppercase
        words.stream()
                .map(x->x.toUpperCase())
                .forEach(System.out::println);
         */

        /*tart with A


        words.stream()
                .filter(e->e.startsWith("a"))
                .forEach(System.out::println);
*/

    /* max length string
       String str = String.valueOf(words.stream()
               .max((s1,s2)->Integer.compare(s1.length(),s2.length())));
        System.out.println(str);
    }
    */

        /*
        Map<Integer, List<String>> map = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map.toString());
*/

      /*  String num = "123";
        int sum = num.chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.print(sum);
        */

       Map<Integer,String>  map = words.stream()
                                .collect(Collectors.toMap(str ->str.length(),Function.identity()));

       for (Map.Entry<Integer,String> map1 : map.entrySet()){
           System.out.println(" " + map1.getKey() + " " + map1.getValue());
       }
    }
}
