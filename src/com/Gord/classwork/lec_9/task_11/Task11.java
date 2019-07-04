package com.Gord.classwork.lec_9.task_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        int maxLengthString = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLengthString) {
                maxLengthString = arr[i].length();
            }
            System.out.println("Max length string: " + maxLengthString);
        }
    }
}