package com.Gord.homework.homework_1.task_2;

public class Task2 {
    public static void main(String[] args) {
        double a = 5.1;
        double b = -2.1;
        double c = -5.1;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("\n" + "Such a triangle exists");
        } else {
            System.out.println("\n" + "Тriangle does not exist");
        }
    }
}