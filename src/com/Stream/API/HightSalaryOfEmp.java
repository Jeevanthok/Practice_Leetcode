package com.Stream.API;

import java.util.*;

public class HightSalaryOfEmp {
    public static void main(String[] args) {
        Employe emp = new Employe(1,"Emp1",1236);
        Employe emp1 = new Employe(2,"Emp2",136);
        Employe emp2 = new Employe(3,"Emp3",11236);
        Employe emp3 = new Employe(4,"Emp4",121212);
        Employe emp4 = new Employe(5,"Emp5",1136);

        List<Employe> emplist = new ArrayList<>();
        emplist.add(emp);
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);

//       Optional<Employe> sec =  emplist.stream().max((e1, e2)-> Double.compare(e1.getSalary(),e2.getSalary()));
//        System.out.println("seeeeeeeec"   + sec);

        Optional<Employe> maxsalary = emplist.stream().max(Comparator.comparingDouble(Employe::getSalary));
        System.out.println("Max salary" + maxsalary.get());
        Optional<Employe> secondmaxsalary = emplist.stream().
                        sorted(Comparator.comparingDouble(Employe::getSalary).reversed())
                        .skip(1).findFirst();
        System.out.println("second highest" + secondmaxsalary.get());
        maxsalary.ifPresent(System.out::println);

     OptionalDouble secondHighSalary = emplist.stream()
             .mapToDouble(Employe::getSalary)
             .skip(emplist.size() - 1)
             .findFirst();
        System.out.println("new " +secondHighSalary);
        double secondSalary = secondHighSalary.getAsDouble();

        System.out.println("       -----    ");
        emplist.stream()
                .filter(e -> e.getSalary() == secondSalary)
                .forEach(System.out::println);
    }
}
