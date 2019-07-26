package com.Gord.homework.homework_12_collection.task_6;

import java.util.ArrayList;

public class ArraListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new java.util.ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        System.out.println("you arralist : " + arrayList);
        long before = System.currentTimeMillis();
        
        // не просто удалить все, а удалять из начала, т.е. с индексом 0, пока ничего не останется,
        // чтобы затем сравнить скорость работы ArrayList -vs LinkedList
        arrayList.removeAll(arrayList);
        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("delete list : " + arrayList);
        System.out.println("The total time delete ArraList is: " + diff + "ms");
        
        // эту таску удобнее было бы сделать в 1 классе:
        // 1. сразу видны обе цифры
        // 2. метод по удалению был бы общим removeAllFromMiddle(List<Integer> toRemove)
    }
}
