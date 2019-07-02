package com.Gord.classwork.lec_6_7.task_2;

public class House {
    int floors;
    int theEntrance;
    int coefficient;


    public House(int floors, int theEntrance,String material) {
        this.floors = floors;
        this.theEntrance = theEntrance;
        this.coefficient=getCoefficient(material);
    }

    private int getCoefficient(String material) {
       switch (material.length()){
           case 5:
               coefficient=3;
               break;
           case 6:
               coefficient=4;
               break;
           case 7:
               coefficient=2;
               break;
           case 8:
               coefficient=7;
               break;
               default: coefficient=1;
               break;
       }
        // TODO: 25.06.2019 написать свитч который на основании длиныв строки будет возвращать коэф.
        return coefficient;
    }

}
