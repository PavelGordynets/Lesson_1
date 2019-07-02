package com.Gord.homework.homework_2.task_8;

public class Task8 {
        public static void main (String [] args) {
                // не надо выносить эти переменные из цикла. ->  for (int i = 4; i > 0; i--)
            for (int i = 4; i > 0; i--) {// внес переменные в цикл
                for (int j = 1; j <= 4; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    }
                    if (j >= i) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
}
