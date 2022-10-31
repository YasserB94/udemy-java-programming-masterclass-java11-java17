package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Section 5! \n");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
    }
    private static void testSumOdd(){
        class TestCase{
            int valOne;
            int valTwo;
            int expectedResponse;
        }
        TestCase[] testCases = new TestCase[6];
        testCases[0] = new TestCase();
        testCases[1] = new TestCase();
        testCases[2] = new TestCase();
        testCases[3] = new TestCase();
        testCases[4] = new TestCase();
        testCases[5] = new TestCase();

        testCases[0].valOne = 1;
        testCases[0].valTwo = 100;
        testCases[0].expectedResponse = 2500;
        testCases[1].valOne = -1;
        testCases[1].valTwo = 100;
        testCases[1].expectedResponse = -1;
        testCases[2].valOne = 100;
        testCases[2].valTwo = 100;
        testCases[2].expectedResponse = 0;
        testCases[3].valOne = 13;
        testCases[3].valTwo = 13;
        testCases[3].expectedResponse = 13;
        testCases[4].valOne = 100;
        testCases[4].valTwo = -100;
        testCases[4].expectedResponse = -1;
        testCases[5].valOne = 100;
        testCases[5].valTwo = 1000;
        testCases[5].expectedResponse = 247500;


        for (TestCase testcase:testCases
             ) {
            System.out.println("Testing numbers: " + testcase.valOne + " and " + testcase.valTwo);
            int output = SumOdd.sumOdd(testcase.valOne,testcase.valTwo);
            if(output==testcase.expectedResponse){
                System.out.println("Test passed! - " + testcase.expectedResponse + " Expected || " + output + " Received");
            }
            if(output!=testcase.expectedResponse){
                System.out.println("Test failed! - " + testcase.expectedResponse + " Expected || " + output + " Received");

            }
        }

    }
}