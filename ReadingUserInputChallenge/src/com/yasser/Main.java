package com.yasser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    minimumAndMaximumChallenge();
    }

    private static void minimumAndMaximumChallenge() {
    /*
    * Read the numbers entered by the user
    * When the user no longer enters any number print out the minimum and maximum number the user had entered*/
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Please enter a number: ");
            if(!scanner.hasNextInt()){
                break;
            }
            int input = scanner.nextInt();
            min = Math.min(min,input);
            max = Math.max(max,input);
        }
        scanner.close();
        if(min<Integer.MAX_VALUE){
            System.out.println("Min: " + min + " Max: " + max);
        }else{
            System.out.println("No values were entered! - Please use numbers only");
        }
    }

    private static void makeSumOfUSerInput() {
        /*
         * Read 10 numbers from user input and print the sum of those numbers back to the user
         * Use a Scanner
         * use the hasNextInt() method from scanner
         * if the user doesn't enter a number print invalid number
         * Print out the # of the number the user enters -> Enter number 1, enter number 2,...
         *
         * HINTS
         * While
         * Counter
         * Close scanner
         * */
        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter <=
                10) {
            System.out.print("Please enter number " + counter + ": ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid input!");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The Sum of the numbers is: " + sum);
    }
}

