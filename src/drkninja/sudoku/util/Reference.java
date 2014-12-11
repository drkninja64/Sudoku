/*
 * Sudoku Game
 * Sajag made this!!
 */

package drkninja.sudoku.util;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Reference {
    public static final String INITIAL_TEXT = " ";
    public static final String BGI_PATH = "/drkninja/sudoku/res/Sudoku.png";
    public static final Font NORMAL_FONT = new Font("Curlz MT", 0, 36);
    public static final Font SELECTED_FONT = new Font("Curlz MT", Font.BOLD, 40);

	public static void setSystemLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Can't use SystemLookAndFeel for some reason. Using Metal instead.", "LookAndFeel Exception!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
