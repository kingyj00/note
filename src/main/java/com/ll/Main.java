package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice", 20, 'F'));
        people.add(new Person(2, "Bob", 25, 'M'));
        people.add(new Person(3, "David", 35, 'M'));

        // 문제 : 남성의 이름들

        System.out.println("== No Stream ==");
        noStreamVersion(people);

        System.out.println("== Stream ==");
        streamVersion(people);
    }

    private static void noStreamVersion(List<Person> people) {
        Person found = null;

        for (Person person : people) {
            if (person.getId() == 2) {
                found = person;
                break;
            }
        }

        if (found == null) {
            System.out.println("not found");
            return;
        }

        System.out.println("found : " + found.getName());
    }

    private static void streamVersion(List<Person> people) {
        Optional<Person> opPerson = people.stream()
                .filter(e -> e.getId() == 2)
                .findFirst();

        Person found = opPerson.orElse(null);

        if (found == null) {
            System.out.println("not found");
            return;
        }

        System.out.println("found : " + found.getName());
    }
}

class Person {
    private int id;
    private String name;
    private int age;
    private char gender;

    public Person(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}