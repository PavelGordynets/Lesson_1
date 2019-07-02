package com.Gord.classwork.lec_3.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите элемент массива");
            int next = input.nextInt();//присваивает переменной next значения введенные пользовательем
            arr[i] = next;// заполняет массив введеными значениями пользователя
        }
        int max = arr[0];
        int min = arr[0];
        int sumMaxandMin = 0;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (min > elem) {
                min = elem;
            }
                if (max < elem) {
                    max = elem;
                }
            }
            sumMaxandMin = min + max;
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
            String ar = Arrays.toString(arr);
            System.out.println("sum" + sumMaxandMin);
        }
    }


