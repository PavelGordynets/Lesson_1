package com.Gord.homework.homework_1.task_7;

public class Task7 {
        public static void main (String[]args){
            int numberOfProgrammers = 4461;
            String ending;
            if (numberOfProgrammers % 10 == 1 && numberOfProgrammers % 100 != 11) {
                ending = "";
            } else if (numberOfProgrammers % 10 == 2 && numberOfProgrammers % 100 != 12 ||
                    numberOfProgrammers % 10 == 3 && numberOfProgrammers % 100 != 13 ||
                    numberOfProgrammers % 10 == 4 && numberOfProgrammers % 100 != 14) {
                ending = "a";
                // else {}
            } else ending = "oв";
            System.out.println("У нас есть " + numberOfProgrammers + " программист" + ending);
        }
    }
