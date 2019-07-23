package com.Gord.homework.homework_12_collection.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    // ENTER_ON
    private static final String ENTERON = "Welcom oua club ";
    // ENTER_OFF
    private static final String ENTEROFF = "Enter close the club ";

    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>(5);
        listName.add("Pavel");
        listName.add("Dima");
        listName.add("Alex");
        listName.add("Ivan");
        listName.add("Igor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name :");
        String namePerson = scanner.next();

        String message = entered(listName, namePerson);
        System.out.println(message);
    }
                             // accessNames, approvedNames
    public static String entered(List<String> listname, String namePerson) {
        if (listname.contains(namePerson)) {
            // погугли про String.format() код будет горадо красивее
            return ENTERON + ", " + namePerson + "!";
        } else {
            return ENTEROFF + ", " + namePerson + "!";
        }
    }
}
