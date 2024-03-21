package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class IntroductionToRecursionMain implements Runnable {

    public void run() {
        SaxionApp.printLine("squareSum: " + squareSum(4) + " expected: " + 30);
    }

    private int squareSum(int x) {
        if (x == 0) {
            return 0;
        }

        int square = x * x;

        return square + squareSum(x - 1);
    }


    public static void main(String[] args) {
        SaxionApp.start(new IntroductionToRecursionMain(), 1024, 768);
    }
}
