package com.Gord.classwork.lec_9.task_4;

public class Task4 {
    public static void main(String[] args) {
        String str = "alucard";
        StringBuffer reverseStr = new StringBuffer(str);
        reverseStr.reverse();
        System.out.println("Строка до реверса: " + str);
        System.out.println("Строка в обратном порядке: " + reverseStr);
    }
}
