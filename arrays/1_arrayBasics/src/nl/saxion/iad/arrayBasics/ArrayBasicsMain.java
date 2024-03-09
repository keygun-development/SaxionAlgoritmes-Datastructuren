package nl.saxion.iad.arrayBasics;

import java.util.stream.IntStream;

public class ArrayBasicsMain {

    public void run() {
        int[] numbers = new int[]{1, 2, 4, 7, 11, 16};


        //TODO: 1. print the result of multiplying the 2nd and 6th number from the numbers array
        System.out.println("The result of multiplying the 2nd and 6th number is: " + numbers[1] * numbers[5]);


        //2. Implement the sumOfArray method to show the result of adding all numbers together
        System.out.print("The sum of the : ");
        System.out.println(sumOfArray(numbers));


        //3. Initialize a new array that stores the same numbers as the numbers array,
        // but each even number is divided by 2 and each odd number is multiplied by 3.
        // Then print the sum of all numbers in the second array
        int[] secondArray = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                secondArray[i] = numbers[i] / 2;
            } else {
                secondArray[i] = numbers[i] * 3;
            }
        }
        System.out.println("The sum of the second array is: " + sumOfArray(secondArray));


        //4. Extra challenge: Implement the 'removeElementFromArray' method.
        // Again after removing the second element, print the result of adding all remaining numbers together
        numbers = removeElementFromArray(numbers, 1);
        System.out.print("The sum of numbers array after removing the second element is: ");
        System.out.println(sumOfArray(numbers));
    }


    /**
     * sums all numbers in the originalArray and returns the result
     *
     * @param originalArray
     * @return
     */
    public static int sumOfArray(int[] originalArray) {
        //TODO: implement this method
        int sum = 0;
        for (int i = 0; i < originalArray.length; i++) {
            sum += originalArray[i];
        }

        return sum;
    }


    /**
     * Returns a new array based on the originalArray, but the 'element' is removed
     *
     * @param originalArray the original array
     * @param element       the index of the element that should be removed
     * @return
     */
    public static int[] removeElementFromArray(int[] originalArray, int element) {
        int[] result = new int[originalArray.length];

        // Using array:
        for (int i = 0; i<result.length; i++) {
            if (i == element) {
                continue;
            }
            result[i] = originalArray[i];
        }
        return result;
    }


    public static void main(String[] args) {
        new ArrayBasicsMain().run();
    }

}
