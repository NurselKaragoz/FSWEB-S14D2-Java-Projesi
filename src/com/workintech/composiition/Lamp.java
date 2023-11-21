package com.workintech.composiition;

public class Lamp {
    private int globRating;
    private boolean battery;
    private LampType style;

    public Lamp(int globRating, boolean battery, LampType style) {
        this.globRating = globRating;
        this.battery = battery;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

   public boolean isBattery(){
        return isBattery();

   }

    public int getGlobRating() {
        return globRating;
    }


}
