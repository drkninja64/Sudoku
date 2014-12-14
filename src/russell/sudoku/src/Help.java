/*
 * Sudoku Game
 * Sajag made this!!
 */

package russell.sudoku.src;

import javax.swing.JOptionPane;

/**
 *
 * @author Russell
 */
public class Help {

	public static void rules() {
		String Title = "How to Sudoku?";
		String Message[] = {
			"Enter the numbers from 1 to 9 in such a way that no row, column",
			"or 3x3 box contains the same number more than once.",
			" ",
			"For your convenience, check boxes and radio buttons are provided",
			"at the right hand side of the puzzle. The radio buttons (the round",
			"ones) indicate the current number being displayed in the cell. The",
			"check boxes indicate the number you think might fit in the current",
			"cell. If you're sure of the number in the cell, None is checked. If",
			"the current cell is empty, both the check box and the radio button",
			"is marked at None.",
			" ",
			"The blue cells are fixed and cannot be changed. A pink zero appears",
			"in a selected empty cell. If the cell is not empty, the number in",
			"the cell is displayed in pink. Cells you've filled are displayed in",
			"black, and those you're not sure of are in orange. Once you fill up",
			"all the cells, you can press Ctrl+Enter to see if your solution is",
			"correct.",
			" ",
			"P.S. This game's difficulty setting corresponds to the number of",
			"fixed cells given. Actual difficulty varies from person to person.",
			"Also, try Freestyle to create and solve your own puzzle :)"
		};
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.QUESTION_MESSAGE);
	}

	public static void about() {
		String Title = "Sudoku v1.0.2";
		String Message[] = {
			"WARNING: This program is brought to you by",
			"> Sajag Acharya",
			"> Russell Subedi",
			" ",
			"> a.k.a Tuber Awesome?"
		};
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.WARNING_MESSAGE);
	}
}
