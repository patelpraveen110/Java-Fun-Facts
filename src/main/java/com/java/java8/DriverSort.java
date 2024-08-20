//to sort the person array by Name and if two person have same name then by Age

package com.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DriverSort {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Praveen", 27));
        persons.add(new Person("Kanha", 41));
        persons.add(new Person("Shyam", 51));
        persons.add(new Person("Shaishav", 25));
        persons.add(new Person("Mukul", 26));
        persons.add(new Person("Shaishav", 34));

        //method 1
        Collections.sort(persons, Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));
        System.out.println(persons);

        System.out.println("------------------------------------------------------");

        //method 2
        Comparator<Person> byName = (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName());
        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);
        persons.stream().sorted(byName.thenComparing(byAge)).forEach(System.out::println);
    }
}
