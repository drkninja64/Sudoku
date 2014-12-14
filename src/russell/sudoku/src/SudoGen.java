/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;
import russell.sudoku.util.*;

/**
 *
 * @author Russell
 */
public class SudoGen {

	private static final int[][] Question = new int[9][9];
	private static int PreviousIndex = -1;
	private static int CurrentIndex;

	public static void qGen() {
		do {
			CurrentIndex = Reference.Rand.nextInt(Reference.SolvedDemo.length);
		} while (CurrentIndex == PreviousIndex);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				Question[i][j] = Reference.SolvedDemo[CurrentIndex].charAt(9 * i + j) - '0';
			}
		}
		PreviousIndex = CurrentIndex;
	}

	public static void newGame() {
		qGen();
		for (int a = 0; a < Reference.Difficulty; a++) {
			int x1 = Reference.Rand.nextInt(9);
			int y1 = Reference.Rand.nextInt(9);
			int x2 = Utility.abs(x1 - 8);
			int y2 = Utility.abs(y1 - 8);
			if (SudokuGUI.Block[x1][y1].isFixed()) {
				a--;
			} else {
				SudokuGUI.Block[x1][y1].fix(Question[x1][y1]);
				SudokuGUI.Block[x2][y2].fix(Question[x2][y2]);
			}
		}
	}

	// Work in progress
	public static void generate() {
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 3; b++) {
				for(int c = 0; c < 9; c++) {
					Reference.Array4D[a][b][c/3][c%3] = 1 + Reference.Rand.nextInt(9);
					int d;
					for(d = 0; d < c; d++) {
						if (Reference.Array4D[a][b][c/3][c%3] == Reference.Array4D[a][b][d/3][d%3])
							break;
					}
					if (c != d) {
						c--;
					}
				}
			}
		}
		SudoCheck.convertTo2D();
	}
}
