package com.Gord.homework.homework_13_Date.task_2;

import java.util.function.Function;

public class Task_2 {
    public static void main(String[] args) {
        Function<Integer, String> intToString = (number) -> "BYN " + String.valueOf(number);
        String result = intToString.apply(100);
        System.out.println("Cумма на счете : " + result);
    }
}
