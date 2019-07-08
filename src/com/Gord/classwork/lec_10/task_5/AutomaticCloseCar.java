package com.Gord.classwork.lec_10.task_5;

public class AutomaticCloseCar {
    private int distanceGpsFromCar;
    private boolean signaling;
    private int maximumDistanceForAutomaticCloseCar;

    public AutomaticCloseCar(int distanceGpsFromCar, boolean signaling, int maximumDistanceForAutomaticCloseCar) {
        this.distanceGpsFromCar = distanceGpsFromCar;
        this.signaling = signaling;
        this.maximumDistanceForAutomaticCloseCar = maximumDistanceForAutomaticCloseCar;
    }

    public int distanceFromCar() {
        for (int i = distanceGpsFromCar; i < maximumDistanceForAutomaticCloseCar; i++) {
            distanceGpsFromCar++;
            System.out.println("Вы отошли на " + distanceGpsFromCar + " м от машины");
        }
        return distanceGpsFromCar;
    }
    public boolean AutomaticCloseCar(){
        if (distanceGpsFromCar == maximumDistanceForAutomaticCloseCar) {
            signaling = true;
            if (signaling) {
                System.out.println("Включена сигнализация");
            }
        }
        return signaling;
    }
}
