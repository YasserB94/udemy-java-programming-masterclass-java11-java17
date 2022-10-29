package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Switch!");

        //CHALLENGE
        /*
        * Create a switch statement that uses char
        * Create a char variable and test it for A,B,C,D,E
        * Display if the char matches or not
        * */
        char[] chars = {'A','B','C','D','E','F','G','H','F'};
        for (char input:chars
             ) {
            matchCharToChallengeChars(input);
        }

    }
    private static void matchCharToChallengeChars(char input) {
        switch (input){
            case 'A':
                System.out.println("A matched in the switch!");
                break;
            case 'B':
                System.out.println("B matched in the switch!");
                break;
            case 'C':
                System.out.println("C matched in the switch!");
                break;
            case 'D':
                System.out.println("D matched in the switch!");
                break;
            case 'E':
                System.out.println("E matched in the switch!");
                break;
            default:
                System.out.println(input + " did not match the challenge chars");
        }
    }
}
