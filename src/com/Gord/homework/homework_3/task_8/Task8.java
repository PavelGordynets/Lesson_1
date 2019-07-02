package com.Gord.homework.homework_3.task_8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        // int arrayLength = 10;
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = +(int) (Math.random() * 10);
            array3[i] = (double) array1[i] / array2[i];
        }
        int numberOfWholeNumbers = 0;
        for (int i = 0; i < array3.length; i++)
            if (array3[i] % 1 == 0) {
                numberOfWholeNumbers++;
            }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("The number of whole elements in the third array = " + numberOfWholeNumbers);
    }
}
