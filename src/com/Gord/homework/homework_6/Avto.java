package com.Gord.homework.homework_6;


public class Avto {
    boolean pedalStart = false;


    Motor mot = new Motor(true);
    Transmission transmission = new Transmission();

    void pushPedal() {
        pedalStart = true;
        System.out.println("Педаль нажата!");
        System.out.println("");
    }

    void riding() {
        if (pedalStart == true && mot.getPriznakStartMotor() == true && transmission.getCurrentBroadcast() != 1) {
            System.out.println("Включите первую передачу что бы начать движение");
            System.out.println("Текущая передача = " + transmission.getCurrentBroadcast());
        }
        if (pedalStart == true && mot.getPriznakStartMotor() == true && transmission.getCurrentBroadcast() == 1) {
            System.out.println("Машина начала движение. Скорость движения состовляет " + transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
        for (int i = 1; i < 7; i++) {
            transmission.shiftGearUp();
            System.out.println("Передача повешена до  " + transmission.getCurrentBroadcast() + " . Cкорость движения составила " + transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            transmission.shiftGearBelow();
            System.out.println("Передача понижена до  " + transmission.getCurrentBroadcast() + " . Cкорость движения составила " + transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
    }

}

