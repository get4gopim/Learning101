package com.pod.examples;

import java.util.Optional;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    private MemberCard memberCard;

    public Optional<MemberCard> getMemberCard() {
        return Optional.ofNullable(memberCard);
    }

    public User() {
    }

    public User(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
