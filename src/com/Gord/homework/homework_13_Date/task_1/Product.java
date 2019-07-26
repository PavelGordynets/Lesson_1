package com.Gord.homework.homework_13_Date.task_1;

import java.time.LocalDateTime;

public class Product {
    private int ID;
    private String name;
    private LocalDateTime dateAdd;

    public Product(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", dateAdd=" + dateAdd +
                '}';
    }
}
