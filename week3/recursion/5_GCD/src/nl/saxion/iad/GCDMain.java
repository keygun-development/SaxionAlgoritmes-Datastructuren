package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

import java.util.Arrays;

public class GCDMain implements Runnable {

    public void run(){
        //Base test
        calculateGCDTest();

        //Extra challenge test
        calculateGCDarrayTest();
    }


    /**
     * Calculates the greatest common divisor (GCD) of two integers using Euclid's algorithm.
     *
     * @param val1 The first integer value.
     * @param val2 The second integer value.
     * @return The greatest common divisor (GCD) of the two input integers.
     */
    private int calculateGCD(int val1, int val2){
        if (val2 == 0) {
            return val1;
        }
        return calculateGCD(val2, val1 % val2);
    }


    /**
     * Calculates the greatest common divisor (GCD) for an array of integers using Euclid's algorithm.
     *
     * @param numbersArray An array of integers for which the GCD is calculated.
     * @return The greatest common divisor (GCD) of the numbers in the input array.
     */
    private int calculateGCDforArray(int[] numbersArray){
        int result = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            result = calculateGCD(result, numbersArray[i]);
        }
        return result;
    }




    private void calculateGCDTest() {
        SaxionApp.printLine("calculateGCD(8, 12): " + calculateGCD(8, 12) + " which is the correct answer: " + (calculateGCD(8, 12) == 4));
        SaxionApp.printLine("calculateGCD(10, 15): " + calculateGCD(10, 15) + " which is the correct answer: " + (calculateGCD(10, 15) == 5));
        SaxionApp.printLine("calculateGCD(54, 24): " + calculateGCD(54, 24) + " which is the correct answer: " + (calculateGCD(54, 24) == 6));
        SaxionApp.printLine("calculateGCD(273, 63): " + calculateGCD(273, 63) + " which is the correct answer: " + (calculateGCD(273, 63) == 21));

    }
    private void calculateGCDarrayTest(){
        SaxionApp.printLine("calculateGCDforArray("+Arrays.toString(new int[]{15*19,24*19,178*19,9*19,213*19,13*19,87*19})+"): " + calculateGCDforArray(new int[]{15*19,24*19,178*19,9*19,213*19,13*19,87*19}) + " which is the correct answer: " + (calculateGCDforArray(new int[]{15*19,24*19,178*19,9*19,213*19,13*19,87*19}) == 19));
    }

    public static void main(String[] args) {
        SaxionApp.start(new GCDMain(), 1024, 768);

    }
}
