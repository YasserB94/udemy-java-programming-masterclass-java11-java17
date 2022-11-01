package com.yasser;

public class Floor {
    private double width,length;

    public Floor(double width, double length) {
        this.width = Math.max(width,0);
        this.length = Math.max(length,0);
    }
    public double getArea(){
        return width*length;
    }
}
