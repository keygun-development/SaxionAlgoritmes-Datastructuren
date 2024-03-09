package nl.saxion.iad;

import java.util.Objects;

public class NumbersMain {

    public void run() {
        printTest("Reverse number of 12345", 54321, reverse(12345));
        printTest("Reverse number of 884135", 531488, reverse(884135));

        printTest("Palindrome test of 1234321", true, isPalindrome(1234321));
        printTest("Palindrome test of 1244321", false, isPalindrome(1244321));

        printTest("Prime test of 17", true, isPrime(17));
        printTest("Prime test of 18", false, isPrime(18));
        printTest("Prime test of 876543211", true, isPrime(876543211));

        System.out.println("Prime numbers < 100");
        System.out.println("Expected: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97");
        System.out.print("Actual  : ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    /**
     * Reverses the digits of a given number.
     *
     * @param number the number (int) to reverse
     * @return the reversed number as an integer
     */
    public String reverse(int number) {
        String reverseString = new StringBuilder(String.valueOf(number)).reverse().toString();
        return reverseString;
    }

    /**
     * Checks if a given number is a 'palindrome' — its digits in reverse order form the same number.
     *
     * @param number the number (int) to check
     * @return true if the number is a palindrom, false otherwise
     */
    public boolean isPalindrome(int number) {
        StringBuilder reverseString = new StringBuilder(String.valueOf(number)).reverse();
        if (String.valueOf(reverseString).equals(String.valueOf(number))) {
            return true;
        }
        return false;
    }

    /**
     * Checks if a given number is 'prime' — a number divisible only by 1 and itself.
     *
     * @param number the number (int) to check
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

    private void printTest(String title, Object expected, Object actual) {
        System.out.println(title);
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        System.out.println();
    }

    public static void main(String[] args) {
        new NumbersMain().run();
    }

}
