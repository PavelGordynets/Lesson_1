package com.Gord.homework.homework_13_Date.task_3;

import java.util.function.BinaryOperator;

public class Task_3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        System.out.println("Результат умножения : " + binaryOperator.apply(32, 3)); // 15
        System.out.println("Результат умножения : " + binaryOperator.apply(130, 2)); // -20
    }
}