package com.Gord.homework.homework_6;

import java.util.Scanner;

public class Transmission {

    private int minPeredacha = 0;
    private int maxPeredacha = 7;
    private int currentBroadcast = 1;


    // не забывай про модификаторы доступа в методах
    int shiftGearUp() {
        if (currentBroadcast < maxPeredacha) {
            currentBroadcast++;
        }
        
        //думаю этот и след if() очень похожи друг на друга. Весь метод попробуй записать через if-else 
        if (currentBroadcast == maxPeredacha) {
            System.out.println("Передачу нельзя повысить.Максимальная передача");
        }
        if (currentBroadcast > maxPeredacha) {
            System.out.println("Такой передачи нет.Максимальная передача 7");
        }
        return currentBroadcast;
    }

    // этот метод ты написал лучше, чем с повышением передачи, но надо придерживаться общей концепции
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
