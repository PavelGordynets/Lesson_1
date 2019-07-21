package com.Gord.homework.homework_12_collection.task_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            listNumber.add(0, i);
        }
        System.out.println("Ваш список : " + listNumber);
        Iterator<Integer> iterator = listNumber.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Ваш список после удаления : "+listNumber);
    }
}
