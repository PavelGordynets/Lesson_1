package com.Gord.homework.homework_5;


public class Transport {
    private String model;
    private int power;
    private int maxSpeed;
    private int weight;


    public Transport(String model, int power, int maxSpeed, int weight) {
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }


    public String getModel() {

        return model;
    }

    public void setModel() {

        this.model = model;
    }

    public int getPower() {

        return power;
    }

    public void setPower() {

        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setmaxSpeed() {
        this.maxSpeed = maxSpeed;

    }

    public int getWeight() {

        return weight;
    }

    public void setWeight() {

        this.weight = weight;
    }


    public static void PowerkW(int power) {
        double P;
        P = power * 0.74;
        System.out.println("Мощноcть ровна : " + P);


    }
}
