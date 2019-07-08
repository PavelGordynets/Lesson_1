package com.Gord.classwork.lec_10.task_5;

public class AutomaticCloseCar {
    // поля класса должны быть приватными
    int distanceGpsFromCar = 0;
    boolean signaling = false;
    int maximumDistanceForAutomaticCloseCar = 5;

    // все эти параметры передаются через конструктор, а не указываются по умолчанию.   
   // public AutomaticCloseCar()  -> public AutomaticCloseCar(int distanceGpsFromCar, boolean signaling,  int maximumDistanceForAutomaticCloseCar) 
    public AutomaticCloseCar() {
        //эти строки сейчас не имеют смысла
        this.distanceGpsFromCar = distanceGpsFromCar;
        this.signaling = signaling;
        this.maximumDistanceForAutomaticCloseCar = maximumDistanceForAutomaticCloseCar;
    }

    // крайне редко методы оставляют с дефолтным модификатором. Обычно паблик или приватный
    boolean AutomaticCloseCar() {
        if (distanceGpsFromCar == maximumDistanceForAutomaticCloseCar) {
            signaling = true;
            
            // этот if всегда будет верным, т.к. чуть выше ты сетаешь true в signaling
            // if(signaling == true) -> if (signaling) {}
            if (signaling == true) {
                System.out.println("Включена сигнализация");
            }
        }
        return signaling;
    }
}

