package com.Gord.classwork.lec_10.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число 1: ");
        String num1 = scanner.next();
        System.out.println("Введите первое число 2: ");
        String num2 = scanner.next();
        try {
            Integer parsedNum1 = Integer.valueOf(num1);
            Integer parsedNum2 = Integer.valueOf(num2);

            try {
                System.out.println(parsedNum1 / parsedNum2);
            } catch (ArithmeticException e) {
                System.out.println("Hello from inside try-catch");
            }

            System.out.println("== After inside try-catch ==");

        } catch (NumberFormatException exception) {
            System.out.println("Sorry, you entered wrong number");
        } catch (Exception e) {
            System.out.println("Something goes wrong");
            e.printStackTrace();
        }
        System.out.println("After catch");
    }
}