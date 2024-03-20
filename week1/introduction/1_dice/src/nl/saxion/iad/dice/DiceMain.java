package nl.saxion.iad.dice;

import java.util.Random;

public class DiceMain {
    public void run() {
        int fairDice = 0;
        int unfairDice = 0;
        for (int i = 0; i < 1000; i++) {
            fairDice += throwDice();
            unfairDice += throwUnfairDice();
        }

        System.out.println("Eerlijk gemiddelde: " + fairDice / 1000);
        System.out.print("Oneerlijk gemiddelde: " + unfairDice / 1000);
    }


    public int throwDice() {
        Random rand = new Random();
        return rand.nextInt((6 - 1) + 1) + 1;
    }

    public int throwUnfairDice() {
        int randomNum = throwDice();
        if (randomNum == 1 || randomNum == 2) {
            return 6;
        }
        return randomNum;
    }

    public static void main(String[] args) {
        new DiceMain().run();
    }

}
