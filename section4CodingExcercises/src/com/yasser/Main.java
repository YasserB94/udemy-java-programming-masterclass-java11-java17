package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Excercises!");
        //testSpeedConverter();
        //testMegaBytesConverter();
        //testBarkingDog();
        //testLeapYear();
        testDecimalComparator();
    }
    private static void testDecimalComparator(){
        class TestCase{
            double valOne;
            double valTwo;
            boolean expectedReturnValue;
        }
        TestCase[] testCases = new TestCase[4];
        testCases[0] = new TestCase();
        testCases[1] = new TestCase();
        testCases[2] = new TestCase();
        testCases[3] = new TestCase();
        testCases[0].valOne = -3.1756;
        testCases[0].valTwo = -3.175;
        testCases[0].expectedReturnValue = true;
        testCases[1].valOne = 3.175;
        testCases[1].valTwo = 3.176;
        testCases[1].expectedReturnValue = false;
        testCases[2].valOne = 3.0;
        testCases[2].valTwo = 3.0;
        testCases[2].expectedReturnValue = true;
        testCases[3].valOne = -3.123;
        testCases[3].valTwo = 3.123;
        testCases[3].expectedReturnValue = false;

        for (TestCase testCase:testCases
             ) {
            System.out.println("Expected: " + testCase.expectedReturnValue + " Received: " + DecimalComparator.areEqualByThreeDecimalPlaces(testCase.valOne, testCase.valTwo));
        }

    }
    private static void testLeapYear(){
        int[] testCases = {1700,1800,1855,1856,1900,1924,2000,2100,2200,2300,2500,2600};
        for (int testCase:testCases
             ) {
            System.out.println("Year: " + testCase  + " Returned: " + LeapYear.isLeapYear(testCase));
        }

    }
    private static void testBarkingDog(){
        class TestCase{
            boolean barking;
            int hourOfDay;
            public void setBarking(boolean barking) {
                this.barking = barking;
            }
            public void setHourOfDay(int hourOfDay) {
                this.hourOfDay = hourOfDay;
            }
        }
        TestCase[] testCases = new TestCase[4];
        testCases[0] = new TestCase();
        testCases[1] = new TestCase();
        testCases[2] = new TestCase();
        testCases[3] = new TestCase();

        testCases[0].barking = true;
        testCases[0].hourOfDay = 1;

        testCases[1].barking = false;
        testCases[1].hourOfDay = 2;

        testCases[2].barking = true;
        testCases[2].hourOfDay = 8;

        testCases[3].barking = true;
        testCases[3].hourOfDay = -1;

        for (TestCase testCase:testCases
             ) {
            if(BarkingDog.shouldWakeUp(testCase.barking,testCase.hourOfDay)){
                System.out.println("Method Returned True");
            }else{
                System.out.println("Method Returned False");
            }
        }

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
