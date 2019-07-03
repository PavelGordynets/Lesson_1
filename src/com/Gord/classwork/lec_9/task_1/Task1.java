package com.Gord.classwork.lec_9.task_1;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = new String[]{"Pavel, Dima, Alex"};
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            result = result + " " + strings[i];
            result.trim();
        }
        result = result.trim();
        System.out.println(result);
    }
}
