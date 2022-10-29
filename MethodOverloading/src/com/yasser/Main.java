package com.yasser;
/*
Method Overloading allows different methods to have the same name,
 but different signatures where the signature can differ by the number of input parameters
  or type of input parameters,
  or a mixture of both.

  Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java

  //THIS IS A FEATURE
  //A method can have the same name as long as params differ
  //The logic within these methods can differ
  //helps to avoid:
  //sumOfTwoNumbers(int a, int b) - sumOfThreeNumbers(int a, int b, int c) - sumOfFourNumbers(int a,int b, int c, int d)
   //^ All of above method names could be declared with the same name
   */
public class Main {
    final static double ONE_INCH_IN_CM = 2.54;
    final static double ONE_FOOT_IN_INCHES = 12;

    final static int SECONDS_IN_ONE_MINUTE = 60;
    final static int SECONDS_IN_ONE_HOUR = 3600;
    final static int MINUTES_IN_ONE_HOUR = 60;
    public static void main(String[] args) {
        System.out.println("Hello Static Polymorphism!");
        System.out.println(getDurationString(5,5));
        System.out.println(getDurationString(1,60));
        System.out.println(getDurationString(65,61));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(500,500));
        System.out.println(getDurationString(60,60));
        System.out.println(getDurationString(5000));
        System.out.println(getDurationString(3945L));
    }
    //SECONDS AND MINUTES CHALLENGE
    private static String getDurationString(long minutes,long seconds){
        if((!isPositiveNumber(minutes))||(!isPositiveNumber(seconds))){
            return "Invalid value";
        }
        if(seconds>=SECONDS_IN_ONE_MINUTE){
            if(minutes>=MINUTES_IN_ONE_HOUR){
                return getDurationString((minutes*SECONDS_IN_ONE_MINUTE)+seconds);
            }
            return getDurationString(seconds);
        }
        return (minutes/MINUTES_IN_ONE_HOUR) + "h " + (minutes%SECONDS_IN_ONE_MINUTE) + "m " + seconds + "s";
    }
    private static String getDurationString(long seconds){
            return getDurationString((seconds/SECONDS_IN_ONE_MINUTE),(seconds%SECONDS_IN_ONE_MINUTE));
    }
    private static boolean isPositiveNumber(long x){
        return (x>=0);
    }
    private static double calcFeetAndInchesToCentimeters(double feet,double inches){

        if(!((feet>=0) && ((inches>=0) && (inches<=12)))){
            return -1;
        };
        return (feet*ONE_FOOT_IN_INCHES*ONE_INCH_IN_CM)+(inches*ONE_INCH_IN_CM);
    }
    private static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        return calcFeetAndInchesToCentimeters(0,inches);
    }
}