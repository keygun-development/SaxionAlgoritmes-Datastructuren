package nl.saxion.iad.BattleCalculator;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.Random;

public class BattleCalculatorMain implements Runnable {

    //-1 is used for impossible to wound
    int[][] wounds = {
            {4, 5, 6, 6, -1, -1, -1, -1, -1, -1},
            {3, 4, 5, 6, 6, -1, -1, -1, -1, -1},
            {2, 3, 4, 5, 6, 6, -1, -1, -1, -1},
            {2, 2, 3, 4, 5, 6, 6, -1, -1, -1},
            {2, 2, 2, 3, 4, 5, 6, 6, -1, -1},
            {2, 2, 2, 2, 3, 4, 5, 6, 6, -1},
            {2, 2, 2, 2, 2, 3, 4, 5, 6, 6},
            {2, 2, 2, 2, 2, 2, 3, 4, 5, 6},
            {2, 2, 2, 2, 2, 2, 2, 3, 4, 5},
            {2, 2, 2, 2, 2, 2, 3, 2, 3, 4}
    };

    @Override
    public void run() {
        boolean isRunning = true;

        SaxionApp.printLine("=======================================");
        SaxionApp.printLine("===Welcome to the battle calculator!===");
        SaxionApp.printLine("========================================");

        while (isRunning) {
            SaxionApp.print("What is the strength of the attacker?: ", Color.RED);
            int strength = SaxionApp.readInt();
            SaxionApp.print("What is the toughness of the defender?: ", Color.cyan);
            int toughness = SaxionApp.readInt();
            SaxionApp.printLine();
            SaxionApp.printLine("There is " + calculateSuccessChange(strength, toughness) * 100 + "% success chance to hit the enemy!");

            //TODO: show success (part 2)


            SaxionApp.printLine();
            SaxionApp.printLine();
            SaxionApp.print("Do you want to do another calculation? [y/n]");
            char another = SaxionApp.readChar();
            isRunning = another == 'y'; //only keep running if the input was y(es)
            SaxionApp.printLine();
        }
    }


    public double calculateSuccessChange(int strength, int toughness) {
        return (double) (wounds[strength][toughness]) / 6;

    }


    public static void main(String[] args) {
        SaxionApp.start(new BattleCalculatorMain(), 1024, 768);
    }

}
