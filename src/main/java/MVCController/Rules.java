package MVCController;

import MVCModel.Cell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rules {

    private Cell[][] grid;
    private final int height;
    private final int width;
    private final int seedCount;


    public Rules(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new Cell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = new Cell(j, i);
            }
        }
        Math.round(this.seedCount = (height * width)/10);
    }

    public boolean isAlive(Cell cell) {
        return cell.isAlive();
    }

    public void randomSeed() {
        Random random = new Random();
        for (int i = 0; i < seedCount; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            grid[x][y].setAlive(true);
        }
    }

    public void applyRules(Cell cell, ArrayList<Cell> surroundings) {
        int sum = 0;
        for (Cell neighbour :
                surroundings) {
            if (neighbour.isAlive()) {
                sum++;
            }
        }
        if (cell.isAlive()) {
            if ((1 < sum) && (sum < 4)) {
                cell.setAlive(true);
            } else {
                cell.setAlive(false);
            }
        } else {
            if (sum == 3) {
                cell.setAlive(true);
            }
        }
    }


}
