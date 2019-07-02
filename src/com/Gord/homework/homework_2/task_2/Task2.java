package com.Gord.homework.homework_2.task_2;

public class Task2 {
    public static  void  main ( String [] args){
        int numberAmoeba=1;
        int sumTheResoultOfAmoebaDivision=0;

        /*
        попробуй убрать переменную timeDivisionAmoeba, а i использовать как часы. В цикле можно заменить i++ -> i += 3,
        чтобы прибавлять каждый раз 3 часа
        */
        for(int i=0; i<=24;i+=3){
            numberAmoeba*=2;
            System.out.println("through "+i+" Number of amoebas will be "+numberAmoeba);
        }
    }
}
