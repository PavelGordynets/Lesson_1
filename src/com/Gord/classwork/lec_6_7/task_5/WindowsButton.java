package com.Gord.classwork.lec_6_7.task_5;

public class WindowsButton implements Button {
    private boolean pressButton;

    public WindowsButton(boolean pressButton) {
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
