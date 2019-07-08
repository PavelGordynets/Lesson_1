package com.Gord.classwork.lec_10.task_5;

public class Task5 {
    public static void main(String[] args) {
        AutomaticCloseCar signaling = new AutomaticCloseCar(4, false, 5);
        try {
            signaling.distanceFromCar();
        } finally {
            signaling.AutomaticCloseCar();
        }
    }
}
