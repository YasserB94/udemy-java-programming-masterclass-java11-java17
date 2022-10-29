package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Switch!");
        //matchCharToChallengeChars();

    }
    //CHALLENGE
    /*
     * Create a switch statement that uses char
     * Create a char variable and test it for A,B,C,D,E
     * Display if the char matches or not
     * */
    private static void matchCharToChallengeChars() {
        char[] chars = {'A','B','C','D','E','F','G','H','F'};
        for (char input:chars
        ) {

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
                break;
        }
        }
    }
    //CHALLENGE
    /*
    * Print the # day of the week using a switch statement
    * */
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
