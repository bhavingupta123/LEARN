package org.example.hashmap.working;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(0);
        hashSet.add(40);

        System.out.println(hashSet);

        System.out.println(hashSet.add(10));

        System.out.println(hashSet);

        System.out.println("--------------------");


        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person(101, "Abhilash"));
        personHashSet.add(new Person(102, "Abhishek"));
        personHashSet.add(new Person(103, "Ramesh"));
        personHashSet.add(new Person(101, "Abhilash"));

        System.out.println(personHashSet);


        // 2 different objects can have the same hashcode
        System.out.println(new String("FB").hashCode());
        System.out.println(new String("Ea").hashCode());

    }
}
