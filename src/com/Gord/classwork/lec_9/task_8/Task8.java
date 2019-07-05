package com.Gord.classwork.lec_9.task_8;

import java.util.Scanner;

// нужен класс Car, а склад - это массив машин
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int next;
        do {
            System.out.println("Введите колличество машин: ");
            while (!in.hasNextInt()) {
                System.out.println("ошибка.Введите число !!! ");
                in.next();
            }
            next = in.nextInt();
        }
        while (next < 0);
        String[] arr = new String[next];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Car "+ (i+1));
            Scanner car = new Scanner(System.in);
            arr[i] = car.nextLine();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {

        }

    }
}
