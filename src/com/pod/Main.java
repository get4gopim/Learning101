package com.pod;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test com.example.learning.Main");
        Main c1 = new Main();

        Person person = new Person("John", 33);
        System.out.println("Date of Year: " + calculateAge(x -> getYear(x), person) );

        User user = new User(44);
        System.out.println("Year: " + calculateAge(x -> getYear(x), user) );

        System.out.println("christmasDiscounter: " + Discounter.christmasDiscounter().applyDiscount(BigDecimal.valueOf(5000) ) );

        System.out.println("Person Year: " + AgeFinder.findYear().calculate(person) );
        System.out.println("Person AgeInDays: " + AgeFinder.findAgeInDays().calculate(person) );

        System.out.println("Person Age: " + AgeFinder.findAgeInDays().getAge(person) );

        ShortToByteFunction function = x -> (byte) (x*3);
        short s = 129;
        System.out.println("shortToByte: " + function.shortToByte(s));

        System.out.println("shortToByte: " + ShortToByteFunction.convert().shortToByte(s) );
    }

    private static Integer getYear(Person person) {
        return Calendar.getInstance().get(Calendar.YEAR) - person.getAge();
    }

    private static Integer getYear(User user) {
        return Calendar.getInstance().get(Calendar.YEAR) - user.getAge();
    }

    private static <T, R> R calculateAge(Function<T, R> function, T person) {
        return function.apply(person);
    }

}
