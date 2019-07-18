package com.Gord.classwork.lec_12.task_2;

import java.text.DecimalFormat;

public class TmsArrayUtils<T> {

    public static <T extends Number> int getSum(T[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        System.out.println("Сумма всех чисел массива = " + sum);
        return sum;
    }

    public static <T extends Number> double getAverageValue(T[] array) {
        double AverageValue = 0;
        for (int i = 0; i < array.length; i++) {
            AverageValue += array[i].doubleValue();
        }
        AverageValue /= array.length;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Среднее значение = " + df.format(AverageValue));
        return AverageValue;
    }

    public static void main(String[] args) {
        Integer[] arrayNumber = {6, 5, 5, 5, 5, 6};
        System.out.println("Колличество элемментов в массиве = " + arrayNumber.length);
        TmsArrayUtils.getSum(arrayNumber);
        TmsArrayUtils.getAverageValue(arrayNumber);

    }
}

