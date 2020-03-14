package com.pod;

import java.util.Calendar;

@FunctionalInterface
public interface AgeFinder {

    Integer calculate(Person person);

    //Integer when(User user);

    static AgeFinder findYear() {
        return x -> Calendar.getInstance().get(Calendar.YEAR) - x.getAge();
    }

    static AgeFinder findAgeInDays() {
        return x -> {
            int num = x.getAge();
            num *= 365;
            return num;
        };
        //return x -> x.getAge() * 365;
    }

    default int getAge(Person person) {
        return person.getAge();
    }
}
