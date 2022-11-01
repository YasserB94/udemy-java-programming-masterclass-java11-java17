package com.yasser;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;
    private int accountNumber;
    private int phoneNumber;
    private String customerName;
    private String email;
    public BankAccount(int accountNumber, int phoneNumber, String customerName, String email) {
        this.balance = new BigDecimal(0);
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }
    public BankAccount(BigDecimal balance, int accountNumber, int phoneNumber, String customerName, String email) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public void desposit(BigDecimal amount){
        balance.add(amount);
    }
    public BigDecimal withdraw(BigDecimal amount){
        if(balance.compareTo(amount)>-1){
            balance.subtract(amount);
            return amount;
        }else{
            return new BigDecimal(0);
        }
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
