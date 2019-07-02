package com.Gord.homework.homework_3.task_3;

// Нужно было найти четные
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        // n -> quantityOfEvenElements
        int quantityOfEvenElements = 0;
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                quantityOfEvenElements++;
                sum += arr[x];
                System.out.println("Even element: " + arr[x]);
            }
        }
        System.out.println("Total Even element = " + quantityOfEvenElements);
        System.out.println("The sum of Even element = " + sum);
    }
}
