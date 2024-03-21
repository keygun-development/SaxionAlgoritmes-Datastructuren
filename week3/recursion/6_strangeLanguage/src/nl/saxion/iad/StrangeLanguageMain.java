package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

import java.util.Arrays;

public class StrangeLanguageMain implements Runnable {

    public void run() {
        char[] babyLanguage = new char[]{'a', 'b'};
        char[] language = new char[]{'a', 'b', 'x', 'y'};

        calculateWordsTest(babyLanguage, language);
        printAllWords(language, 3);
    }

    /**
     * Calculates the number of distinct words that can be formed by given characters,
     * where each word has a specific length.
     *
     * @param characters An array of characters representing the available letters.
     * @param wordLength The desired length of each word to be formed.
     * @return The count of unique words that can be created from the given characters
     * with the specified word length.
     */
    public int calculateNumberOfWords(char[] characters, int wordLength) {
        if (wordLength == 0) {
            return 1;
        }
        int count = 0;
        for (char character : characters) {
            count += calculateNumberOfWords(characters, wordLength - 1);
        }
        return count;
    }

    public void printAllWords(char[] characters, int wordLength) {
        if (wordLength == 0) {
            SaxionApp.printLine("");
            return;
        }
        if (wordLength == 1) {
            for (char character : characters) {
                SaxionApp.print(character);
            }
            SaxionApp.printLine("");
            return;
        }

        for (char character : characters) {
            printAllWords(characters, wordLength - 1);
        }
    }


    private void calculateWordsTest(char[] babyLanguage, char[] language) {
        SaxionApp.printLine("calculateNumberOfWords(babyLanguage, 3): " + calculateNumberOfWords(babyLanguage, 3) + " which is the correct answer: " + (calculateNumberOfWords(babyLanguage, 3) == 8));
        SaxionApp.printLine("calculateNumberOfWords(language, 5): " + calculateNumberOfWords(language, 5) + " which is the correct answer: " + (calculateNumberOfWords(language, 5) == 1024));
    }

    public static void main(String[] args) {
        SaxionApp.start(new StrangeLanguageMain(), 1024, 1024);

    }
}
