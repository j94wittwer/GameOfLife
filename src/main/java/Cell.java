public class Cell {

    private boolean isAlive;
    private int xCoordinate;
    private int yCoordinate;

    public Cell(int yCoordinate, int xCoordinate) {
        this.isAlive = false;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }
}
