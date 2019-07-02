package com.Gord.homework.homework_1.task_5;

public class Task5 {
    public static void main(String[] args){
        int number1 =-1;
        int number2 =0;
        int number3=1;
        int sum1=0;
        int sum2=0;
        if ( number1>=0){
            sum1++;
        }
        else {
            sum2++;
        }
        if(number2>=0){
            sum1++;
        }
        else {
            sum2++;
        }
        if(number3>=0){
            sum1++;
        }
        else{
            sum2++;
        }
        System.out.println("\n"+ "The number of positive numbers = "+sum1);
        System.out.println("\n"+"The number of negative numbers = "+sum2);
    }
}
