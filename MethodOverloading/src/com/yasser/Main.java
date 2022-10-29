package com.yasser;
/*
Method Overloading allows different methods to have the same name,
 but different signatures where the signature can differ by the number of input parameters
  or type of input parameters,
  or a mixture of both.

  Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java
 */
public class Main {
    final static double ONE_INCH_IN_CM = 2.54;
    final static double ONE_FOOT_IN_INCHES = 12;
    public static void main(String[] args) {
        System.out.println("Hello Static Polymorphism!");

//        System.out.println(calcFeetAndInchesToCentimeters(1,0));
//        System.out.println(calcFeetAndInchesToCentimeters(1));
//        System.out.println(calcFeetAndInchesToCentimeters(0,1));
//        System.out.println(calcFeetAndInchesToCentimeters(5));
//        System.out.println(calcFeetAndInchesToCentimeters(5,5));
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