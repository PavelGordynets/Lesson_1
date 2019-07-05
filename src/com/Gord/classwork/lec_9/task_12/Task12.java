package com.Gord.classwork.lec_9.task_12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // плохое название переменной
        int next;
        do {
            System.out.println("Введите колличество строк: ");
            while (!in.hasNextInt()) {
                System.out.println("ошибка.Введите число !!! ");
                in.next();
            }
            next = in.nextInt();
        }
        while (next < 0);
        String[] arr = new String[next];
        System.out.println("Ведите строки: ");
        Scanner iny = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            arr[i] = iny.nextLine();

        }
//Здесь происходит сортировка (сортировка пузырьком):
        // не нужно оставлять такие комментарии, вынеси этот код в отдельный метод
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
        System.out.println("\n" + "Результат сортировки: ");
        // не ошибка, но Arrays.toString() сюда очень хорошо подходит
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


