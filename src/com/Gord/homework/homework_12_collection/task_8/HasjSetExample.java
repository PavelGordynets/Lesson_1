package com.Gord.homework.homework_12_collection.task_8;

import java.util.HashSet;

public class HasjSetExample {
    public static void main(String[] args) {
        Shop shop = new Shop(1,"sosedi");
        Shop shop1 = new Shop(1,"sosedi");
        Shop shop2 = new Shop(1,"sosedi");
        HashSet<Shop> shops=new HashSet<>();
        shops.add(shop);
        shops.add(shop1);
        shops.add(shop2);
        System.out.println(shops);
    }
}
