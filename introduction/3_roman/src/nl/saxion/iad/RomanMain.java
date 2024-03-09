package nl.saxion.iad;

import java.util.HashMap;
import java.util.Map;

public class RomanMain {

    // Initialize the map with all the values immediately using an instance initializer block
    private static final Map<Integer, String> romanMap = new HashMap<>() {{
        put(1, "I");
        put(2, "II");
        put(3, "III");
        put(4, "IV");
        put(5, "V");
        put(6, "VI");
        put(7, "VII");
        put(8, "VIII");
        put(9, "IX");
        put(10, "X");
        put(11, "XI");
        put(12, "XII");
        put(13, "XIII");
        put(14, "XIV");
        put(15, "XV");
        put(444, "CDXLIV");
        put(999, "CMXCIX");
        put(2449, "MMCDXLIX");
        put(3888, "MMMDCCCLXXXVIII");
        put(3997, "MMMCMXCVII");
        put(3998, "MMMCMXCVIII");
        put(3999, "MMMCMXCIX");
    }};


    public void run() {
        // Arabic to Roman tests
        System.out.println("Test 1: translating Arabic numbers 1 - 15 to Roman");
        System.out.println("Expected: I II III IV V VI VII VIII IX X XI XII XIII XIV XV");
        System.out.print("Real    : ");
        for (int i = 1; i <= 15; i++) {
            System.out.print(arabicToRoman(i) + " ");
        }
        System.out.println("\n");

        int[] numbers = {444, 999, 2449, 3888, 3997, 3998, 3999};
        System.out.println("Test 2: translating Arabic numbers 444, 999, 2449,3888, 3997, 3998, 3999 to Roman");
        System.out.println("Expected: CDXLIV CMXCIX MMCDXLIX MMMDCCCLXXXVIII MMMCMXCVII MMMCMXCVIII MMMCMXCIX");
        System.out.print("Real    : ");
        for (int num : numbers) {
            System.out.print(arabicToRoman(num) + " ");
        }
        System.out.println();


        // Roman to Arabic tests
        System.out.println();
        System.out.println("Test 3: translating Roman numbers I II III IV V VI VII VIII IX X XI XII XIII XIV XV to Arabic");
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV"};
        System.out.println("Expected: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ");
        System.out.print("Real    : ");
        for (String rom : romans) {
            System.out.print(romanToArabic(rom) + " ");
        }
        System.out.println("\n");

        romans = new String[]{"CDXLIV", "CMXCIX", "M", "MMCDXLIX", "MMMDCCCLXXXVIII", "MMMCMXCVII", "MMMCMXCVIII", "MMMCMXCIX"};
        System.out.println("Test 4: translating Roman numbers CDXLIV, CMXCIX, M, MMCDXLIX, MMMDCCCLXXXVIII, MMMCMXCVII, MMMCMXCVIII, MMMCMXCIX to Arabic");
        System.out.println("Expected: 444 999 1000 2449 3888 3997 3998 3999");
        System.out.print("Real    : ");
        for (String rom : romans) {
            System.out.print(romanToArabic(rom) + " ");
        }
        System.out.println();
    }

    private String arabicToRoman(int arabic) {
        return romanMap.get(arabic);
    }

    public int romanToArabic(String roman) {
        int result = 0;
        int index = 0;
        while (index < roman.length()) {
            char currentChar = roman.charAt(index);
            int currentValue = getValue(currentChar);
            if (index < roman.length() - 1) {
                char nextChar = roman.charAt(index + 1);
                int nextValue = getValue(nextChar);
                if (nextValue > currentValue) {
                    result += (nextValue - currentValue);
                    index += 2;
                    continue;
                }
            }
            result += currentValue;
            index++;
        }
        return result;
    }

    private int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral");
        }
    }

    public static void main(String[] args) {
        new RomanMain().run();
    }
}