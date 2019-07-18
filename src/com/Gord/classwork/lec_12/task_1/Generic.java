package com.Gord.classwork.lec_12.task_1;

public class Generic <T>{
    private T arg;

    public Generic(T arg) {
        this.arg = arg;
    }
    public void args(){
        System.out.println(arg.getClass().getName());

    }
}
