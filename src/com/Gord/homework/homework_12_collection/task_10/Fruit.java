package com.Gord.homework.homework_12_collection.task_10;

public class Fruit {
    private String nameFruit;
    private double weight;

    public Fruit(String nameFruit, double weight) {
        this.nameFruit = nameFruit;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", weight=" + weight +
                '}';
    }
}
