package nl.saxion.iad;

import nl.saxion.app.SaxionApp;

public class ReversedStringMain implements Runnable {

    public void run() {
        reversedStringTest();
    }


    private String reversedString(String word) {
        if (word.length() == 0) {
            return "";
        }
        return word.charAt(word.length() - 1) + reversedString(word.substring(0, word.length() - 1));
    }


    private void reversedStringTest() {
        SaxionApp.printLine("reversedString(word): " + reversedString("word") + " which is correct: " + "drow".equals(reversedString("word")));
        SaxionApp.printLine("reversedString(programming): " + reversedString("programming") + " which is correct: " + "gnimmargorp".equals(reversedString("programming")));
        SaxionApp.printLine("reversedString(culture): " + reversedString("culture") + " which is correct: " + "erutluc".equals(reversedString("culture")));
    }

    public static void main(String[] args) {
        SaxionApp.start(new ReversedStringMain(), 1024, 768);

    }
}
