package com.Gord.homework.homework_5;

import java.util.Scanner;

public class Сivilskytransport extends Skycar {
    private int numberOfPassengers;
    private boolean businessClass;


    public Сivilskytransport(String model, int power, int maxSpeed, int weight, double wingspan, double minRunwayLength, int numberOfPassengers, boolean businessClass) {
        super(model, power, maxSpeed, weight, wingspan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;

    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    private static void flight(int numberOfPassengers) {
        Scanner input = new Scanner(System.in);
        int next;
        do {
            System.out.println("Enter number Of passengers");
            while (!input.hasNextInt()) {
                System.out.println("That not a number. Enter number Of passengers");
                input.next();
            }
            next = input.nextInt();
        }
        while (next < 0);

        numberOfPassengers = next;
        System.out.println("Number passengers " + numberOfPassengers);
        input.close();
        if (numberOfPassengers > 555) {
            System.out.println("Number of passengers exceeds the seats");
        } else {
            System.out.println("Passengers are seated. Ready to fly");
        }
    }

    private static void businessClass(boolean businessClass) {
        if (businessClass) {
            System.out.println("You can buy a ticket to the business class");
        } else {
            System.out.println("There is no business class on this plane.");
        }
    }

    public static void main(String[] args) {
        Сivilskytransport boing = new Сivilskytransport("Boin 777", 1200, 955, 142900, 65, 800, 555, true);
        System.out.println("Model : " + boing.getModel());
        System.out.println("Power engine : " + boing.getPower() + " h.p.");
        System.out.println("Max speed : " + boing.getMaxSpeed() + " km/h");
        System.out.println("Weight : " + boing.getWeight() + " kg");
        System.out.println("Wingspan : " + boing.getWingspan() + " m");
        System.out.println("Min Run way Length : " + boing.getMinRunwayLength() + " m");
        System.out.println("Number of passengers : " + boing.getNumberOfPassengers() + " people" + "\n");
        PowerkW(boing.getPower());
        flight(boing.numberOfPassengers);
        businessClass(boing.businessClass);

    }

}



