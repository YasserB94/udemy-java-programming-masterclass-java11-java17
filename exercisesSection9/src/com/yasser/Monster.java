package com.yasser;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints,strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    @Override
    public String toString() {
        return "Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"}";
    }
    @Override
    public List<String> write() {
        ArrayList<String> out = new ArrayList<String>();

        out.add(0,this.name);
        out.add(1,""+this.hitPoints);
        out.add(2,""+this.strength);
        return out;
    }

    @Override
    public void read(List<String> input) {
        if(input == null || input.isEmpty()){
            return;
        }
        this.name = input.get(0);
        this.hitPoints = Integer.parseInt(input.get(1));
        this.strength = Integer.parseInt(input.get(2));
    }
}
