package com.Gord.homework.homework_6;

public class AvtoMain {
    public static void main(String[] args) {


        Avto avto = new Avto();
        avto.mot.startMotor();
        avto.pushPedal();
        avto.transmission.getCurrentBroadcast();
        avto.transmission.shiftGearUp();
        avto.transmission.shiftGearBelow();
        if (avto.pedalStart == true && avto.mot.getPriznakStartMotor() == true && avto.transmission.getCurrentBroadcast() != 1) {
            System.out.println("Включите первую передачу что бы начать движение");
            System.out.println("Текущая передача = " + avto.transmission.getCurrentBroadcast());
        }
        if (avto.pedalStart == true && avto.mot.getPriznakStartMotor() == true && avto.transmission.getCurrentBroadcast() == 1) {
            System.out.println("Машина начала движение. Скорость движения состовляет " + avto.transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
        for (int i=1;i<7;i++) {
            avto.transmission.shiftGearUp();
            System.out.println("Передача повешена до  " + avto.transmission.getCurrentBroadcast() + " . Cкорость движения составила " + avto.transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
        System.out.println();
        for (int i=0;i<7;i++) {
            avto.transmission.shiftGearBelow();
            System.out.println("Передача понижена до  " + avto.transmission.getCurrentBroadcast() + " . Cкорость движения составила " + avto.transmission.getCurrentBroadcast() * 20 + " км/ч ");
        }
        avto.mot.stopMotor();
    }

}



