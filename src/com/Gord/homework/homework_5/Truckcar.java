package com.Gord.homework.homework_5;

import java.util.Scanner;

public class Truckcar extends Earthcar {
    private double loadCapacity;

    public Truckcar(String model, int power, int maxSpeed, int weight, int numberOfWheels, double fuelConsumption, double loadCapacity) {
        super(model, power, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;

    }

    private static void Cargo(double amountOfCargo) {
        Scanner input = new Scanner(System.in);
        double next;
        do {
            System.out.println("Enter cargo weight");
            while (!input.hasNextDouble()) {
                System.out.println("That not a number. Enter cargo weight");
                input.next();
            }
            next = input.nextDouble();
        }
        while (next < 0);

        amountOfCargo = next;
        System.out.println("You have loaded " + next + " tons of cargo");
        input.close();
        if (amountOfCargo > 130) {
            System.out.println("You need a truck with a higher load capacity");
        } else {
            System.out.println("Truck loaded");
        }

    }
@Override
    public String toString (){
        return "Trackcar {  "+
                "model = " + getModel()+
                '}';




    }

}



