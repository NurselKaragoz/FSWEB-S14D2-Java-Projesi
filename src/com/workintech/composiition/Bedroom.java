package com.workintech.composiition;

public class Bedroom {
    private String name;
    Wall wall1= new Wall("dogu");
    Wall wall2= new Wall("bati");
    Wall wall3= new Wall("guney");
    Wall wall4= new Wall("kuzey");
    Ceiling ceiling=new Ceiling(2,PaintColor.WHITE);
    Bed bed = new Bed(5,2,6,4,"kare");
    Lamp lamp= new Lamp(87,true,LampType.LED_LAMP);
    Wardrobe wardrobe= new Wardrobe(2,2,0.5);
     Carpet carpet = new Carpet(3,4,PaintColor.GRAY);

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
