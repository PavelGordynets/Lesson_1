package com.Gord.homework.homework_13_Date.task_4;

public class UserMain {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Pavel");
        System.out.println("New user : " + user.getNameUser());
    }
}


