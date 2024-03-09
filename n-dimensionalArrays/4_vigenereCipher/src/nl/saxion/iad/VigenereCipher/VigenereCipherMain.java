package nl.saxion.iad.VigenereCipher;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class VigenereCipherMain implements Runnable {

    char[][] matrix;

    public void run(){
        matrix = generateMatrix();
        printMatrix();



        SaxionApp.printLine("");
        SaxionApp.printLine("Expected: lsvaaiw");
        SaxionApp.printLine("Real    : " + encrypt("message", "zodiacs"));
        SaxionApp.printLine("");

        SaxionApp.printLine("Expected: evmguvxvj");
        SaxionApp.printLine("Real    : " + encrypt("computers", "character"));
        SaxionApp.printLine("");


        //extra challenge
        SaxionApp.printLine("------ Extra challenge ------");
        SaxionApp.printLine("Expected: zhxggspnxwxwtwturgxgyoezwxoupwssmlszdbhfutxbaytuixurx");
        SaxionApp.printLine("Real    : " + encrypt("thecomputerwasborntosolveroblemsthatdidnotexistbefore", "gates"));
        SaxionApp.printLine("");

        SaxionApp.printLine("Expected: cwwqsjdsuoerdwp");
        SaxionApp.printLine("Real    : " + encrypt("ditiszeergeheim", "zodiac"));


        SaxionApp.printLine("text    : " + encrypt("text", "ciph"));
        SaxionApp.printLine("longertext    : " + encrypt("longertext", "ciph"));
    }




    private String encrypt(String word, String cipher){
        String result = "";

        //TODO: implement the Vigenere algorithm

        return result;
    }


    private char[][] generateMatrix(){
        //TODO: generate the Vigenere matrix (26x26, the letters on both axis)



        return null;
    }


    private void printMatrix(){
        if(matrix == null){
            SaxionApp.printLine("Matrix is null, did you implement generateMatrix() correctly?", Color.red);
            return;
        }

        SaxionApp.printLine("-------- matrix --------");
        for(int y=0; y < 26; y++){
            String currentRow = "";
            for(int x=0; x < 26; x++) {
                currentRow += matrix[y][x];
            }
            SaxionApp.printLine(currentRow);
        }
    }


    public static void main(String[] args) {
        SaxionApp.start(new VigenereCipherMain(), 1024, 1024);
    }
}
