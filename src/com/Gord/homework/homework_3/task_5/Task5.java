package com.Gord.homework.homework_3.task_5;

import java.util.Arrays;

// code -> reformat code. Не забывай пользоваться
public class Task5 {
    public static void main(String[] args) {
        // int arrayLength = 5;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double sum1 = 0;
        double averageValue1 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 15);
            sum1 += Double.valueOf(array1[i]);
            averageValue1 = sum1 / array1.length;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("The average value of the elements of the array 1 = " + averageValue1);
        System.out.println();
        double sum2 = 0;
        double averageValue2 = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 15);
            sum2 += Double.valueOf(array2[i]);
            averageValue2 = sum2 / array2.length;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("The average value of the elements of the array 1 = " + averageValue2);
        System.out.println();
        if (averageValue1 > averageValue2) {
            System.out.println("averageValue1>averageValue2");
        } else if (averageValue1 < averageValue2) {
            System.out.println("averageValue1<averageValue2");
        } else {
            System.out.println("averageValue1=averageValue2");
        }
    }
}
