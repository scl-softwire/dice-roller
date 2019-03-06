package com.training;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice would you like to roll?");
        System.out.print("> ");
        int diceToRoll = scanner.nextInt();
        System.out.println();

        for (int roll = 0; roll < diceToRoll; roll++) {
            Random rng = new Random();
            int diceRoll = rng.nextInt(6) + 1;
            System.out.println("You rolled: " + diceRoll);
        }
    }
}
