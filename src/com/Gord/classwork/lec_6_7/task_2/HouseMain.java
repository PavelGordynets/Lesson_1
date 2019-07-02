package com.Gord.classwork.lec_6_7.task_2;

public class HouseMain {
    public static void main(String[] args) {
        House house = new House(3,5,"деревапаыпвчиммиваво");
        int price=house.floors*house.theEntrance*house.coefficient;
        System.out.println("Стоимость дома составляет "+price);
    }
}
