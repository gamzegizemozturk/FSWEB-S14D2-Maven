package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;

    private boolean battery;

    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", style=" + style +
                ", globRating=" + globRating +
                '}';
    }
}