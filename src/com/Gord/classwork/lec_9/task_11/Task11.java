package com.Gord.classwork.lec_9.task_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.println("Введите колличество строк: ");
            while (!in.hasNextInt()) {
                System.out.println("ошибка.Введите число !!! ");
                in.next();
            }
            arrayLength = in.nextInt();
        }
        while (arrayLength < 0);
        String[] array = new String[arrayLength];
        System.out.println("Ведите строки: ");
        Scanner iny = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            array[i] = iny.nextLine();
        }
        int maxLengthString = 0;
        int minLengthString = 0;
        // самую длинную и короткую строки нужно куда-нибудь сохранить и затем вывести на экран
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLengthString) {
                maxLengthString = array[i].length();
            }
        }
        System.out.println("Max length string: " + maxLengthString);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > minLengthString) {
                minLengthString = array[i].length();
            }
        }
        System.out.println("Min length string: " + minLengthString);
    }
}