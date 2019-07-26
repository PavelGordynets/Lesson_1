package com.Gord.homework.homework_12_collection.task_5;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        System.out.println("you linkedList: " + linkedList);
        long before = System.currentTimeMillis();

        /*
        while (linkedList.size() > 0) {
            linkedList.remove(linkedList.size() / 2);
        }
        */
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("delete list : " + linkedList);
        System.out.println("The total time delete LinkedList is: " + diff + "ms");
    }
}
