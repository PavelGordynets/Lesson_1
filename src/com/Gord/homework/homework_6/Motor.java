package com.Gord.homework.homework_6;

public class Motor {
    private boolean priznakStartMotor;


    // пока не очень понятно зачем ему передавать булеан переменную в констуктор. Тип мотора - да, объем - да. 
    // думаю это скорее похоже на старт мотора, который нужно сделать отдельным методом. Иначе получается ты создаешь уже заведенный мотор?
    public Motor(boolean priznakStartMotor) {
        this.priznakStartMotor = priznakStartMotor;
    }

    // метод стартМотор должен заводить мотор, особенно если он заглушен, т.е. менять значение переменной, а не выводить на экран
    void startMotor() {
        if (priznakStartMotor == true) {
            System.out.println("Мотор  заведен");
        }
    }
    
    // метод стопМотор должен глушить мотор, особенно если он заведен
    void stopMotor() {
        if (priznakStartMotor == false) {
            System.out.println("Мотор  заглушен");
        }
    }
    boolean getPriznakStartMotor() {
        return priznakStartMotor;
    }
// не оставляй такие пустые строки

}
