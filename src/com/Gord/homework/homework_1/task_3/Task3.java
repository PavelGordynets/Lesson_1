package com.Gord.homework.homework_1.task_3;

public class Task3 {
    public static void main(String[] args) {
        double number = 5.3;
        if (number>0){
            number++;
            System.out.println("\n"+"Number "+number);
        }
        if (number<0){
            number -= 2;
            System.out.println("\n"+"Number " + number);
        }
        if(number==0){
            number =10;
            System.out.println("\n"+"Number "+number);
        }
    }
}
