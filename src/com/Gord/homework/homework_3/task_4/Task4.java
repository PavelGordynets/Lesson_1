package com.Gord.homework.homework_3.task_4;

import java.util.Arrays;

//+
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
