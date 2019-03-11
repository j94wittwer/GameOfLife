package MVCModel;

import java.util.Random;

public class Cell {

    private boolean isAlive;
    private int xCoordinate;
    private int yCoordinate;

    public Cell(int yCoordinate, int xCoordinate) {
        this.isAlive = randomStatus();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    private boolean randomStatus(){
        Random r = new Random();
        if (r.nextInt(10) == 9){
            return true;
        }else {
            return false;
        }
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
