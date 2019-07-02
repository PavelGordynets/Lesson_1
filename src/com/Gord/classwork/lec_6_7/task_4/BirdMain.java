package com.Gord.classwork.lec_6_7.task_4;

import java.util.Arrays;

public class BirdMain {
    public static void main(String[] args) {
        Bird[] birds = new Bird[10];
        for (int i = 0; i < birds.length; i++) {
            int sizeBird = generatesizeBird();
            Bird bird = new Bird(sizeBird);
            birds[i] = bird;


        }
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }

        System.out.println("\"\"");
    }


    private static int generatesizeBird() {
        int sizeBirdIndex = (int) (Math.random() * 3 + 1);
        int sizeBird;
        switch (sizeBirdIndex) {
            case 1:
                sizeBird = 14;
                break;
            case 2:
                sizeBird = 22;
                break;
            case 3:
                sizeBird = 24;
                break;
            default:
                sizeBird = 34;
        }
        return sizeBird;
    }

    private static Bird generateBird(int sizeBird) {
        int birdIndex = (int) (Math.random() * 3 + 1);

        Bird bird;

        switch (birdIndex) {
            case 1:
                bird = new Sinica("efe", sizeBird);
                break;
            case 2:
                bird = new Sinica("dfsd", sizeBird);
                break;
            case 3:
                bird = new Sinica("fwefwe", sizeBird);
                break;
            default:
                bird = new Sinica("dfd", sizeBird);
        }
        return bird;
    }
}

