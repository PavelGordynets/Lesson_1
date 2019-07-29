package com.Gord.classwork.lec_14.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task_3 {
    private static final String APPLE = "Apple";
    private static final String SAMSUNG = "Sumsung";
    private static final String XIAOMI = "Xiaomi";

    public static void main(String[] args) {
        List<Phones> phones = new ArrayList<>();
        phones.add(new Phones("Xs", "Apple"));
        phones.add(new Phones("8", "Xiaomi"));
        phones.add(new Phones("3310", "LG"));
        phones.add(new Phones("S10", "Sumsung"));
        phones.add(new Phones("3310", "Nokia"));

        Set<String> producers = phones.stream()
                .filter(Phones->APPLE.equals(Phones.getManufacturer())||SAMSUNG.equals(Phones.getManufacturer())||XIAOMI.equals(Phones.getManufacturer()))
                .map(Phones::getManufacturer)
                .collect(Collectors.toSet());
        System.out.println(producers);
    }
}


