package com.yasser;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("mp");
        for (int i = 0; i < 10; i++) {
            phone.addNewContact(Contact.createContact("Contact "+i, "0"+i));
        }
        Contact hi = Contact.createContact("Hello","World");
        Contact helloWorld = Contact.createContact("Hello","World");
        System.out.println(phone.addNewContact(hi));
        System.out.println(phone.addNewContact(hi));
        System.out.println(phone.addNewContact(helloWorld));
        phone.printContacts();
    }
}