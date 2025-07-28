
package org.example.model;

public class Wardrobe {
    private int height;
    private int width;
    private double weight;

    public Wardrobe(int height, double weight, int width) {
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }
    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
