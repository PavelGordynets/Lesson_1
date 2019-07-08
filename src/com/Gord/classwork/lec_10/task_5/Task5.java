package com.Gord.classwork.lec_10.task_5;

public class Task5 {
    public static void main(String[] args) {
        AutomaticCloseCar signaling = new AutomaticCloseCar();

        try {
            for (int i = 0; i < signaling.maximumDistanceForAutomaticCloseCar; i++) {
                signaling.distanceGpsFromCar++;
                System.out.println("Вы отошли на " + signaling.distanceGpsFromCar + " м от машины");
            }
// здесь абзац не нужен
        } finally {
            signaling.AutomaticCloseCar();
        }
    }
}
