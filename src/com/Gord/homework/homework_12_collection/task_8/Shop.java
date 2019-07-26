package com.Gord.homework.homework_12_collection.task_8;

public class Shop {
    // id с маленькой буквы
    private int ID;
    private String nameShop;

    // id с маленькой буквы
    public Shop(int ID, String nameShop) {
        this.ID = ID;
        this.nameShop = nameShop;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "ID=" + ID +
                ", nameShop='" + nameShop + '\'' +
                '}';
    }
}
