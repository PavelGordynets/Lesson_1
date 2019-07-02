package com.Gord.classwork.lec_6_7.task_5;

public class MacButton implements Button {

    private boolean pressButton;

    public MacButton(boolean pressButton) {
        this.pressButton = pressButton;
    }

    public void getpressButton() {
        System.out.println(pressButton);
    }

    @Override
    public String toString() {
        return "LinuxButton{" +
                "pressButton=" + pressButton +
                '}';
    }
}

