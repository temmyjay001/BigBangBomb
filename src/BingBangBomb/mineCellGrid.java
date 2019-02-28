/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BingBangBomb;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class mineCellGrid extends JPanel{
    private MineCellGridModel model;
    private List<MineCell> mineCells = new ArrayList<>();

    public mineCellGrid(final int maxRows, final int maxCols, int mineNumber) {
        model = new MineCellGridModel(maxRows, maxCols, mineNumber);
        setLayout(new GridLayout(maxRows, maxCols));

        for (int row = 0; row < maxRows; row++) {
            for (int col = 0; col < maxCols; col++) {
                MineCell mineCell = new MineCell(row, col);
                add(mineCell);
                mineCells.add(mineCell);
                model.add(mineCell.getModel(), row, col);
            }
        }

        reset();
    }

    public void reset() {
        model.reset();
        for (MineCell mineCell : mineCells) {
            mineCell.reset();
        }
    }
}
