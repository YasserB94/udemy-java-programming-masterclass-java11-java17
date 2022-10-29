package com.yasser;

public class IntEqualityPrinter {
    final static String NEGATIVE_NUMBER_ERROR_MESSAGE = "Invalid Value";
    public static void printEqual(int x,int y,int z){
        if(x<0||y<0||z<0){
            System.out.println(NEGATIVE_NUMBER_ERROR_MESSAGE);
            return;
        }
        if(x==y && y==z){
            System.out.println("All numbers are equal");
            return;
        }
        if(!(x==y || y==z || x==z)){
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");;

    }

}
