package com.training;

import java.util.List;
import java.util.Random;

public class CustomDice implements Dice {

    private Random rand;
    private List<Integer> numbersOnFaces;

    public CustomDice(List<Integer> numbersOnFaces) {
        this.rand = new Random();
        this.numbersOnFaces = numbersOnFaces;
    }

    @Override
    public int roll() {
        return numbersOnFaces.get(rand.nextInt(numbersOnFaces.size()));
    }
}
