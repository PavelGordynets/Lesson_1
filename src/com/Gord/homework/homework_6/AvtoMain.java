package com.Gord.homework.homework_6;

public class AvtoMain {
    public static void main(String[] args) {
        Avto avto = new Avto();
        avto.mot.startMotor();
        avto.pushPedal();
        avto.transmission.getCurrentBroadcast();
        avto.transmission.shiftGearUp();
        avto.transmission.shiftGearBelow();
        avto.riding();
        avto.mot.stopMotor();
    }

}



