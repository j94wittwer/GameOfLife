import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    Grid grid = new Grid(100, 100);
    Cell innerCell = grid.getCellAtPosition(20, 40);
    Cell topBoundaryCell = grid.getCellAtPosition(10, 0);
    Cell rightBoundaryCell;
    Cell bottomBoundaryCell;
    Cell leftBoundaryCell;

    @Test
    public void topBoundaryCellIsAtBoundaryTrue() {
        assertTrue(grid.isAtBoundary(topBoundaryCell));
    }

    @Test
    public void isOnCorner() {
    }
}