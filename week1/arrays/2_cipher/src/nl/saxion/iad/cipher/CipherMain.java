package nl.saxion.iad.cipher;

public class CipherMain {
    char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public void run() {
        char[] word1 = "vriwzduh".toCharArray();
        char[] word2 = "dojrulwkp".toCharArray();
        char[] word3 = "dqdfkurqlvp".toCharArray();


        System.out.print("word1: ");
        System.out.println(decipher(word1));
        System.out.print("word2: ");
        System.out.println(decipher(word2));
        System.out.print("word3: ");
        System.out.println(decipher(word3));
    }


    public char[] decipher(char[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = deciperChar(input[i]);
        }
        return input;
    }


    private char deciperChar(char input) {
        for (int i = 0; i < alphabet.length; i++) {
            if (input == alphabet[i]) {
                int index = i - 3;
                if (index < 0) {
                    index = alphabet.length + index;
                }
                return alphabet[index];
            }
        }
        return input;
    }


    public static void main(String[] args) {
        new CipherMain().run();
    }
}
