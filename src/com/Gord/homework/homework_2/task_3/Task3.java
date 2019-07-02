package com.Gord.homework.homework_2.task_3;

public class Task3 {
    public static void main (String [] args) {
        int sumResult = 0;
        // i++ -> i += 2
        // так ты избавишься от лишней переменной
        for (int i = 1; i <= 256; i *= 2) {
            sumResult += i;
        }
        System.out.println("sum of all numbers = "+sumResult);
    }
}