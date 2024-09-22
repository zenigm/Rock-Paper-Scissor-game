package com.company;

import java.util.Scanner;
import java.util.Random;

public class JavaExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.println("This is a rock,paper,scissor game,Given below are methods to play this game:");
        System.out.println("Enter (0) for rock,(1) for scissor and (2) for paper");

        //ROUND-1
        System.out.println("Round-1");
        System.out.println("Enter you choice,to play:");
        int PlayerA1 = sc.nextInt();
        if ( PlayerA1 <= 2 ) {
            System.out.println("Players move: " + PlayerA1);
            int ComputerA2 = rm.nextInt(0, 2);
            System.out.println("Computer's move: " + ComputerA2);

                if (PlayerA1 == ComputerA2) {
                    System.out.println("It's a Tie match!");
                } else if (PlayerA1 == 0 && ComputerA2 == 1) { // rock and scissor
                    System.out.println("PlayerA1 wins");
                    System.out.println("ComputerA2 loses");
                } else if (PlayerA1 == 1 && ComputerA2 == 2) { //scissor and paper
                    System.out.println("PlayerA1 wins");
                    System.out.println("ComputerA2 loses");
                } else if (PlayerA1 == 2 && ComputerA2 == 1) { //paper and scissor
                    System.out.println("ComputerA2 wins");
                    System.out.println("PlayerA1 loses");
                } else if (PlayerA1 == 2 && ComputerA2 == 0) { //paper and rock
                    System.out.println("PlayerA1 wins");
                    System.out.println("ComputerA2 loses");
                } else if (PlayerA1 == 0 && ComputerA2 == 2) { //rock and paper
                    System.out.println("ComputerA2 wins");
                    System.out.println("PlayerA1 loses");
                } else if (PlayerA1 == 1 && ComputerA2 == 0) { //scissor and rock
                    System.out.println("ComputerA2 wins");
                    System.out.println("PlayerA1 loses");
                }
            //ROUND-2
            System.out.println("Round-2");
                int PlayerA3 = sc.nextInt();
            System.out.println("Player's move: " + PlayerA3);
            int ComputerA4 = rm.nextInt(0, 2);
            System.out.println("Computer's move: " + ComputerA4);

            if (PlayerA3 == ComputerA4) {
                System.out.println("It's a Tie match!");
            } else if (PlayerA3 == 0 && ComputerA4 == 1) { // rock and scissor
                System.out.println("PlayerA3 wins");
                System.out.println("ComputerA4 loses");
            } else if (PlayerA3 == 1 && ComputerA4 == 2) { // scissor and paper
                System.out.println("PlayerA3 wins");
                System.out.println("ComputerA4 loses");
            } else if (PlayerA3 == 2 && ComputerA4 == 1) { // paper and scissor
                System.out.println("ComputerA4 wins");
                System.out.println("PlayerA3 loses");
            } else if (PlayerA3 == 2 && ComputerA4 == 0) { // paper and rock
                System.out.println("PlayerA3 wins");
                System.out.println("ComputerA4 loses");
            } else if (PlayerA3 == 0 && ComputerA4 == 2) { // rock and paper
                System.out.println("ComputerA4 wins");
                System.out.println("PlayerA3 loses");
            } else if (PlayerA3 == 1 && ComputerA4 == 0) { // scissor and rock
                System.out.println("ComputerA4 wins");
                System.out.println("PlayerA3 loses");
            }
            //ROUND-3
            System.out.println("Round-3");
            int PlayerA5 = sc.nextInt();
            System.out.println("Player's move: " + PlayerA5);
            int ComputerA6 = rm.nextInt(0, 2);
            System.out.println("Computer's move: " + ComputerA6);

            if (PlayerA5 == ComputerA6) {
                System.out.println("It's a Tie match!");
            } else if (PlayerA5 == 0 && ComputerA6 == 1) { // rock and scissor
                System.out.println("PlayerA5 wins");
                System.out.println("ComputerA6 loses");
            } else if (PlayerA5 == 1 && ComputerA6 == 2) { // scissor and paper
                System.out.println("PlayerA5 wins");
                System.out.println("ComputerA6 loses");
            } else if (PlayerA5 == 2 && ComputerA6 == 1) { // paper and scissor
                System.out.println("ComputerA6 wins");
                System.out.println("PlayerA5 loses");
            } else if (PlayerA5 == 2 && ComputerA6 == 0) { // paper and rock
                System.out.println("PlayerA5 wins");
                System.out.println("ComputerA6 loses");
            } else if (PlayerA5 == 0 && ComputerA6 == 2) { // rock and paper
                System.out.println("ComputerA6 wins");
                System.out.println("PlayerA5 loses");
            } else if (PlayerA5 == 1 && ComputerA6 == 0) { // scissor and rock
                System.out.println("ComputerA6 wins");
                System.out.println("PlayerA5 loses");
            }
        }
        else {
            System.out.println("Wrong Input,try again after reading instructions");
        }
    }
}
