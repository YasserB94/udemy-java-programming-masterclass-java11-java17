package com.yasser;

public class Hamburger {
    private String name,meat,breadRollType;
    private double price;
    private String addition1Name,addition2Name,addition3Name,addition4Name;
    private double addition1Price,addition2Price,addition3Price,addition4Price;

    public Hamburger(String name, String meat,  double price,String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    public double itemizeHamburger(){
        double price = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + " price is" + this.price);

    }
    public void addHamburgerAddition1(String addition,double price){
        this.addition1Name = addition;
        this.addition1Price = price;
    }public void addHamburgerAddition2(String addition,double price){
        this.addition2Name = addition;
        this.addition2Price = price;
    }public void addHamburgerAddition3(String addition,double price){
        this.addition3Name = addition;
        this.addition3Price = price;
    }public void addHamburgerAddition4(String addition,double price){
        this.addition4Name = addition;
        this.addition4Price = price;
    }
}
