package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the dice roller!");
        System.out.println("===========================");

        String customOrStandard = getStringFromUser("Choose either 'custom' or 'standard' dice");
        Dice dice = (customOrStandard.equals("custom")) ? getCustomDiceFromUser() : getStandardDiceFromUser();

        int numberOfRolls = getIntegerFromUser("How many dice would you like to roll?");
        System.out.println("Total roll: " + dice.sumOfRolls(numberOfRolls));
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

    private static Dice getStandardDiceFromUser() {
        int sizeOfDice = getIntegerFromUser("What size of dice would you like to roll?");
        return new StandardDice(sizeOfDice);
    }

    private static Dice getCustomDiceFromUser() {
        int numberOfEntries = getIntegerFromUser("How many faces on your custom dice?");

        List<Integer> faces = new ArrayList<>();
        for (int num = 0; num < numberOfEntries; num++) {
            faces.add(getIntegerFromUser("Enter number " + (num + 1)));
        }

        return new CustomDice(faces);
    }
}
