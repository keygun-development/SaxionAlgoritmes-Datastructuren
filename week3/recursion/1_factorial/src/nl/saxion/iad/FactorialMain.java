package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class FactorialMain implements Runnable {


    public void run() {
        SaxionApp.printLine("Actual:    " + factorial(3));
        SaxionApp.printLine("Expected : 6");
        SaxionApp.printLine();
        SaxionApp.printLine("Actual:    " + factorial(5));
        SaxionApp.printLine("Expected : 120");
        SaxionApp.printLine();
        SaxionApp.printLine("Actual:    " + factorial(8));
        SaxionApp.printLine("Expected : 40320");
        SaxionApp.printLine();
        SaxionApp.printLine("Actual:    " + factorial(10));
        SaxionApp.printLine("Expected : 3628800");
    }


    private int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        SaxionApp.start(new FactorialMain(), 1024, 768);

    }
}
