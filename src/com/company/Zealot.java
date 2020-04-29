package com.company;

public class Zealot extends ProtossUnit implements Fastable {
    public Zealot() {
        super(5, 5);
    }

    public void balup() {
        speed += 3;
    }

    @Override
    public void speedUp() {
        balup();
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
