package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private PaintColor color;
    private int height;
    private int width;


    public Carpet(PaintColor color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}