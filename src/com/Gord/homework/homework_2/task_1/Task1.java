package com.Gord.homework.homework_2.task_1;
// попробуй сумму все же сделать 0 в начале. 
//и сразу в цикле первым оператором прибавлять firstDaydistance к сумме, а затем firstDaydistance умножать на 1.1
public class Task1 {
    public static void main (String [ ] args){
        float firstDaydistance=10;// было double
        float sum7DayDistance=10;// было double
        for(int i=1;i<7;i++){
            firstDaydistance*=1.1;
            sum7DayDistance+=firstDaydistance;
        }
        System.out.println("distance for 7 day= "+ sum7DayDistance);
    }
}
