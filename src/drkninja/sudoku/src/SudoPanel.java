package drkninja.sudoku.src;

/*
 * Sudoku Game
 * Sajag made this!!
 */



import drkninja.sudoku.gui.SudokuGUI;
import static drkninja.sudoku.util.Reference.NORMAL_FONT;
import static drkninja.sudoku.util.Reference.SELECTED_FONT;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SudoPanel extends JLabel {
    
    public int ACTUAL_VALUE;
    public int SELECTED_VALUES[];
    /**
     * Status of the panel
     * 0 - Empty
     * 1 - Fixed
     * 2 - Set
     * 3 - Hinted (Checked)
     */
    public int STATUS;
    public Color PANEL_COLOR;
    public int xpos = 0;
    public int ypos = 0;
    public String Text = " ";
    
    public SudoPanel(){}
    
    public SudoPanel(String text, int x, int y){
        Text = text;
        xpos = x;
        ypos = y;
    }
    
    public SudoPanel(int x, int y){
        xpos = x;
        ypos = y;
    }

    /**
     * Resets Sudoku Panel
     */
    public void init() {
        setText(Text);
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);        
        setVisible(true);
        setColor();
        deselect();
    }
    
    /**
     * Checks if the panel is fixed
     * @return true if fixed
     */
    public boolean isFixed(){
        return STATUS == 1;
    }
    
    public void select(){
        setFont(SELECTED_FONT);
        setForeground(Color.magenta);
    }
    
    public void deselect(){
        setFont(NORMAL_FONT);
        setForeground(PANEL_COLOR);
    }
    
    /**
     * Sets the group of sudoku panels
     * @param grp Array of slots in a box
     * @param x starting x-position
     * @param y starting y-position
     * @param text Initial text
     */
    public static SudoPanel[] setBoxGroup(int x, int y, String text){
        int i = 0, tx = x;
        SudoPanel grp[] = new SudoPanel[9];
        while (i < 9){
            grp[i] = new SudoPanel(text, x, y);
            grp[i].init();
            x += 56;
            if(i == 2 || i == 5){
                x = tx;
                y += 56;
            }
            i++;
        }
        return grp;
    }
    
    /**
     * Sets the group of sudoku panels
     * @param grp Array of slots in a box
     * @param x starting x-position
     * @param y starting y-position
     */
    public static SudoPanel[] setBoxGroup(int x, int y){
        return setBoxGroup(x, y, "");
    }
    
    public static void addPanels(){
        int i, j;
        for(i = 0; i<9; i++){
            for(j = 0; j<9; j++){
                try{
                    SudokuGUI.SudokuPanel.add(SudokuGUI.Block[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(SudokuGUI.Block[i][j].xpos, SudokuGUI.Block[i][j].ypos, 50, 50));
                    SudokuGUI.Block[i][j].init();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error when adding panel at " + i);
                    System.exit(1);
                }
            }
        }
    }

    /**
     * Sets color according to status
     */
    private void setColor() {
        switch(STATUS){
            case 1:
                PANEL_COLOR = Color.blue;
                break;
            case 3:
                PANEL_COLOR = Color.gray;
                break;
            default:
                PANEL_COLOR = Color.black;
        }
    }

    /**
     * Fixes this panel
     */
    public void fix() {
        STATUS = 1;
        setColor();
        deselect();
    }
    
    
    
}
