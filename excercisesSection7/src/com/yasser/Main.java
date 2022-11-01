package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Section 7!");
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(0));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}