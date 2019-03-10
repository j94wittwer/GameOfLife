package MVCView;

import MVCController.Rules;
import MVCModel.Grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Game extends JPanel {

    public Game() {
        setupUI();
    }

    public void setupUI(){
        JFrame frame = new JFrame("Game Of Life");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(10, 10);
        GridLayout gridLayout = new GridLayout(10, 10);
        frame.setLayout(gridLayout);
        for (int i = 0; i < (10*10); i++){
            Graphics g =
            frame.add(new Canvas());
        }
    }


}