package minesweeper;

import java.util.Random;

/**
 * Locations of Mines
 */
public class MineMap {
    // package access
    int numMines;
    boolean[][] isMined = new boolean[GameBoardPanel.ROWS][GameBoardPanel.COLS];
    // default is false

    // Constructor
    public MineMap() {
        super();
    }

    // Allow user to change the rows and cols
    public void newMineMap(int numMines) {
        this.numMines = numMines;
        Random rand = new Random();

        // The mines will be placed at random cells in each game
        for (int count = 0; count < numMines; count++) {
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            isMined[row][col] = true;
        }
    }
}