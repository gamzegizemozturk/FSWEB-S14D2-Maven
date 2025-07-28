package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(PaintColor color, int height) {
        this.color = color;
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }
    public void create(){
        System.out.println("Ceiling has been built.");
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "color=" + color +
                ", height=" + height +
                '}';
    }
}