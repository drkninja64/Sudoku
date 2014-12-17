/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.src;

import drkninja.sudoku.util.ReferenceD;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author Russell
 */
public class Help {

	public static void rules(Component Caller) {
		String Title = "How to Sudoku?";
		String Message[] = {
			"Enter the numbers from 1 to 9 in such a way that no row, column",
			"or 3x3 box contains the same number more than once.",
			" ",
			"For your convenience, check boxes and radio buttons are provided",
			"at the right hand side of the puzzle. The radio buttons (round ones)",
			"indicate the current number being displayed in the cell. The check",
			"boxes indicate the number you think might fit in the current cell.",
			"If you're sure of the number in the cell, None is checked. If the",
			"current cell is empty, both the check box and the radio button is",
			"marked at None.",
			" ",
			"The blue cells are fixed and cannot be changed. A pink zero appears",
			"in a selected empty cell. If the cell is not empty, the number in the",
			"cell is displayed in pink. Cells you've filled are displayed in black,",
			"and those you're not sure of are in orange. Once you're done, click",
			"the Check button or press Ctrl+Enter to see if your solution is",
			"correct.",
			" ",
			"P.S. This game's difficulty setting corresponds to the number of",
			"fixed cells given. Actual difficulty varies from person to person.",
			"Also, try Freestyle to create and solve your own puzzle :)",
			" ",
			"(Pardon the alignment)"
		};
		JOptionPane.showMessageDialog(Caller, Message, Title, JOptionPane.QUESTION_MESSAGE);
	}

	public static void about(Component Caller) {
		String Title = "Sudoku " + ReferenceD.VERSION;
		Font JOPFont = new JOptionPane().getFont();
		String Message =
			"<html><body style=\"font-family:" + JOPFont.getFamily() + ";font-size:" + JOPFont.getSize() + "pt;\"/>" +
			"WARNING !!<br/>" +
			"This program is brought to you by Tuber Awesome.<br/><br/>" +
			"Tuber Awesome includes:<br/>" +
			"> Sajag Acharya<br/>" +
			"> Russell Subedi<br/><br/>" +
			"Send us feedback at " + ReferenceD.LINK_EM + "<br/>" +
			"Visit " + ReferenceD.LINK_FB + "." +
			"</body></html>"
		;

		JEditorPane Potato = new JEditorPane("text/html", Message + ReferenceD.LINK_FB);
		Potato.setEditable(false);
		Potato.setBackground(new JLabel().getBackground());
		Potato.setSelectionColor(Potato.getBackground());
		Potato.setSelectedTextColor(Potato.getCaretColor());

		Potato.addHyperlinkListener(new HyperlinkListener() {
			@Override
			public void hyperlinkUpdate(HyperlinkEvent he) {
				if (he.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED)) {
					String URL = he.getURL().toString();
					try {
						Desktop.getDesktop().browse(new URI(URL));
					} catch (IOException | URISyntaxException ex) {
						JOptionPane.showMessageDialog(null, "Couldn't open the browser. Please go to " + URL + " manually.", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		JOptionPane.showMessageDialog(Caller, Potato, Title, JOptionPane.WARNING_MESSAGE);
	}
}
