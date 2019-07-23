package com.Gord.homework.homework_12_collection.task_7;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(0);
        System.out.println(treeSet);

        Iterator i = treeSet.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
