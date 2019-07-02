package com.Gord.homework.homework_3.task_2;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[50];
        int i = 0;
        int b = 1;
        // arr.length
        while (i < 50) {
            arr[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n Sorted: \n");
        /* ты отсортировал массив, затем вывел его на экран. Это двойная работа. У тебя итак массив сортирован,
        нужно было просто бежать в обратном порядке
        */
        Arrays.sort(arr, Collections.reverseOrder());
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

