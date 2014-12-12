/*
 * Sudoku Game
 * Sajag made this!!
 */

package russell.sudoku.util;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Russell
 */
public class Utility {

	public static void setSystemLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Can't use SystemLookAndFeel for some reason. Using Metal instead.", "LookAndFeel Exception!", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static int abs(int A) {
		return (A < 0) ? -A : A;
	}
}
