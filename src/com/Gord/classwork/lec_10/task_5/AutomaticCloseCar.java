package com.Gord.classwork.lec_10.task_5;

public class AutomaticCloseCar {
    int distanceGpsFromCar = 0;
    boolean signaling = false;
    int maximumDistanceForAutomaticCloseCar = 5;

    public AutomaticCloseCar() {
        this.distanceGpsFromCar = distanceGpsFromCar;
        this.signaling = signaling;
        this.maximumDistanceForAutomaticCloseCar = maximumDistanceForAutomaticCloseCar;
    }

    boolean AutomaticCloseCar() {
        if (distanceGpsFromCar == maximumDistanceForAutomaticCloseCar) {
            signaling = true;
            if (signaling == true) {
                System.out.println("Включена сигнализация");
            }
        }
        return signaling;
    }
}

