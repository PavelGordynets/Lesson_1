package com.Gord.homework.homework_12_collection.task_5;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new java.util.ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        System.out.println("razmer : " + arrayList.size());
        System.out.println("you arralist : " + arrayList);
        long before = System.currentTimeMillis();

        /*
        while (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() / 2);
        }
        */
        
        // !ПРАВИЛО: если ты копируешь кучу одинакового кода, значит, ты что-то делаешь не так
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.size() / 2);
        }

        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("delete list : " + arrayList);
        System.out.println("razmer : " + arrayList.size());
        System.out.println("The total time delete ArraList is: " + diff + "ms");
    }
}
