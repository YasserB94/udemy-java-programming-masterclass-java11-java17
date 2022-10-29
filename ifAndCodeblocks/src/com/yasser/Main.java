package com.yasser;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello CodeBlocks!");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if(score==5000){
            System.out.println("Your score is 5000");
        }
        if(score==5000) System.out.println("Your score is 5000");//This also works, Tough it's not very clear for the reader afterwards;


        if(score<5000){
            System.out.println("Score was less than 5000");
        } else if (score == 5000 || score >= 50_000) {
            System.out.println("Cheater!");
        } else{
            System.out.println("Score is at least 5000");
        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore );
        }//Final score's value here is scoped to the if statement

        //Here finalScore has not been assigned yet as it does not exist in this scope
        int finalScore = gameOver? score+(levelCompleted*bonus):score;//This is a ternary assignment within the class scope
        System.out.println("Your final score is " + finalScore);

        //CHALLENGE
        /*
        Print out a second score on the screen
        with the score set to 10_000
        levelCompleted set to 8
        bonus set to 200
        Without getting rid of the above code.
         */
        score=10_000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = gameOver? score+(levelCompleted*bonus):finalScore;
        System.out.println("The challenges' final score is :" + finalScore);

    }
}