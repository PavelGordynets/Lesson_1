package com.Gord.classwork.lec_3.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){
        int [] arr = new int [3];
        Scanner input= new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Введите элемент массива");
            int next=input.nextInt();
            arr [i]=next;
        }
        double sum=0;
        double averageValue=0;
        for (int i=0;i<arr.length;i++){
            sum+=Double.valueOf(arr[i]);
            averageValue=sum/arr.length;
        }
        String ar= Arrays.toString(arr);
        System.out.println(ar);
        System.out.println("Sum = "+averageValue);
    }
}
