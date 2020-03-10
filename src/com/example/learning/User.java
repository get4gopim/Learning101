package com.example.learning;

import java.util.function.BiFunction;

public class User {

    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println(service.getUserAccess(UserType.DEFAULT, 2));
        System.out.println(service.getUserAccess(UserType.FREE, 2));
        System.out.println(service.getUserAccess(UserType.VIP, 2));
        System.out.println(service.getUserAccess(UserType.PREMIUM, 2));
    }
}

enum UserType {
    FREE(UserService::determineUserByPoints),
    VIP(UserService::determineUserByPoints),
    PREMIUM(UserService::determineUserByPoints),
    DEFAULT(UserService::determineUserByPoints);

    public final BiFunction<UserService, Integer, Integer> typeAlgorithm;

    private UserType(BiFunction<UserService, Integer, Integer> typeAlgorithm) {
        this.typeAlgorithm = typeAlgorithm;
    }
}

class UserService {
    public Integer determineUserByPoints(int price) {
        return 2;
    }

    public Integer getUserAccess(UserType type, int price) {
        return type.typeAlgorithm.apply(this, price);
    }
}
