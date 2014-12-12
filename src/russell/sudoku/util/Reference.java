/*
 * Sudoku Game
 * Russell made this!!
 */

package russell.sudoku.util;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Russell
 */
public class Reference {
	
	public static int[][][][] Array4D = new int[3][3][3][3];
	public static final Random Rand = new Random();
	public static int Difficulty = 24;

	public static final String SolvedDemo[] =
	{
		"497835126631724589528196473759241368816357492342689715914573682263948175857261934",
		"294617583673825194851349726126938745589247316473615298471369852968452731532187964",
		"643179852189265374527384691786395421492816753153742869264538917531947628978216435",
		"594371862813264759672985314628459713341678592597123468185246937426937185739851246",
		"892536174465172983731489625729461385854329716316857942618243957547691238293578164",
		"715394286283561974946278513479162538816357492352894761827651943149738625635429187"
	};

	public static void setSystemLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Can't use SystemLookAndFeel for some reason. Using Metal instead.", "LookAndFeel Exception!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
