package com.training;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        int sizeOfDice = getIntegerFromUser("What size of dice would you like to roll?");
        int diceToRoll = getIntegerFromUser("How many dice would you like to roll?");

        for (int roll = 0; roll < diceToRoll; roll++) {
            Random rng = new Random();
            int diceRoll = rng.nextInt(sizeOfDice) + 1;
            System.out.println("You rolled: " + diceRoll);
        }
    }

    private static int getIntegerFromUser(String prompt) {
        System.out.println(prompt);
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
