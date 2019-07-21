package com.Gord.homework.homework_12_collection.task_2;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            listNumber.add(0, i);
        }


        System.out.println(listNumber);
        for (Integer i:listNumber) {
            if (listNumber.get(i)%2==0) {
                listNumber.remove(i);
            }
    }
        System.out.println(listNumber);
    }
}

