package MVCModel;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int width;
    private final int height;
    private Cell[][] grid;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = this.createGrid();
    }

    public List<Cell> getSurroundings(Cell cell) {
        List<Cell> surroundings = new ArrayList<Cell>();
        int xCoordinate = cell.getxCoordinate();
        int yCoordinate = cell.getyCoordinate();

        // regular MVCModel.Cell inside grid
        if (!isAtBoundary(cell)) {
            surroundings.add(grid[yCoordinate + 1][xCoordinate - 1]);
            surroundings.add(grid[yCoordinate + 1][xCoordinate]);
            surroundings.add(grid[yCoordinate + 1][xCoordinate + 1]);
            surroundings.add(grid[yCoordinate][xCoordinate - 1]);
            surroundings.add(grid[yCoordinate][xCoordinate + 1]);
            surroundings.add(grid[yCoordinate - 1][xCoordinate - 1]);
            surroundings.add(grid[yCoordinate - 1][xCoordinate]);
            surroundings.add(grid[yCoordinate - 1][xCoordinate + 1]);
        } else if (isOnCorner(cell)) {
            // upper left MVCModel.Cell
            if (xCoordinate == 0 && yCoordinate == 0) {
                surroundings.add(grid[yCoordinate + 1][xCoordinate]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate][xCoordinate + 1]);
                // lower left MVCModel.Cell
            } else if (xCoordinate == 0 && yCoordinate == (height - 1)) {
                surroundings.add(grid[yCoordinate][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate + 1]);
                // upper right MVCModel.Cell
            } else if (xCoordinate == (width - 1) && yCoordinate == 0) {
                surroundings.add(grid[yCoordinate + 1][xCoordinate]);
                surroundings.add(grid[yCoordinate][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate - 1]);
                // lower right MVCModel.Cell
            } else {
                surroundings.add(grid[yCoordinate - 1][xCoordinate]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate][xCoordinate - 1]);
            }
            // boundary MVCModel.Cell
        } else if (isAtBoundary(cell)) {
            // left boundary
            if (xCoordinate == 0) {
                surroundings.add(grid[yCoordinate - 1][xCoordinate]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate]);

                // right boundary
            } else if (xCoordinate == (width - 1)) {
                surroundings.add(grid[yCoordinate - 1][xCoordinate]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate]);

                // top boundary
            } else if (yCoordinate == 0) {
                surroundings.add(grid[yCoordinate][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate]);
                surroundings.add(grid[yCoordinate + 1][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate][xCoordinate + 1]);

                // bottom boundary
            } else if (yCoordinate == (height - 1)) {
                surroundings.add(grid[yCoordinate][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate - 1]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate]);
                surroundings.add(grid[yCoordinate - 1][xCoordinate + 1]);
                surroundings.add(grid[yCoordinate][xCoordinate + 1]);

            }
        }
        return surroundings;
    }


    public boolean isAtBoundary(Cell cell) {
        if (cell.getxCoordinate() == 0 || cell.getxCoordinate() == (width - 1) || cell.getyCoordinate() == 0 || cell.getyCoordinate() == (height - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnCorner(Cell cell) {
        if (!isAtBoundary(cell)) {
            return false;
        }
        if (cell.getxCoordinate() == 0 || cell.getxCoordinate() == (width - 1)) {
            if (cell.getyCoordinate() == 0 || cell.getyCoordinate() == (height - 1)) {
                return true;
            }
        }
        return false;
    }

    private Cell[][] createGrid() {
        Cell[][] grid = new Cell[this.height][this.width];
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
        return grid;
    }

    public Cell getCellAtPosition(int xCoordinate, int yCoordinate){
        return grid[xCoordinate][yCoordinate];
    }
}
