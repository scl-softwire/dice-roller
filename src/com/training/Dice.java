package com.training;

public interface Dice {
    int roll();

    default int sumOfRolls(int numberOfRolls) {
        int total = 0;
        for (int roll = 0; roll < numberOfRolls; roll++) {
            total += roll();
        }
        return total;
    }
}
