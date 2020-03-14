package com.pod;

public class Person {

    private String firstName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
}
