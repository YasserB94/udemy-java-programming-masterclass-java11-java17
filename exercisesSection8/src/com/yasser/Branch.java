package com.yasser;

import java.util.ArrayList;
/**
 * Created by Yasser on 03/11/2022 at 15:48.
 */

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer:this.customers) {
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer tmp = findCustomer(customerName);
        if(tmp == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
        }
        return tmp==null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer tmp = findCustomer(customerName);
        if(tmp != null) {
            tmp.addTransaction(transaction);
        }
        return tmp!=null;
    }

}