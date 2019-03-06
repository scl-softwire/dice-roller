package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        String customOrStandard = getStringFromUser("Choose either 'custom' or 'standard' dice");
        boolean isCustom = customOrStandard.equals("custom");

        if (isCustom) {
            List<Integer> facesOfDice = getListOfIntegersFromUser("How many faces on your custom dice?");
            int numberOfRolls = getIntegerFromUser("How many dice would you like to roll?");
            System.out.println("Total roll: " + getSumOfCustomDiceRolls(facesOfDice, numberOfRolls));
        } else {
            int sizeOfDice = getIntegerFromUser("What size of dice would you like to roll?");
            int numberOfRolls = getIntegerFromUser("How many dice would you like to roll?");
            System.out.println("Total roll: " + getSumOfStandardDiceRolls(sizeOfDice, numberOfRolls));
        }
    }

    private static String getStringFromUser(String prompt) {
        System.out.println(prompt);
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int getIntegerFromUser(String prompt) {
        return Integer.valueOf(getStringFromUser(prompt));
    }

    private static List<Integer> getListOfIntegersFromUser(String prompt) {
        int numberOfEntries = getIntegerFromUser(prompt);

        List<Integer> result = new ArrayList<>();
        for (int num = 0; num < numberOfEntries; num++) {
            result.add(getIntegerFromUser("Enter number " + (num + 1)));
        }
        return result;
    }

    private static int getSumOfStandardDiceRolls(int sizeOfDice, int numberOfRolls) {
        Random rng = new Random();
        int totalRoll = 0;
        for (int roll = 0; roll < numberOfRolls; roll++) {
            totalRoll += rng.nextInt(sizeOfDice) + 1;
        }
        return totalRoll;
    }

    private static int getSumOfCustomDiceRolls(List<Integer> diceFaces, int numberOfRolls) {
        Random rng = new Random();
        int totalRoll = 0;
        for (int roll = 0; roll < numberOfRolls; roll++) {
            totalRoll += diceFaces.get(rng.nextInt(diceFaces.size()));
        }
        return totalRoll;
    }
}
