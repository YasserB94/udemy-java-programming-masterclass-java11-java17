package com.yasser;

import java.util.ArrayList;
/**
 * Created by Yasser on 03/11/2022 at 15:48.
 */

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (Branch branch:this.branches) {
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
    public boolean addBranch(String branchName) {
        Branch tmp = findBranch(branchName);
        if(tmp == null) {
            this.branches.add(new Branch(branchName));
        }
        return tmp==null;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch tmp = findBranch(branchName);
        if(tmp != null) {
            return tmp.newCustomer(customerName,transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tmp = findBranch(branchName);
        if(tmp != null) {
            return tmp.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName,boolean printTransactions){
        Branch tmp = findBranch(branchName);
        if (tmp==null){
            return false;
        }
        System.out.println("Customer details for branch " +tmp.getName());
        int i = 1;
        for (Customer customer:tmp.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            i++;
            if(printTransactions){
                int j = 1;
                System.out.println("Transactions");
                for (double transaction:customer.getTransactions()
                     ) {
                    System.out.println("["+j+"]  Amount "+transaction);
                    j++;
                }
            }
        }
        return tmp!=null;
    }


}