package com.Gord.homework.homework_1.task_1;


/*Думаю гораздо проще определить исло <0 или >0 и затем решить сколько в нем цифр.
Можно как вариант после определения знака умножить на -1
Пока очень неоптимально*/

public class Task1 {
    public static void main(String[] args){
        short number = -151;
        if( number<10 & number>=0 ){
            System.out.println("\n"+"Number "+number+" single digit possitiv number");
        }
        if (number<100 & number>=10){
            System.out.println("\n"+"Number "+number+" two-digit possitiv number ");
        }
        if (number<1000 & number>=100){
            System.out.println("\n"+"Number "+number+" three-digit possitiv number ");
        }
        if( number>-10 & number<0 ){
            System.out.println("\n"+"Number "+number+" single digit negative number");
        }
        if (number>-100 & number<=-10){
            System.out.println("\n"+"Number "+number+" two-digit negative number ");
        }
        if (number>-1000 & number<-100){
            System.out.println("\n"+"Number "+number+" three-digit negative number ");
        }
        if (number>=10000&number<=-10000){
            System.out.println("\n"+"no matches");
        }


    }
}
