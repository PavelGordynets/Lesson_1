package com.Gord.classwork.lec_9.task_9;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // next -> arrayLength
        int next;
        do {
            System.out.println("Введите колличество строк: ");
            while (!in.hasNextInt()) {
                System.out.println("ошибка.Введите число !!! ");
                in.next();
            }
            next = in.nextInt();
        }
        // это же бесконечный цикл?
        while (next < 0);
        
        String[] arr = new String[next];
        System.out.println("Ведите строки: ");
        // плохое название переменной
        Scanner iny = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            arr[i] = iny.nextLine();
        }
        System.out.println("\n"+"Строки длинна которых больше 5 символов: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                System.out.println(arr[i]);
            }
        }
    }
}

