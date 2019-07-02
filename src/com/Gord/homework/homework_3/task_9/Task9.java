package com.Gord.homework.homework_3.task_9;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int next;
        // этот код не компилируется, а значит, пушить его нельзя
        do {
            System.out.println("Enter a positive number ");
            while (!input.hasNextInt()) {
                System.out.println("That not a number. Enter a positive number ");
                input.next();
            }
            next = input.nextInt();
        }
        while (next < 0);
        int[] array = new int[next];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));
        int middleOfTheArray = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;
        for (int a = 0; a < array.length; a++) {
            if (a < middleOfTheArray) {
                leftSum += array[a];
            }
            if (a >= middleOfTheArray) {
                rightSum += array[a];
            }
        }
        System.out.println("left summ = " + leftSum);
        System.out.println("rigth summ = " + rightSum);
        if (leftSum > rightSum) {
            System.out.println("left side is more than right");
        }
        if (leftSum < rightSum) {
            System.out.println("the right side is larger than the left");
        }
        if (leftSum == rightSum) {
            System.out.println("left side = right side");
        }
    }
}

