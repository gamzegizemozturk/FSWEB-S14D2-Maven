package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp =  new Lamp(LampType.NEON,true,100);
        Ceiling ceiling = new Ceiling(PaintColor.RED,4);
        Bed bed = new Bed(5,5,5,5,"double");
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[]{northWall,eastWall,westWall,southWall};
        Wardrobe wardrobe = new Wardrobe(2,3.4,2);

        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,southWall,ceiling,lamp,new Carpet(PaintColor.WHITE,5,5),"bedroom1",bed,wardrobe);
        bedroom.createBedroom();
    }
}