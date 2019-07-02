package com.Gord.homework.homework_3.task_6;

import java.util.Arrays;

//+
public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The array is a strictly increasing sequence.");
        } else {
            System.out.println("Array is not a strictly increasing sequence.");
        }
    }
}
