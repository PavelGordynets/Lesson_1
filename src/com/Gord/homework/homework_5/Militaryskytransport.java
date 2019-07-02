package com.Gord.homework.homework_5;

import java.util.Scanner;

public class Militaryskytransport extends Skycar {
    private boolean ejectionSystems;
    private int nubersOfRocket;

    public Militaryskytransport(String model, int power, int maxSpeed, int weight, double wingspan, double minRunwayLength, boolean ejectionSystems, int nubersOfRocket) {
        super(model, power, maxSpeed, weight, wingspan, minRunwayLength);
        this.ejectionSystems = ejectionSystems;
        this.nubersOfRocket = nubersOfRocket;
    }

    public int getNubersOfRocket() {
        return nubersOfRocket;
    }

    public void setNubersOfRocket(int nubersOfRocket) {
        this.nubersOfRocket = nubersOfRocket;

    }

    public boolean getEjectionSystems() {
        return ejectionSystems;
    }

    public void setEjectionSystems(boolean ejectionSystems) {
        this.ejectionSystems = ejectionSystems;

    }

    private static void Shot(int numberOfRocket) {
        Scanner input = new Scanner(System.in);
        int next;
        do {
            System.out.println("Enter number Of rocket");
            while (!input.hasNextInt()) {
                System.out.println("That not a number. Enter number Of rocket");
                input.next();
            }
            next = input.nextInt();
        }
        while (next < 0);
        numberOfRocket = next;
        System.out.println("Number rocket : " + numberOfRocket);
        input.close();
        if (numberOfRocket > 4) {
            System.out.println("Maximum number of missiles exceeded");
        }
        if (numberOfRocket < 4 & numberOfRocket > 0) {
            System.out.println("The rocket is charged. Ready to shoot");
        } else {
            System.out.println("Absent rocket. No shot possible");
        }

    }

    private static void ejectionSystems(boolean ejectionSystems) {
        if (ejectionSystems) {
            System.out.println("You used the ejection system. Catapultting was successful.");
        } else {
            System.out.println("You have no ejection system");
        }

    }

    public static void main(String[] args) {


        Militaryskytransport CY_46 = new Militaryskytransport("CY-46", 1500, 1589, 19500, 16.7, 90, true, 4);
        System.out.println("Model : " + CY_46.getModel());
        System.out.println("Power engine : " + CY_46.getPower() + " h.p.");
        System.out.println("Max speed : " + CY_46.getMaxSpeed() + " km/h");
        System.out.println("Weight : " + CY_46.getWeight() + " kg");
        System.out.println("Wingspan : " + CY_46.getWingspan() + " m");
        System.out.println("Min Run way Length : " + CY_46.getMinRunwayLength() + " m");
        System.out.println("EjectionSystems : " + CY_46.getEjectionSystems());
        System.out.println("NubersOfRocket : " + CY_46.getNubersOfRocket() + " rocket" + "\n");
        PowerkW(CY_46.getPower());
        Shot(CY_46.nubersOfRocket);
        ejectionSystems(CY_46.ejectionSystems);


    }

}

