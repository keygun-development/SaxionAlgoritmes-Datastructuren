package nl.saxion.iad.turns;

import java.util.Random;

public class DrinkingGame {

    private Random random = new Random();

    public void run() {
        DrinkingGameList players = new DrinkingGameList();

        players.add("John");
        players.add("Pete");
        players.add("Kylie");
        // players.add("Charles");

        // TODO: Implement Game Logic




    }

    public static void main(String[] args) {
        new DrinkingGame().run();
    }
}
