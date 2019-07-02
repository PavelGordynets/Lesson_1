package com.Gord.homework.homework_2.task_5;


public class Task5 {
    public static void main(String[] args) {
        int inch = 0;
        double inchValue = 2.54;
        double firstValueTable = 1;
        for (int i = 1; i <= 20; i++) {
            firstValueTable = i * inchValue;
            String ending;
            if (i % 10 == 1 && i % 100 != 11) {
                ending = "";
            } else if (i % 10 == 2 && i % 100 != 12 ||
                    i % 10 == 3 && i % 100 != 13 ||
                    i % 10 == 4 && i % 100 != 14) {
                ending = "a";
            } else {
                ending = "oв";
            }
            System.out.println(i + " дюйм" + ending + " = " + firstValueTable + " см" );
        }
    }
}

