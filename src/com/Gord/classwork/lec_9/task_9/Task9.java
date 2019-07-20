package com.Gord.classwork.lec_9.task_9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.println("Введите колличество строк: ");
            while (!scanner.hasNextInt()) {
                System.out.println("ошибка.Введите число !!! ");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        }
        while (arrayLength < 0);
        String[] array = new String[arrayLength];
        System.out.println("Ведите строки: ");
        Scanner scannerString = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            array[i] = scannerString.nextLine();
        }
        System.out.println("\n"+"Строки длинна которых больше 5 символов: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5) {
                System.out.println(array[i]);
            }
        }
    }
}

