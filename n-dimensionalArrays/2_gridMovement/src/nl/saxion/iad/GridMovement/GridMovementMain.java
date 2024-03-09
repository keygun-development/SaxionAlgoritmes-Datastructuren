package nl.saxion.iad.GridMovement;

import nl.saxion.app.SaxionApp;

public class GridMovementMain implements Runnable {


    char[][] grid = {
            {'P','.','.','.'},
            {'.','.','P','P'},
            {'.','P','.','.'},
            {'.','K','.','.'}};


    public void run(){
        //add the knight
        grid[3][1] = 'K';
        //add the pawns
        grid[0][0] = 'P';
        grid[1][2] = 'P';
        grid[1][3] = 'P';
        grid[2][1] = 'P';

        //start state
        printGrid();

        //move 1
        grid[3][1] = '.';
        nextMove(2, 1);
        printGrid();

        //move 2
        grid[1][2] = '.';
        nextMove(0, 0);
        printGrid();

        //move 3
        grid[0][0] = '.';
        nextMove(1, 2);
        printGrid();

        //move 4
        grid[2][1] = '.';
        nextMove(3, 1);
        printGrid();
    }



    private void nextMove(int x, int y) {
        if (isInGrid(x, y) && doesContainPawn(x, y)) {
            moveKnight(x, y);
        }
    }

    private boolean doesContainPawn(int x, int y) {
        return grid[y][x] == 'P';
    }

    private boolean isInGrid(int x, int y) {
        return x >= 0 && x < grid[0].length && y >= 0 && y < grid.length;
    }

    private void moveKnight(int x, int y) {
        grid[y][x] = 'K';
    }


    private void printGrid(){
        SaxionApp.printLine("======== GRID ========");
        for (int y = 0; y < grid.length; y++) {
            String line = "";
            for (int x = 0; x < grid[y].length; x++) {
                line += grid[y][x];
            }
            SaxionApp.printLine(line);
        }
    }



    public static void main(String[] args) {
        SaxionApp.start(new GridMovementMain(), 1024, 768);
    }
}
