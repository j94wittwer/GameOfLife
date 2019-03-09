import java.util.Random;

public class Rules {

    private Cell[][] grid;
    private final int height;
    private final int width;
    private final int size;
    private final int seedCount;


    public Rules(int height, int width, int seedCount) {
        this.height = height;
        this.width = width;
        this.grid = new Cell[height][width];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                grid[i][j] = new Cell(j, i);
            }
        }
        this.size = height * width;
        this.seedCount = seedCount;
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

    public void printGrid() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                if (grid[i][j].isAlive()) {
                    System.out.print("O");
                } else {
                    System.out.print("_");
                }
            System.out.println("\n");
        }
    }

    public void checkSurrounding(Cell cell) {

        int sum = 0;
        int xCoordinate = cell.getxCoordinate();
        int yCoordinate = cell.getyCoordinate();

        if (xCoordinate >= 0 && xCoordinate <= this.width && yCoordinate >= 0 && yCoordinate <= this.height) {

        }
    }
}
