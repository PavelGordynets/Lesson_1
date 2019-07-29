package com.Gord.classwork.lec_14.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task_2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("the longest");
        strings.add("but, this the longest");
        strings.add("yee");
        strings.add("long");
        Comparator<String> byLength = (x,y) -> Integer.valueOf(x.length()).compareTo(y.length());
        Comparator<String> natural = Comparator.comparing(String::toLowerCase);
        Optional<String> max = strings.stream()
                .max(byLength.thenComparing(natural));
        System.out.println("max = " + max);
    }
}
