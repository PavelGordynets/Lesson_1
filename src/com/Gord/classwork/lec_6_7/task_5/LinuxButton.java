package com.Gord.classwork.lec_6_7.task_5;

public class LinuxButton implements Button {
    private boolean pressButton=true;

    public LinuxButton(boolean pressButton) {
        this.pressButton = pressButton;
    }
    public void getpressButton(){
        System.out.println(pressButton);
    }

    @Override
    public String toString() {
        return "LinuxButton{" +
                "pressButton=" + pressButton +
                '}';
    }
}
