package com.yasser;
/*
Inheritance challenge
Start with a base class Vehicle and a Car class that inherits this vehicle
Finally another class that inherits from Car
You should be able to hand steer, change gears and speed
* */
public class Vehicle {
    private int direction,velocity;
    private String name,size;

    public Vehicle(String name, String size) {
        this.direction = 0;
        this.velocity = 0;
        this.name = name;
        this.size = size;
    }
    public void steer(int direction){
        this.direction+=direction;
    }
    public void move(int velocity,int direction){
        this.direction = direction;
        this.velocity = velocity;
    }
    public void stop(){
        this.velocity = 0;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}