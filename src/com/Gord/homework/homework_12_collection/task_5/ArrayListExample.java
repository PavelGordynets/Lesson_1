package com.Gord.homework.homework_12_collection.task_5;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new java.util.ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        System.out.println("you arralist : " + arrayList);
        long before = System.currentTimeMillis();
        arrayList.removeAll(arrayList);
        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("delete list : " + arrayList);
        System.out.println("The total time delete ArraList is: " + diff + "ms");
    }
}
