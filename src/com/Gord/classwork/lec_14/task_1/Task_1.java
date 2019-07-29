package com.Gord.classwork.lec_14.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("what is you name?");
        stringList.add("what");
        stringList.add("not");
        System.out.println("stringList = " + stringList);

        List<String> filteredByLength = stringList.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("filteredByLength = " + filteredByLength);
    }
}
