package drkninja.src;

/*
 * Sudoku Game
 * Sajag made this!!
 */



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    public int xpos = 0;
    public int ypos = 0;
    public String Text = "";
    
    public SudoPanel(){
    }
    
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
    public void reset() {
        setText(Text);
        setVisible(true); 
        setFont(new java.awt.Font("Curlz MT", 0, 36));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            x += 56;
            if(i == 3 || i == 6){
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
    
    public static void addPanels(SudoPanel grp[], JPanel board){
        for(int i = 0; i<9; i++){
            try{
                board.add(grp[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(grp[i].xpos, grp[i].ypos, 50, 50));
                grp[i].reset();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(board, "Error when adding panel at " + i);
                System.exit(1);
            }
        }
    }
}
