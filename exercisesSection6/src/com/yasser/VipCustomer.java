package com.yasser;

public class VipCustomer {
    private String name,email;
    private double creditLimit;

    public VipCustomer(){
        this.name = "no name";
        this.email = "no email";
        this.creditLimit = 0d;
    }
    public VipCustomer(String name,String email){
        this.name=name;
        this.email=email;
        this.creditLimit =0;
    }
    public VipCustomer(String name,String email,int creditLimit){
        this.name=name;
        this.email=email;
        this.creditLimit=creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
