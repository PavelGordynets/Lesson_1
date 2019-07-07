package com.Gord.classwork.lec_10.task_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int sizeArray = scanner.nextInt();
            System.out.println("Введите максимальный размер массива: ");
            int maxSizeArray = scanner.nextInt();
            if (sizeArray > maxSizeArray) throw new IndexOutOfBoundsException();
            int[] array = new int[sizeArray];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(array));
        } catch (NegativeArraySizeException e) {
            System.out.println("Вы ввели отрицательное значение массива. Размер массива не может быть отрицательным.");
        } catch (InputMismatchException e) {
            System.out.println("Размер массива не может быть интексом.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Значение больше допустимого");
        }
    }
}
