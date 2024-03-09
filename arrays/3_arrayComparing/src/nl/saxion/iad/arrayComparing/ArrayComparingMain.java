package nl.saxion.iad.arrayComparing;

import java.util.Arrays;

public class ArrayComparingMain {
    public void run(){
        System.out.println("Expected: true");
        System.out.println("Actual: " + compareArrays(new int[]{1,4,5,6}, new int[]{1,4,5,6}));
        System.out.println();
        System.out.println("Expected: false");
        System.out.println("Actual: " + compareArrays(new int[]{1,5,5,6}, new int[]{1,4,5,6}));
        System.out.println();
        System.out.println("Expected: true");
        System.out.println("Actual: " + compareArrays(new int[]{1}, new int[]{1}));
        System.out.println();
        System.out.println("Expected: false");
        System.out.println("Actual: " + compareArrays(new int[]{1,3,5}, new int[]{1}));
        System.out.println();
        System.out.println("Expected: false");
        System.out.println("Actual: " + compareArrays(new int[]{1}, new int[]{1,4,7}));
        System.out.println();
        System.out.println("Expected: true");
        System.out.println("Actual: " + compareArrays(new int[0], new int[0]));


        System.out.println("======= Extra challenge =========");
        System.out.println("Expected: true");
        System.out.println("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{1,3,5}));
        System.out.println();
        System.out.println("Expected: false");
        System.out.println("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{1,3,5,8}));
        System.out.println();
        System.out.println("Expected: true");
        System.out.println("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{3,1,5}));
        System.out.println();
        System.out.println("Expected: false");
        System.out.println("Actual: " + compareArrays2(new int[]{1,3,5,7}, new int[]{3,1,5}));
    }


    public boolean compareArrays(int[] array1, int[] array2){
        return Arrays.equals(array1, array2);
    }

    public boolean compareArrays2(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        new ArrayComparingMain().run();
    }
}
