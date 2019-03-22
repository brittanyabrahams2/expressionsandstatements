package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int newscore = calculateScore("Josh", 3);
        System.out.println("New score is " + newscore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score * 1000;

    }

    //same method name different parameters
    //overloading
    public static int calculateScore(int score) {
        System.out.println("Unnamed player Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player Scored and unknown points");
        return 0;
    }


}
