/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;
import russell.sudoku.util.Reference;
import javax.swing.JOptionPane;

/**
 *
 * @author Russell
 */
public class SudoGen {

	private static int[][] Question = new int[9][9];

	public static void qGen() {
		int Index = Reference.Rand.nextInt(Reference.SolvedDemo.length);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				Question[i][j] = Reference.SolvedDemo[Index].charAt(9 * i + j) - '0';
			}
		}
	}

	public static void newGame() {
		qGen();
		int Diff = Reference.Difficulty / 2;
		for (int a = 0; a < Diff; a++) {
			int x1 = Reference.Rand.nextInt(9);
			int y1 = Reference.Rand.nextInt(9);
			int x2 = (x1-8 < 0) ? -(x1-8) : x1-8;
			int y2 = (y1-8 < 0) ? -(y1-8) : y1-8;
			SudokuGUI.Block[x1][y1].fix(Question[x1][y1]);
			SudokuGUI.Block[x2][y2].fix(Question[x2][y2]);
		}
	}

	// WIP
	public static void generate() {
//		int num;
//		String msg ="";
//		for(int a = 0; a < 3; a++) {
//			for(int b = 0; b < 3; b++) {
//				for(int c = 0; c < 9; c++) {
//					check[a][b][c] = false;
//				}
//			}
//		}
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
