package nl.saxion.iad.VigenereCipher;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class VigenereCipherMain implements Runnable {

    char[][] matrix;

    public void run() {
        matrix = generateMatrix();
        printMatrix();


        SaxionApp.printLine("Plaintext: message with key zodiacs");
        SaxionApp.printLine("Expected: lsvaaiw");
        SaxionApp.printLine("Real    : " + encrypt("message", "zodiacs"));
        SaxionApp.printLine("");

        SaxionApp.printLine("Plaintext: computers with key character");
        SaxionApp.printLine("Expected: evmguvxvj");
        SaxionApp.printLine("Real    : " + encrypt("computers", "character"));
        SaxionApp.printLine("");


        //extra challenge
        SaxionApp.printLine("------ Extra challenge ------");
        SaxionApp.printLine("Plaintext: thecomputerwasborntosolveroblemsthatdidnotexistbefore with key gates");
        SaxionApp.printLine("Expected: zhxggspnxwxwtwturgxgyoezwxoupwssmlszdbhfutxbaytuixurx");
        SaxionApp.printLine("Real    : " + encrypt("thecomputerwasborntosolveroblemsthatdidnotexistbefore", "gates"));
        SaxionApp.printLine("");

        SaxionApp.printLine("Plaintext: ditiszeergeheim with key zodiac");
        SaxionApp.printLine("Expected: cwwqsjdsuoerdwp");
        SaxionApp.printLine("Real    : " + encrypt("ditiszeergeheim", "zodiac"));


        SaxionApp.printLine("Plaintext: text with key ciph");
        SaxionApp.printLine("text    : " + encrypt("text", "ciph"));

        SaxionApp.printLine("Plaintext: longertext with key ciph");
        SaxionApp.printLine("longertext    : " + encrypt("longertext", "ciph"));
    }


    private String encrypt(String word, String cipher) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toUpperCase(word.charAt(i));
            int wordIndex = currentChar - 'A';

            char currentCipherChar = cipher.charAt(i % cipher.length());
            currentCipherChar = Character.toUpperCase(currentCipherChar);
            int cipherIndex = currentCipherChar - 'A';

            wordIndex = (wordIndex + 26) % 26;
            cipherIndex = (cipherIndex + 26) % 26;

            result += matrix[wordIndex][cipherIndex];
        }

        return result.toLowerCase();
    }


    private char[][] generateMatrix() {
        char[][] matrix = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                matrix[i][j] = (char) ((i + j) % 26 + 65);
            }
        }
        return matrix;
    }


    private void printMatrix() {
        if (matrix == null) {
            SaxionApp.printLine("Matrix is null, did you implement generateMatrix() correctly?", Color.red);
            return;
        }

        SaxionApp.printLine("-------- matrix --------");
        for (int y = 0; y < 26; y++) {
            String currentRow = "";
            for (int x = 0; x < 26; x++) {
                currentRow += matrix[y][x];
            }
            SaxionApp.printLine(currentRow);
        }
    }


    public static void main(String[] args) {
        SaxionApp.start(new VigenereCipherMain(), 1024, 1024);
    }
}
