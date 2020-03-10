package com.pod.examples;

import java.util.Arrays;
import java.util.List;

public class UserRepo {

    private List<User> listUsers;

    /**
     * Find All Users in Users Table
     * @return
     */
    public List<User> findAllUsers() {
        this.listUsers = Arrays.asList(new User("John", "Lee", 26), new User("Mike", "Carol", 28));
        return listUsers;
    }
}
