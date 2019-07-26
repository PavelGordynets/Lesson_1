package com.Gord.homework.homework_12_collection.task_3;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> collection1 = new ArrayList<>(5);
        collection1.add(3);
        collection1.add(2);
        collection1.add(4);
        collection1.add(5);
        collection1.add(6);
        
        System.out.println("You collection first: " + collection1);

        ArrayList<Integer> collection2 = new ArrayList<>(5);
        collection2.add(3);
        collection2.add(33);
        collection2.add(43);
        collection2.add(53);
        collection2.add(6);
        
        System.out.println("You two collection : " + collection2);
        
        collection1.removeAll(collection2);
        
        System.out.println("Corected first collection: " + collection1);
    }
}


