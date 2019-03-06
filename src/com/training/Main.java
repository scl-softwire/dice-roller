package com.training;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        int sizeOfDice = getIntegerFromUser("What size of dice would you like to roll?");
        int numberOfRolls = getIntegerFromUser("How many dice would you like to roll?");

        System.out.println("Total roll: " + getSumOfDiceRolls(sizeOfDice, numberOfRolls));
    }

    private static int getIntegerFromUser(String prompt) {
        System.out.println(prompt);
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getSumOfDiceRolls(int sizeOfDice, int numberOfRolls) {
        Random rng = new Random();
        int totalRoll = 0;
        for (int roll = 0; roll < numberOfRolls; roll++) {
            totalRoll += rng.nextInt(sizeOfDice) + 1;
        }
        return totalRoll;
    }
}
