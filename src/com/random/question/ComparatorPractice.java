package com.random.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice {
    int age;
    String name;
    String address;
    int id;

    @Override
    public String toString() {
        return "ComparablePractice{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public ComparatorPractice(int age, String name, String address, int id) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

class Main12{
    public static void main(String[] args) {
        ArrayList<ComparatorPractice>  comparablePractices = new ArrayList<>();
        comparablePractices.add(new ComparatorPractice(11,"test1","address1",4));
        comparablePractices.add(new ComparatorPractice(9,"test2","address2",3));
        comparablePractices.add(new ComparatorPractice(14,"test3","address3",1));
        comparablePractices.add(new ComparatorPractice(20,"test4","address4",2));
        Collections.sort(comparablePractices,new ComparatorTest());
        for (ComparatorPractice comparablePractice: comparablePractices)
            System.out.println(comparablePractice);
    }
}
