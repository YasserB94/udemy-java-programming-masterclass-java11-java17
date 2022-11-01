package com.yasser;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int activeGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.activeGear = 0;
    }

    public void changeGear(int activeGear) {
        this.activeGear = activeGear;
    }
    public void stop(){
        super.stop();
        this.activeGear = 0;

    }
}
