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
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Couldn't find SystemLookAndFeel class.\nUsing MetalLookAndFeel instead.", "LookAndFeel Error!", JOptionPane.ERROR_MESSAGE);
		} catch (IllegalAccessException ex) {
			JOptionPane.showMessageDialog(null, "Couldn't access SystemLookAndFeel class.\nUsing MetalLookAndFeel instead.", "LookAndFeel Error!", JOptionPane.ERROR_MESSAGE);
		} catch (InstantiationException ex) {
			JOptionPane.showMessageDialog(null, "Couldn't instantiate SystemLookAndFeel.\nUsing MetalLookAndFeel instead.", "LookAndFeel Error!", JOptionPane.ERROR_MESSAGE);
		} catch (UnsupportedLookAndFeelException ex) {
			JOptionPane.showMessageDialog(null, "SystemLookAndFeel not supported.\nUsing MetalLookAndFeel instead.", "LookAndFeel Error!", JOptionPane.ERROR_MESSAGE);
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
