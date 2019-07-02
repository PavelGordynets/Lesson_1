package com.Gord.homework.homework_3.task_7;

import java.util.Arrays;

//+
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max element: " + maxNumber);
        System.out.println("Maximum Item Index: " + maxIndex);
    }
}
