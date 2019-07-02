package com.Gord.homework.homework_5;

import java.util.Scanner;

public class Acar extends Earthcar {
    private String bodyType;
    private int numberOfPassengers;

    public Acar(String model, int power, int maxSpeed, int weight, int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(model, power, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBodyType(){
        return bodyType;
    }
    public void setBodyType(String bodyType){
        this.bodyType=bodyType;

    }
    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers){
        this.numberOfPassengers=numberOfPassengers;
    }
    private static  void Way(double distance){
        Scanner input = new Scanner(System.in);
        double next;
        double  movingTime;
        do {
            System.out.println("Enter  moving time ");
            while (!input.hasNextDouble()) {
                System.out.println("That not a number. Enter moving time ");
                input.next();
            }
            next = input.nextDouble();
        }
        while (next < 0);
        movingTime = next;
        distance =movingTime*320;
        System.out.println("Max distance = "+distance);
    }

    public static void main(String[] args) {

       Acar audi = new Acar("Audi R8", 611, 320, 1920, 4, 17, "coupe",2);
        System.out.println("Model : " + audi.getModel());
        System.out.println("Power engine : " + audi.getPower() + " h.p.");
        System.out.println("Max speed : " +audi.getMaxSpeed() + " km/h");
        System.out.println("Weight : " + audi.getWeight() + " kg");
        System.out.println("Nubber of Wheels : " + audi.getNumberOfWheels() + " pcs");
        System.out.println("Fuel Consuption : " + audi.getFuelConsumption() + " L/100 km");
        System.out.println("Body type : : " + audi.getBodyType() + " t" );
        System.out.println("Number of passengers : " + audi.getNumberOfPassengers() + " t" + "\n");
        PowerkW(audi.getPower());


        System.out.println();


    }
}


