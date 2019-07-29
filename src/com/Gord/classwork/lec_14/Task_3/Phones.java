package com.Gord.classwork.lec_14.Task_3;

public class Phones {
    private String name;
    private String manufacturer;

    public Phones(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

