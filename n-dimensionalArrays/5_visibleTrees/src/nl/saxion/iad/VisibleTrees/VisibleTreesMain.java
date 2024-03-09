package nl.saxion.iad.VisibleTrees;
import nl.saxion.app.SaxionApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VisibleTreesMain implements Runnable {
    int forestWidth = 99;
    int forestHeight = 99;
    int[][] forrest = new int[forestHeight][forestWidth];


    public void run(){
        readData();
        printNumberOfTreesVisibleFromOutside();
    }



    private void readData(){
        // laod the data
        ArrayList<String> rows = readFromFile("5_visibleTrees/biggerForrest.txt");

        //print the map
        SaxionApp.printLine("Map of the forrest");
        for (String row : rows) {
            SaxionApp.printLine(row);
        }
        SaxionApp.printLine("=====================================");


        for (int i = 0; i < forestHeight; i++) {
            for (int j = 0; j < forestWidth; j++) {
                forrest[i][j] = Character.getNumericValue(rows.get(i).charAt(j));
            }
        }

    }

    private void printNumberOfTreesVisibleFromOutside(){
        int visible = 0;

        for (int i = 0; i < forestHeight; i++) {
            int max = -1;
            for (int j = 0; j < forestWidth; j++) {
                if (forrest[i][j] > max) {
                    max = forrest[i][j];
                    visible++;
                }
            }
        }



        SaxionApp.printLine("Trees visible: " + visible);
    }


    /***
     * This method returns a ArrayList where is entry is single line from the input file
     * @param pathName
     * @return
     */
    public static ArrayList<String> readFromFile(String pathName){
        ArrayList<String> result = new ArrayList<>();
        try {
            File file = new File(pathName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                result.add(scanner.nextLine());
            }
        }catch (FileNotFoundException fileNotFoundException){
            SaxionApp.printLine(fileNotFoundException);
        }
        return result;
    }


    public static void main(String[] args) {
        SaxionApp.start(new VisibleTreesMain(), 1024, 768);
    }
}
