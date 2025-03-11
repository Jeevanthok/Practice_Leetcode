package com.Stream.API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        emplist.add(emp3);
        emplist.add(emp4);

        Optional<Employe> maxsalary = emplist.stream().max(Comparator.comparingDouble(Employe::getSalary));

        Optional<Employe> secondmaxsalary = emplist.stream().sorted(Comparator.comparingDouble(Employe::getSalary).reversed())
                        .skip(1).findFirst();
        System.out.println(secondmaxsalary);
        maxsalary.ifPresent(System.out::println);
        System.out.println(maxsalary.toString());

    }
}
