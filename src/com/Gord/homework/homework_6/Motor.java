package com.Gord.homework.homework_6;

public class Motor {
    private boolean priznakStartMotor;


    public Motor(boolean priznakStartMotor) {
        this.priznakStartMotor = priznakStartMotor;
    }

    void startMotor() {
        if (priznakStartMotor == true) {
            System.out.println("Мотор  заведен");
        }
    }
    void stopMotor() {
        if (priznakStartMotor == false) {
            System.out.println("Мотор  заглушен");
        }
    }
    boolean getPriznakStartMotor() {
        return priznakStartMotor;
    }


}
