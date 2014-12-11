/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;

/**
 *
 * @author Russell
 */
public class SudoCheck {
	private static int[][][][] Array4D;

	public static void convertTo4D() {
		Array4D = new int[3][3][3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						Array4D[i][j][k][l] = SudokuGUI.Block[3*i + j][3*k + l].ACTUAL_VALUE;
					}
				}
			}
		}
	}

	public static boolean isFilled() {
		// check for empty spaces
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				for (int c = 0; c < 3; c++) {
					for (int d = 0; d < 3; d++) {
						if (Array4D[a][b][c][d] == 0) {
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
		if (!isFilled()) {
			return false;
		}

		// check for 3x3 boxes
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 3; b++) {
				for(int c = 0; c < 8; c++) {
					for(int d = c+1; d < 9; d++) {
						if(Array4D[a][b][c/3][c%3] == Array4D[a][b][d/3][d%3]) {
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
								if (Array4D[a][c][b][d] == Array4D[a][e][b][f] || Array4D[c][a][d][b] == Array4D[e][a][f][b]) {
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
