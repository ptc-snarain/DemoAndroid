package com.example.demoandroid.data.model;

public class UserModel {

    private static String username;

    public static void setUsername(String username) {
        UserModel.username = username;
    }

    public static String getUsername() {
        return UserModel.username;
    }
}
