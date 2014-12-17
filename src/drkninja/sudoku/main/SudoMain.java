/*
 * Sudoku Game
 * Sajag made this!!
 */

package drkninja.sudoku.main;

import drkninja.sudoku.gui.MainMenu;
import drkninja.sudoku.gui.SetDifficulty;
import russell.sudoku.util.Utility;
/**
 *
 * @author Admin
 */
public class SudoMain {
    public static javax.swing.JFrame MainGUI;
    
    public static void main(String args[]){
	Utility.setSystemLookAndFeel();
	MainGUI = new MainMenu();
    }
}
