package com.Gord.homework.homework_5;

public class Earthcar extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public Earthcar(String model, int power, int maxSpeed, int weight, int numberOfWheels, double fuelConsumption) {
        super(model, power, maxSpeed, weight);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {

        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels;

    }
    public double getFuelConsumption(){
        return fuelConsumption;
    }
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption=fuelConsumption;
    }
}



