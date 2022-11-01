package com.yasser;

public class Car {
    private boolean engine;
    private int cylinders,wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=false;
    }
    public String startEngine(){
        this.engine=true;
        return "Car -> startEngine()";
    }
    public String brake(){
        return "Car -> brake()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

