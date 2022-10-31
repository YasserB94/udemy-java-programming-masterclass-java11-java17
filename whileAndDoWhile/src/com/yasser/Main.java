package com.yasser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello doWhile!\n");
        /*-
         * CHALLENGE
         * Create a method called isEvenNumber that takes a param of int
         * Create a method using a while loop loops over a range, finds the first 5 even numbers, prints them and eventually trheir sum
         * */
        sumEvenChallenge(1, 50);

        /*Digit Sum Challenge
        * Write a method with the name sumDigits - one param called number
        * if param >=10 process the number and return the sum of all the digits within
        * else return -1
        * Example -> sumDigits(125) returns 8 -> 1+2+5
        * */
        System.out.println(sumDigits(12505));

    }
    private static int sumDigits(int number){
        if(number<10) {
            return -1;
        }
        int result = 0;

        while(number>0){
            int extractedLastDigit = number%10;
            result+=extractedLastDigit;
            number /=10;
        }

        return result;
    }
    private static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }

    private static void sumEvenChallenge(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            System.out.println("Invalid input");
            return;
        }
        int sum = 0;
        int amountFound = 0;
        while ((start <= end) && (amountFound < 5)) {
            start++;
            if (!isEvenNumber(start)) {
                continue;
            }
            System.out.println("Even number found: " + start);
            amountFound++;
            sum += start;

        }
        System.out.println("Sum of found numbers: " + sum);
    }
}