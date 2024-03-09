package nl.saxion.iad.WeatherForecast;
import nl.saxion.app.SaxionApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherForecastMain implements Runnable {
    int[][][] weatherForecast = new int[10][24][2]; //days-hours-(temp/sunPercentage)

    public void run(){
        ArrayList<String> lines = readFromFile("6_weatherForecast/weatherForecast.txt");
        lines.remove(0);
        readData(lines);
        printBestDay();
    }

    public void readData(ArrayList<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split(",");
            for (int j = 0; j < tokens.length; j++) {
                weatherForecast[i][j][0] = Integer.parseInt(tokens[j]);
            }
        }
    }

    public void printBestDay() {
        double[] scores = new double[10];
        for (int day = 0; day < 10; day++) {
            double dayScore = 0;
            for (int hour = 14; hour < 22; hour++) {
                int temperature = weatherForecast[day][hour][0];
                int sunPercentage = weatherForecast[day][hour][1];
                double hourScore = temperature * sunPercentage;
                dayScore += hourScore;
            }
            scores[day] = dayScore;
        }

        double maxScore = scores[0];
        int bestDay = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                bestDay = i;
            }
        }

        SaxionApp.printLine("Best day for BBQ: Day " + (bestDay + 1) + ", Score: " + maxScore);
    }


    /***
     * This method returns an ArrayList where each entry is a single line from the input file
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
        SaxionApp.start(new WeatherForecastMain(), 1024, 768);
    }

}