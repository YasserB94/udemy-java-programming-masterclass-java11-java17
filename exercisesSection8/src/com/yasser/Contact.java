package com.yasser;

/**
 * Created by Yasser on 02/11/2022 at 12:20.
 */
public class Contact {
    private String name,phoneNumber;
    public static Contact createContact(String name,String phoneNumber){
        return new Contact(name,phoneNumber);
    }
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
