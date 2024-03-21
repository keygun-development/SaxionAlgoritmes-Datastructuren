package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class StepsToSolveMain implements Runnable{

    public void run(){
        collatzTest();
    }


    /**
     * Calculates the number of steps required for the Collatz conjecture to reach 1.
     *
     * @param number The number for which the Collatz conjecture steps are calculated.
     * @return The number of steps required for the Collatz conjecture to reach 1 from the given number.
     */
    private int collatz(int number){
        if (number == 1) {
            return 0;
        }
        if (number % 2 == 0) {
            return 1 + collatz(number / 2);
        }
        return 1 + collatz(3 * number + 1);
    }

    private void collatzTest() {
        SaxionApp.printLine("collatz(1): " + collatz(1) + " which is the correct answer: " + (collatz(1) == 0));
        SaxionApp.printLine("collatz(2): " + collatz(2) + " which is the correct answer: " + (collatz(2) == 1));
        SaxionApp.printLine("collatz(4): " + collatz(4) + " which is the correct answer: " + (collatz(4) == 2));
        SaxionApp.printLine("collatz(10): " + collatz(10) + " which is the correct answer: " + (collatz(10) == 6));
        SaxionApp.printLine("collatz(71): " + collatz(71) + " which is the correct answer: " + (collatz(71) == 102));
    }

    public static void main(String[] args) {
        SaxionApp.start(new StepsToSolveMain(), 1024, 768);
    }
}
