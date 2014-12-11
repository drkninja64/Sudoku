/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.gui.SudokuGUI;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Russell
 */
public class SudoGen {
	public static void demo() {
		String SolvedDemo = "497835126631724589528196473759241368816357492342689715914573682263948175857261934";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				SudokuGUI.Block[i][j].fix(SolvedDemo.charAt(9 * i + j) - '0');
			}
		}
		SudoCheck.convertTo4D();
		JOptionPane.showMessageDialog(null, SudoCheck.eureka());
	}
}
