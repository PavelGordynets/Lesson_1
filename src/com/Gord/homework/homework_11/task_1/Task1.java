package com.Gord.homework.homework_11.task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayNumber = {3, 4, 5, 6, 7, 8};
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\IdeaProjects\\Lesson_1\\src\\com\\Gord\\homework\\homework_11\\task_1\\text.txt")) {
            for (int i = 0; i < arrayNumber.length; ++i) {
                fos.write(arrayNumber[i]);
                fos.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}