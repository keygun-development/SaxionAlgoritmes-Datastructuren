import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int currX = 0;
    private static int currY = 0;
    private static ArrayList<Integer> path = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("Choose a number between 50 - 100: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Grid grid = new Grid();
        grid.printGrid();
        pathFinder(grid);
    }

    public static void pathFinder(Grid grid) {
        if (canMove(currX, currY + 1)) {
            if (grid.getGrid()[currX][currY + 1] == 0) {
                System.out.println("You have reached the end of the grid!");
                return;
            }
            if (grid.getGrid()[currX][currY + 1] < grid.getGrid()[currX + 1][currY]) {
                path.add(grid.getGrid()[currX][currY + 1]);
                currY++;
                pathFinder(grid);
            }
            if(grid.getGrid()[currX][currY + 1] > grid.getGrid()[currX + 1][currY]) {
                if (canMove(currX + 1, currY)) {
                    path.add(grid.getGrid()[currX + 1][currY]);
                    currX++;
                    pathFinder(grid);
                }
            }
            System.out.println("Path: " + path);
        }
    }

    public static boolean canMove(int x, int y) {
        if (x >= 0 && x < 7 && y >= 0 && y < 7) {
            return true;
        }
        return false;
    }
}