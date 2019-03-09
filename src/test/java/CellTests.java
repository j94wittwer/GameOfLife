import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CellTests {

    private Cell cell = new Cell(10, 10);

    @Test
    public void newCellNotAlive(){
        assertFalse(cell.isAlive());
    }

    @Test
    public void setAlive() {
        cell.setAlive(true);
        assertTrue(cell.isAlive());
    }

    @Test
    public void setDead(){
        cell.setAlive(false);
        assertFalse(cell.isAlive());
    }

    @Test
    public void getxCoordinate() {
        assertEquals(10, cell.getxCoordinate());
    }

    @Test
    public void getyCoordinate() {
        assertEquals(10, cell.getyCoordinate());
    }
}