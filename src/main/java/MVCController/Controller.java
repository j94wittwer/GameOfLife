package MVCController;

import MVCModel.Cell;
import MVCModel.Grid;
import MVCView.Game;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {

        final int width = 100;
        final int height = 100;

        Grid grid = new Grid(width, height);
        Rules rules = new Rules(height, width);

        List surroundings;

        surroundings = grid.getSurroundings(grid.getCellAtPosition(0, 0));

        System.out.println(surroundings);




    }
}
