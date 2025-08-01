package org.example.model;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public void create(){
        System.out.println("Wall has been built." + direction);
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }


}