package com.Gord.homework.homework_13_Date.task_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "apple"));
        products.add(new Product(2, "box"));
        products.add(new Product(3, "car"));
        System.out.println("List product : " + products);
        localDateTime(products);
        System.out.println("Time add product :" + products);
    }

    public static void localDateTime(List<Product> products) {
        for (Product product : products) {
            product.setDateAdd(LocalDateTime.now());
        }
    }
}
