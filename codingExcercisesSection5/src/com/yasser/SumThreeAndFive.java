package com.yasser;
/*
Create a for statement with a range of numbers from 1 to 1_000 inclusive
Print out all the numbers dividable by both 3 and 5
Break the loop when you have found 5 numbers, then print the sum of those numbers
 */
public class SumThreeAndFive {
    public static void threeAndFive(){
        int sum = 0;
        int numbersFound =0;
        for (int i = 1; (i <= 1_000)&&(numbersFound<5); i++) {
            if((i%3==0)&&(i%5==0) && numbersFound<5){
                System.out.println("Number found: " + i);
                sum +=i;
                numbersFound++;
            }
        }
        System.out.println("SUm of found numbers: " + sum);
    }
}
