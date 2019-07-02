package com.Gord.homework.homework_6;

public class Transmission {
    private int minPeredacha = 0;
    private int maxPeredacha = 7;
    private int currentBroadcast = 1;

    int shiftGearUp() {
        if (currentBroadcast < maxPeredacha) {
            currentBroadcast++;
        }
        if (currentBroadcast == maxPeredacha) {
            System.out.println("Передачу нельзя повысить.Максимальная передача");
        }
        if (currentBroadcast > maxPeredacha) {
            System.out.println("Такой передачи нет.Максимальная передача 7");
        }
        return currentBroadcast;
    }

    int shiftGearBelow() {
        if (currentBroadcast > 0) {
            currentBroadcast--;
        }
        if (currentBroadcast == minPeredacha) {
            System.out.println("Передачу нельзя понизить. Включена минимальная передача");
        }
        return currentBroadcast;
    }

    int getCurrentBroadcast() {

        return currentBroadcast;
    }
}
