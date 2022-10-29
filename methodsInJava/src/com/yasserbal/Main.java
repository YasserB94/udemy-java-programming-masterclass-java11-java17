package com.yasserbal;
public class Main {
    //-->> psvm is a method

    public static void main(String[] args) {
        System.out.println("Hello Methods!");
        int score = 800;
        int levelsCompleted = 5;
        int bonusPerLevel = 100;
        boolean gameOver = true;
        System.out.println("Final Score: " + calculateScore(score,levelsCompleted,bonusPerLevel,gameOver));
        gameOver=false;
        score=calculateScore(score,levelsCompleted,bonusPerLevel,gameOver);
        System.out.println(score);

        int[] scores = {1500,900,400,50};
        String[] names = {"Tommy","Jerry","Louise","Tod"};

        for (int i = 0; i < scores.length ; i++) {
            printHighScorePosition(names[i],scores[i]);
        }
    }
    private static int calculateScore(int score,int levelsCompleted,int bonusPerLevel,boolean gameOver) {
        return gameOver? (score+levelsCompleted*bonusPerLevel):(-1);
    }
    //CHALLENGE
    /*Create a method called siplayHighScorePosition
    * It takes a player's name as a param
    * it also takes a position in the high score table as a parm
    *
    * The name and position should be printed to the console
    *
    * Create a 2nd method called calculateHighScorePosition
    * It takes only one argument, score
    * it returns an integer
    * The data rules:
    * score>1000? 1
    * score>500&&<1000? 2
    * score>100&&<500?3
    * Default:4
    * Call both methods from the main scope with score set to: 1500, 900, 400, 50
    * */
    private static void printHighScorePosition(String playerName,int score){
        System.out.println(playerName + " has position: " + calculateHighScorePosition(score) + " on the high score table!" );
    };
    private static int calculateHighScorePosition(int score) {
        if(score>=1000){
            return 1;
        }
        if(score>=500){
            return 2;
        }
        if(score>=100){
            return 3;
        }
        return 4;
    }

}
