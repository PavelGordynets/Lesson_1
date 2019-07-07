package com.Gord.classwork.lec_10.task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите число:");
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            System.out.println("Вы ввели число : "+ number);
            if (number%2==1) throw new UnderAttackException();
        } catch (UnderAttackException e) {
            System.out.println("Вы ввели нечетное число.Необходимо ввести четное число");
        }


    }
}
