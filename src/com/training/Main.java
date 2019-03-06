package com.training;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        Random rng = new Random();
        int diceRoll = rng.nextInt(6) + 1;

        System.out.println("You rolled: " + diceRoll);
    }
}
