package com.Gord.homework.homework_3.task_1;

import java.util.Arrays;

//+
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            arr[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
