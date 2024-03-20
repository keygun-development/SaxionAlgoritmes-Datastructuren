import java.util.Random;

public class Grid {
    private int[][] grid = new int[7][7];
    public Grid() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = random.nextInt(1, 15);
            }
        }
        grid[0][0] = 0;
    }
    public void printGrid() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setGrid(int x, int y, int value) {
        grid[x][y] = value;
    }

    public int[][] getGrid() {
        return grid;
    }
}
