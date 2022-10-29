package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Excercises!");
        //testSpeedConverter();
    }
    private static void testSpeedConverter(){
        System.out.println();
        System.out.println("SpeedConverter Test Start");
        double[] speedConverterTestCases = {1.5,10.25,-5.6,25.42,75.114};
        for (double input:speedConverterTestCases
        ) {
            SpeedConverter.printConversion(input);
        }
        System.out.println("SpeedConverter Test End");
        System.out.println();
    }
}
