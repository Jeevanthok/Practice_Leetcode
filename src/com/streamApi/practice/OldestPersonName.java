package com.streamApi.practice;

import javax.naming.Name;
import java.util.*;
import java.util.stream.Collectors;

public class OldestPersonName {
    static class Person {
        private String Name;
        private String type;
        private Date date;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "Name='" + Name + '\'' +
                    ", type='" + type + '\'' +
                    ", date=" + date +
                    '}';
        }

        public Person(String name, String type, Date date) {
            this.Name = name;
            this.type = type;
            this.date = date;
        }
    }

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        Calendar cal4 = Calendar.getInstance();
        cal1.set(2000, Calendar.DECEMBER, 12);
        cal2.set(1999, Calendar.DECEMBER, 12);
        cal3.set(2001, Calendar.DECEMBER, 10);
        cal4.set(2005, Calendar.DECEMBER, 13);
        List<Person> psn = Arrays.asList(new Person("Jeevan","Male", cal1.getTime()),
                                         new Person("Stayam","Male",cal2.getTime()),
                                         new Person("Rahul","Male",cal3.getTime()),
                                         new Person("Ketan","Male",cal3.getTime()));

       //Person person = psn.stream().filter(e->e.getName().equals("Rahul")).findFirst().orElse(null);
       // System.out.println(person.toString());
        Optional<Person> oldpersonname = psn.stream().
                min(Comparator.comparing(Person::getDate));
        System.out.println(oldpersonname);
    }
}
