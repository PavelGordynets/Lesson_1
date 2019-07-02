package com.Gord.classwork.lec_6_7.task_2;

public class HouseMain {
    public static void main(String[] args) {
        House house = new House(2,2,"deddddd");
        int price=house.floors*house.theEntrance*house.coefficient;

        System.out.println(price);
    }


}
