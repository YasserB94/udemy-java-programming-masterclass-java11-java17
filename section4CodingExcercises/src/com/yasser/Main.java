package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Excercises!");
        //testSpeedConverter();
        testMegaBytesConverter();
    }
    private static void testMegaBytesConverter(){
        System.out.println();
        System.out.println("MegaBytesConverter Test Start");
        System.out.println("* printMegaBytesAndKiloBytes(2500); → should print the following text: \"2500 KB = 2 MB and 452 KB\"");
        System.out.println("* printMegaBytesAndKiloBytes(-1024); → should print the following text: \"Invalid Value\" because parameter is less than 0.");
        System.out.println("* printMegaBytesAndKiloBytes(5000); → should print the following text: \"5000 KB = 4 MB and 904 KB\"");
        int[] testKiloByteValues = {0,-1024,2500};
        for (int kiloByte:testKiloByteValues
             ) {
            MegaBytesConverter.printMegaBytesAndKiloBytes(kiloByte);

        }

        System.out.println("MegaBytesConverter Test End");
        System.out.println();
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
