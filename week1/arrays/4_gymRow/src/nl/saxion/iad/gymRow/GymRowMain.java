package nl.saxion.iad.gymRow;

import java.util.Arrays;

public class GymRowMain {

    public void run(){
        int[] childrenLength = {120, 115, 140, 110, 105, 90, 104, 128, 125, 130};


        System.out.println("Expected: 90, 104, 105, 110, 115, 120, 125, 128, 130, 140");
        int[] sortedArray = sort(childrenLength);
        System.out.println("Actual  : " + printArray(sortedArray));

    }



    private int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }
    
    private String printArray(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if(i != array.length-1){ //if not the last element, add a ","
                result+=", ";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        new GymRowMain().run();
    }
}
