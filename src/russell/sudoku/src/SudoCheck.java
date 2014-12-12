/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;
import russell.sudoku.util.Reference;

/**
 *
 * @author Russell
 */
public class SudoCheck {
	public static void convertTo4D() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						Reference.Array4D[i][j][k][l] = SudokuGUI.Block[3*i + j][3*k + l].ACTUAL_VALUE;
					}
				}
			}
		}
	}

	public static void convertTo2D() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				SudokuGUI.Block[i][j].setNumber(Reference.Array4D[i/3][i%3][j/3][j%3]);
			}
		}
	}

	public static boolean isFilled() {
		// check for empty spaces
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				for (int c = 0; c < 3; c++) {
					for (int d = 0; d < 3; d++) {
						if (Reference.Array4D[a][b][c][d] == 0) {
							return false;
						}
					}
				}
			}
		}

		// if all full
		return true;
	}

	public static boolean eureka() {

		convertTo4D();

		if (!isFilled()) {
			return false;
		}

		// check for 3x3 boxes
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 3; b++) {
				for(int c = 0; c < 8; c++) {
					for(int d = c+1; d < 9; d++) {
						if(Reference.Array4D[a][b][c/3][c%3] == Reference.Array4D[a][b][d/3][d%3]) {
							return false;
						}
					}
				}
			}
		}

		// check for rows and columns
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				for (int c = 0; c < 2; c++) {
					for (int d = 0; d < 3; d++) {
						for (int e = c+1; e < 3; e++) {
							for (int f = 0; f < 3; f++) {
								if (Reference.Array4D[a][c][b][d] == Reference.Array4D[a][e][b][f] || Reference.Array4D[c][a][d][b] == Reference.Array4D[e][a][f][b]) {
									return false;
								}
							}
						}
					}
				}
			}
		}

		// if all goes well
		return true;
	}
}
