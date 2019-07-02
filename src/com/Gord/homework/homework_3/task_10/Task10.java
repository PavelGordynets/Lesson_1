package com.Gord.homework.homework_3.task_10;

import java.util.Arrays;
import java.util.Scanner;

//+
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 3 ");
        int n = input.nextInt();
        int i;
        while (n < 3) {
            System.out.println("You entered an invalid number. Enter a number> = 3");
            n = input.nextInt();
        }
        int[] array1 = new int[n];
        int evenNums = 0;
        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * n);
            if (array1[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[evenNums];
        int index = 0;
        for (i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}

