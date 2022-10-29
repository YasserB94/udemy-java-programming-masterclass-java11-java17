package academy.learnprogramming;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Operators!");


        //Following Expression contains 2 operators = and +
        int myResult = 1+2;//1+2 = 3
        //With a single operator we could assign the same value
        int myBrainsResultBecauseIAmSoSmart = 3;

        //COMMENTS
        // Comments are 4 humans and not interpreted by the code
        System.out.println("1 + 2 = " + myResult + " And according to me: " + myBrainsResultBecauseIAmSoSmart);

        //Operators
        // -    Subtraction
        // +    Sum
        // /    Division
        // *    Multiplication
        // %    Modulo(remainder operator)
        int result = 0;
        int myNumber = 50;
        int anotherNumber = myNumber/10;
        System.out.println("My Number is " + myNumber);
        result = myNumber-anotherNumber;
        System.out.println("My number after subtracting " + anotherNumber + " is: " + result );
        result = myNumber+anotherNumber;
        System.out.println("My number after adding " + anotherNumber + " is: " + result);
        result = myNumber / anotherNumber;
        System.out.println("My number after dividing by " + anotherNumber + " is: " + result);
        result = myNumber * anotherNumber;
        System.out.println("My Number times " + anotherNumber + " is: " + result);

        int myNumberToShowModulo = 3;
        result = myNumber%3;
        System.out.println("The remainder of " + myNumber + " % " + myNumberToShowModulo + " is: " + result);

        //ABBREVIATING OPERATORS
        result++;//Add 1 EQUAL TO result = result + 1
        result--;//Subtract 1 EQUAL TO result = result - 1
        result +=2; //Add Two   EQUAL TO result = result + 2
        result -=2; //Subtract Two  EQUAL TO result = result-2
        result *=2;//Multiply by two EQUAL TO result = result*2
        result /=2;//Divide by two EQUAL TO result = result/2
        System.out.println(result);

        //IF/THEN
        boolean canShowWorstPracticesInOneFile = true;
        if(canShowWorstPracticesInOneFile){
            System.out.println("Ugh, Get trough these basics quick. you may run out of tissues soon!");
        }else{
            System.out.println("Congratulations! you are ready for a painful java career!");
        }
        String thankyou = (canShowWorstPracticesInOneFile) ? "Thank you for implementing this Java!" : "Ugh, no!";
        System.out.println(thankyou);

        //MOAR OPERATORS
        // == is equal to
        // > is greater than
        // >= is greater OR equal than
        // <= is smaller or equal to
        // && AND
        // || OR
        // ! NOT
        // ? TERNARY OPERATOR
        // & = Bitwise AND covered later in the course?
        //Not adding boilerplate here since these are the same as in Swift and Php
        //ALL OPERATORS INCLUDING RELATIONAL ONES
        //https://www.javatpoint.com/operators-in-java
        //PRESCEDENCE TABLE
        //https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
    }
}