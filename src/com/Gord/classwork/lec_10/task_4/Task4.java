package com.Gord.classwork.lec_10.task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите число:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("Вы ввели число : " + number);
            
            // if() {твой код}
            if (number % 2 == 1) throw new OddNumberException("Вы ввели нечетное число.Необходимо ввести четное число");
        } catch (OddNumberException e) {
            // пока не ошибка, но лучше пользователю не показывать стек трейс
            e.printStackTrace();
        }
    }
}
