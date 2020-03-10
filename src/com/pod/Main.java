package com.pod;

public class Main {

    private String userName;

    public Main(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void main(String[] args) {
        System.out.println("Test com.example.learning.Main");
    }

    private void test() {
        System.out.println("");
        Main c2 = new Main("3");
        Main c1 = new Main("23");
    }
}
