package com.Gord.classwork.lec_3.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int summArray = 0;
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите элементы масива ");
            int next = input.nextInt();
            arr[i] = next;
            summArray += next;
        }
        String ar = Arrays.toString(arr);
        System.out.println(ar);
        System.out.println(summArray);

    }
}
