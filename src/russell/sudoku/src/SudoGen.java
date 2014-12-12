/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;
import russell.sudoku.util.Reference;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Russell
 */
public class SudoGen {
	
	static boolean check[][][] = new boolean[3][3][9];
	
	public static void demo() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				SudokuGUI.Block[i][j].fix(Reference.SolvedDemo[3].charAt(9 * i + j) - '0');
			}
		}
		SudoCheck.convertTo4D();
		JOptionPane.showMessageDialog(null, SudoCheck.eureka());
	}

	public static void generate() {
		Random Rand = new Random();
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
					Reference.Array4D[a][b][c/3][c%3] = 1 + Rand.nextInt(9);
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
