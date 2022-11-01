package com.yasser;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(radius,0d);
    }
    public double getArea(){
        return (radius*radius)*Math.PI;
    }
    public double getRadius() {
        return radius;
    }
}
