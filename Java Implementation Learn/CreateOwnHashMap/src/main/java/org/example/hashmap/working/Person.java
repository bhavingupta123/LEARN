package org.example.hashmap.working;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private int voterId;

    private String personName;

    public Person(int voterId, String personName){
        this.voterId = voterId;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "voterId=" + voterId +
                ", personName='" + personName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return voterId == person.voterId && Objects.equals(personName, person.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voterId, personName);
    }
}