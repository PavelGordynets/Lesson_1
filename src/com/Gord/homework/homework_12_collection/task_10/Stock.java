package com.Gord.homework.homework_12_collection.task_10;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Stock {
    public static void main(String[] args) {

        HashMap<String, Fruit> stocks = new HashMap();
        Fruit apple = new Fruit("apple", 2);
        Fruit banana = new Fruit("banana", 2);
        Fruit lemon = new Fruit("lemon", 1);
        stocks.put("1", apple);
        stocks.put("2", banana);
        stocks.put("3", lemon);
        stocks.put("4", banana);

        Set<Map.Entry<String, Fruit>> set = stocks.entrySet();
        for (Map.Entry<String, Fruit> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
