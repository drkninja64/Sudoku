/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.util;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import russell.sudoku.src.SudoCheck;

/**
 *
 * @author Russell
 */
public class Utility {

	public static void setSystemLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
			JOptionPane.showMessageDialog(null, "Couldn't use SystemLookAndFeel. Using MetalLookAndFeel instead.", "LookAndFeel Error!", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static int abs(int A) {
		return (A < 0) ? -A : A;
	}

	public static void onExit() {
		if (SudoCheck.eureka() || JOptionPane.showConfirmDialog(null, "Are you sure you wish to quit?\nCurrent progress will be lost.", "Confirm Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
        
}
