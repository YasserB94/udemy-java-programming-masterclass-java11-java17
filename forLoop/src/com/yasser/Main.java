package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello For Loop!");
        /*Mini Challenge
         * Using the for statement, call  a calculateInterestMehtod
         * initial amount is 10_000
         * print the result with an interest rate of 2,3,4,5,6,7 and 8*/
        double amount = 10_000;
        String printableAmount = String.format("%,.2f",amount);
        for (int i = 2; i < 9; i++) {
            System.out.println(printableAmount + " at " + i + "% interest = " + String.format("%,.2f",calculateInterest(amount,i)));
        }
        System.out.println();
        /*
        * Modify the above loop to count from 8 back to 2*/
        for (int i = 8; i > 1; i--) {
            System.out.println(printableAmount + " at " + i + "% interest = " + String.format("%.2f",calculateInterest(amount,i)));
        }
        /*
        Provided: isPrimeMethod
        Create a for loop using any range of numbers
        Determine if the current iteration nnumber is a primer number using the isPrime method
        if it is a prime number print it out
        once you printed 3 prime numbers, exit the for loop!
         */
        int primeCount = 0;
        for (int i = 987987; (i < Integer.MAX_VALUE&&primeCount<3); i++) {
            if(isPrime(i)){
                System.out.println(i + " is A Prime Number");
                primeCount++;
            }
        }

    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i = 2; i <= n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double initialAmount,double interestRate){
        return(initialAmount*(interestRate/100));
    }
}