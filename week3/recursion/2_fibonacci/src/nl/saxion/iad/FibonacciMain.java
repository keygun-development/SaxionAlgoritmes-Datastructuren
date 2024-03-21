package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class FibonacciMain implements Runnable {

    public void run() {
        fibonacciTest();
    }

    public int fibonacci(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        return fibonacci(value - 1) + fibonacci(value - 2);
    }


    private void fibonacciTest() {
        SaxionApp.printLine("fibonacci(0) == 0: " + (fibonacci(0) == 0));
        SaxionApp.printLine("fibonacci(1) == 1: " + (fibonacci(1) == 1));
        SaxionApp.printLine("fibonacci(2) == 1: " + (fibonacci(2) == 1));
        SaxionApp.printLine("fibonacci(3) == 2: " + (fibonacci(3) == 2));
        SaxionApp.printLine("fibonacci(4) == 3: " + (fibonacci(4) == 3));
        SaxionApp.printLine("fibonacci(5) == 5: " + (fibonacci(5) == 5));
        SaxionApp.printLine("fibonacci(6) == 8: " + (fibonacci(6) == 8));
    }


    public static void main(String[] args) {
        SaxionApp.start(new FibonacciMain(), 1024, 768);

    }

}
