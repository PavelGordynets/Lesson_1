package com.Gord.homework.homework_5;

public class Skycar extends Transport {
    private double wingspan;
    private double minRunwayLength;

    public Skycar(String model, int power, int maxSpeed, int weight, double wingspan, double minRunwayLength) {
        super(model, power, maxSpeed, weight);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan(){

        return wingspan;
    }
    public void setWingspan(double wingspan){
        this.wingspan=wingspan;

    }
    public double getMinRunwayLength(){
        return  minRunwayLength;
    }
    public void setMinRunwayLength(double minRunwayLength){
        this.minRunwayLength=minRunwayLength;
    }

}

