package com.training;

import java.util.Random;

public class StandardDice implements Dice {

    private Random rand;
    private int numberOfFaces;

    public StandardDice(int numberOfFaces) {
        this.rand = new Random();
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public int roll() {
        return rand.nextInt(numberOfFaces) + 1;
    }
}
