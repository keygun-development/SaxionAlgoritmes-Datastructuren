package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class InterestMain implements Runnable {

    public void run() {
        //Base test
        interestTest();

        //Extra challenge Test
        totalInterestTest();
    }

    /**
     * Calculates the savings amount after a specified number of years based on an initial deposit and an interest rate.
     *
     * @param currentDeposit The initial deposit amount.
     * @param interestrate   The annual interest rate factor.
     * @param yearsLeft      The number of years for which the savings need to be calculated.
     * @return The savings amount after the specified number of years with the given interest rate.
     */
    private int calculateSavings(int currentDeposit, double interestrate, int yearsLeft){
        if (yearsLeft == 0) {
            return currentDeposit;
        }
        return calculateSavings((int) (currentDeposit + (currentDeposit * interestrate)), interestrate, yearsLeft - 1);
    }



    /**
     * Calculates the total interest earned over a specified period using compound interest.
     *
     * @param currentDeposit The initial deposit amount.
     * @param interestRate   The interest rate per annum (decimal).
     * @param yearsLeft      The number of years the interest is to be calculated for.
     * @return The total interest earned over the specified period.
     */
    public double calculateTotalInterest(int currentDeposit, double interestRate, int yearsLeft) {
        if (yearsLeft == 0) {
            return 0;
        }
        int originalDeposit = currentDeposit;
        currentDeposit = (int) (currentDeposit + (currentDeposit * interestRate));
        return currentDeposit - originalDeposit + calculateTotalInterest(currentDeposit, interestRate, yearsLeft - 1);
    }



    private void interestTest() {
        SaxionApp.printLine("calculateSavings(1000, 0.07, 1): " + calculateSavings(1000, 0.07, 1) + " which is the correct answer: " + (calculateSavings(1000, 0.07, 1) == 1070));
        SaxionApp.printLine("calculateSavings(1000, 0.07, 2): " + calculateSavings(1000, 0.07, 2) + " which is the correct answer: " + (calculateSavings(1000, 0.07, 2) == 1144));
        SaxionApp.printLine("calculateSavings(1000, 0.07, 3): " + calculateSavings(1000, 0.07, 3) + " which is the correct answer: " + (calculateSavings(1000, 0.07, 3) == 1224));
        SaxionApp.printLine("calculateSavings(1000, 0.07, 10): " + calculateSavings(1000, 0.07, 10) + " which is the correct answer: " + (calculateSavings(1000, 0.07, 10) == 1961));
        SaxionApp.printLine("calculateSavings(1000, 0.07, 30): " + calculateSavings(1000, 0.07, 30) + " which is the correct answer: " + (calculateSavings(1000, 0.07, 30) == 7571));
        SaxionApp.printLine("calculateSavings(1500, 0.05, 5): " + calculateSavings(1500, 0.05, 5) + " which is the correct answer: " + (calculateSavings(1500, 0.05, 5) == 1912));
        SaxionApp.printLine("calculateSavings(2000, 0.1, 7): " + calculateSavings(2000, 0.1, 7) + " which is the correct answer: " + (calculateSavings(2000, 0.1, 7) == 3896));
        SaxionApp.printLine("calculateSavings(3000, 0.08, 10): " + calculateSavings(3000, 0.08, 10) + " which is the correct answer: " + (calculateSavings(3000, 0.08, 10) == 6471));
        SaxionApp.printLine("calculateSavings(2500, 0.12, 15): " + calculateSavings(2500, 0.12, 15) + " which is the correct answer: " + (calculateSavings(2500, 0.12, 15) == 13668));
        SaxionApp.printLine("calculateSavings(1800, 0.06, 20): " + calculateSavings(1800, 0.06, 20) + " which is the correct answer: " + (calculateSavings(1800, 0.06, 20) == 5757));

    }

    private void totalInterestTest(){
        int expected1 = 0;
        SaxionApp.printLine("calculateTotalInterest(1000, 0.07, 0): " +
                calculateTotalInterest(1000, 0.07, 0) +
                " which is the correct answer: " +
                (calculateTotalInterest(1000, 0.07, 0) == expected1));

        int expected2 = 70;
        SaxionApp.printLine("calculateTotalInterest(1000, 0.07, 1): " +
                calculateTotalInterest(1000, 0.07, 1) +
                " which is the correct answer: " +
                (calculateTotalInterest(1000, 0.07, 1) == expected2));

        int expected3 = 144;
        SaxionApp.printLine("calculateTotalInterest(1000, 0.07, 2): " +
                calculateTotalInterest(1000, 0.07, 2) +
                " which is the correct answer: " +
                (calculateTotalInterest(1000, 0.07, 2) == expected3));

        int expected4 = 0;
        SaxionApp.printLine("calculateTotalInterest(1000, 0, 10): " +
                calculateTotalInterest(1000, 0, 10) +
                " which is the correct answer: " +
                (calculateTotalInterest(1000, 0, 10) == expected4));

        int expected5 = 0;
        SaxionApp.printLine("calculateTotalInterest(0, 0.07, 10): " +
                calculateTotalInterest(0, 0.07, 10) +
                " which is the correct answer: " +
                (calculateTotalInterest(0, 0.07, 10) == expected5));
    }

    public static void main(String[] args) {
        SaxionApp.start(new InterestMain(), 1024, 768);

    }
}
