import java.util.Arrays;

public class EliminationMain {

    public void run() {
        int[] array1 = {1, 3, 5, 5, 7, 8, 8, 9};
        int[] array1AfterElimination = eliminateDuplicates(array1);
        System.out.println("Expected: 1, 3, 5, 7, 8, 9");
        System.out.println("Actual:   " + printArray(array1AfterElimination));

        int[] array2 = {5, 3, 7, 3, 2, 8, 10, 5, 3, 5, 9};
        int[] array2AfterElimination = eliminateDuplicates(array2);
        System.out.println("Expected: 5, 3, 7, 2, 8, 10, 9");
        System.out.println("Actual:   " + printArray(array2AfterElimination));

        int[] array3 = {99, 98, 50, 50, 98, 99, 1};
        int[] array3AfterElimination = eliminateDuplicates(array3);
        System.out.println("Expected: 99, 98, 50, 1");
        System.out.println("Actual:   " + printArray(array3AfterElimination));
    }


    private int[] eliminateDuplicates(int[] input) {
        int[] result = new int[input.length];
        int resultIndex = 0;

        for (int i = 0; i < input.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < resultIndex; j++) {
                if (input[i] == result[j]) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                result[resultIndex] = input[i];
                resultIndex++;
            }
        }
        result = Arrays.copyOf(result, resultIndex);

        return result;
    }


    private String printArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length - 1) { //if not the last element, add a ","
                result += ", ";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        new EliminationMain().run();
    }
}
