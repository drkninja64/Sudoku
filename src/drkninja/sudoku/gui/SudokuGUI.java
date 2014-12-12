/*
 * Sudoku Game
 * Sajag made this!!
 */

package drkninja.sudoku.gui;

import drkninja.sudoku.src.SudoPanel;
import static drkninja.sudoku.util.Reference.BGI_PATH;
import static drkninja.sudoku.util.Reference.INITIAL_TEXT;
import static drkninja.sudoku.util.Reference.setSystemLookAndFeel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import russell.sudoku.src.SudoCheck;
import russell.sudoku.src.SudoGen;

/**
 *
 * @author Admin
 */
public class SudokuGUI extends javax.swing.JFrame {

    private static javax.swing.JLabel BGI;
    public static SudoPanel Block[][] = new SudoPanel[9][];
    public static SudoPanel SELECTED_PANEL;
    public static JCheckBox[] HintBox = new JCheckBox[10];
    public static JRadioButton[] SelectedNumber = new JRadioButton[10];
    public static int CLICKED = 0;

    /**
     * Creates new form SudokuGUI
     */
    public SudokuGUI() {
	setSystemLookAndFeel();
        initComponents();    
        setVisible(true);
        init();
        listenEnable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selection = new javax.swing.ButtonGroup();
        SudokuPanel = new javax.swing.JPanel();
        SelectionPanel = new javax.swing.JPanel();
        Choice_None = new javax.swing.JRadioButton();
        Box_1 = new javax.swing.JCheckBox();
        Choice_1 = new javax.swing.JRadioButton();
        Box_2 = new javax.swing.JCheckBox();
        Choice_2 = new javax.swing.JRadioButton();
        Box_3 = new javax.swing.JCheckBox();
        Choice_3 = new javax.swing.JRadioButton();
        Box_4 = new javax.swing.JCheckBox();
        Choice_4 = new javax.swing.JRadioButton();
        Box_5 = new javax.swing.JCheckBox();
        Choice_5 = new javax.swing.JRadioButton();
        Box_6 = new javax.swing.JCheckBox();
        Choice_6 = new javax.swing.JRadioButton();
        Box_7 = new javax.swing.JCheckBox();
        Choice_7 = new javax.swing.JRadioButton();
        Box_8 = new javax.swing.JCheckBox();
        Choice_8 = new javax.swing.JRadioButton();
        Box_9 = new javax.swing.JCheckBox();
        Choice_9 = new javax.swing.JRadioButton();
        Box_None = new javax.swing.JCheckBox();
        CheckBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        SudokuPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        SudokuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Selection.add(Choice_None);
        Choice_None.setText("None");

        Selection.add(Choice_1);
        Choice_1.setText("1");

        Selection.add(Choice_2);
        Choice_2.setText("2");

        Selection.add(Choice_3);
        Choice_3.setText("3");

        Selection.add(Choice_4);
        Choice_4.setText("4");

        Selection.add(Choice_5);
        Choice_5.setText("5");

        Selection.add(Choice_6);
        Choice_6.setText("6");

        Selection.add(Choice_7);
        Choice_7.setText("7");

        Selection.add(Choice_8);
        Choice_8.setText("8");

        Selection.add(Choice_9);
        Choice_9.setText("9");

        javax.swing.GroupLayout SelectionPanelLayout = new javax.swing.GroupLayout(SelectionPanel);
        SelectionPanel.setLayout(SelectionPanelLayout);
        SelectionPanelLayout.setHorizontalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_7))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPanelLayout.createSequentialGroup()
                            .addComponent(Box_8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Choice_8)))
                    .addGroup(SelectionPanelLayout.createSequentialGroup()
                        .addComponent(Box_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choice_9))
                    .addGroup(SelectionPanelLayout.createSequentialGroup()
                        .addComponent(Box_None)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Choice_None))))
        );
        SelectionPanelLayout.setVerticalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_None)
                    .addComponent(Box_None))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_1)
                    .addComponent(Box_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_2)
                    .addComponent(Box_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_3)
                    .addComponent(Box_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_4)
                    .addComponent(Box_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_5)
                    .addComponent(Box_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_6)
                    .addComponent(Box_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_7)
                    .addComponent(Box_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_8)
                    .addComponent(Box_8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Choice_9)
                    .addComponent(Box_9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CheckBN.setText("Check");
        CheckBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBN)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //JOptionPane.showMessageDialog(null, evt.getKeyChar());
        setNumber(evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

    private void CheckBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBNActionPerformed
        String msg;
        setNumber();
        if(SudoCheck.eureka()) msg = "It's CORRECT!!!";
        else msg = "Dang it! wrong!!";
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_CheckBNActionPerformed

    private void init(){
        setLocationRelativeTo(null);
        setupHintBox();
        setupBlocks();
        setupButtons();
        setBGI();
        Choice_None.setSelected(true);
        alphaTest();
        setValues();
        setFocuser(false);
        requestFocus();
    }
    
    /**
     * Setup Blocks of panels
     */
    private void setupBlocks(){
        
        for (int i=0; i<9;i++) 
            Block[i] = new SudoPanel[9];
        
        Block[0] = SudoPanel.setBoxGroup(4, 4, INITIAL_TEXT);
        Block[1] = SudoPanel.setBoxGroup(170, 4, INITIAL_TEXT);
        Block[2] = SudoPanel.setBoxGroup(336, 4, INITIAL_TEXT);
        Block[3] = SudoPanel.setBoxGroup(4, 170, INITIAL_TEXT);
        Block[4] = SudoPanel.setBoxGroup(170, 170, INITIAL_TEXT);
        Block[5] = SudoPanel.setBoxGroup(336, 170, INITIAL_TEXT);
        Block[6] = SudoPanel.setBoxGroup(4, 336, INITIAL_TEXT);
        Block[7] = SudoPanel.setBoxGroup(170, 336, INITIAL_TEXT);
        Block[8] = SudoPanel.setBoxGroup(336, 336, INITIAL_TEXT);
        
        SudoPanel.addPanels();
    }
    
    /**
     * Setup CheckBoxes
     */
    private void setupHintBox(){
        SelectedNumber[0] = Choice_None;
        SelectedNumber[1] = Choice_1;
        SelectedNumber[2] = Choice_2;
        SelectedNumber[3] = Choice_3;
        SelectedNumber[4] = Choice_4;
        SelectedNumber[5] = Choice_5;
        SelectedNumber[6] = Choice_6;
        SelectedNumber[7] = Choice_7;
        SelectedNumber[8] = Choice_8;
        SelectedNumber[9] = Choice_9;
    }
    
    /**
     * Setup RadioButtons
     */
    private void setupButtons(){
        HintBox[0] = Box_None;
        HintBox[1] = Box_1;
        HintBox[2] = Box_2;
        HintBox[3] = Box_3;
        HintBox[4] = Box_4;
        HintBox[5] = Box_5;
        HintBox[6] = Box_6;
        HintBox[7] = Box_7;
        HintBox[8] = Box_8;
        HintBox[9] = Box_9;
    }
    
    /**
     * Sets the BGI Sudoku Board
     */
    private void setBGI(){
        BGI = new javax.swing.JLabel();
        BGI.setIcon(new javax.swing.ImageIcon(getClass().getResource(BGI_PATH))); // NOI18N
        SudokuPanel.add(BGI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }
    
    /**
     * Makes SudoPanels clickable!
     */
    private void clickListener(){
        int i, j;
        for(i = 0; i<9; i++){
            for(j = 0; j<9; j++){
                Block[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent me) {
                        clickedPanel((SudoPanel) me.getSource());
                    }
                });
            }
        }
    }
    
    public void clickedPanel(SudoPanel sp){
        if(sp.isFixed()) return;
        saveHints();
        SELECTED_PANEL.deselect();
        SELECTED_PANEL = sp;
        SELECTED_PANEL.select();
        setValues();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox Box_1;
    private static javax.swing.JCheckBox Box_2;
    private static javax.swing.JCheckBox Box_3;
    private static javax.swing.JCheckBox Box_4;
    private static javax.swing.JCheckBox Box_5;
    private static javax.swing.JCheckBox Box_6;
    private static javax.swing.JCheckBox Box_7;
    private static javax.swing.JCheckBox Box_8;
    private static javax.swing.JCheckBox Box_9;
    private static javax.swing.JCheckBox Box_None;
    private javax.swing.JButton CheckBN;
    private static javax.swing.JRadioButton Choice_1;
    private static javax.swing.JRadioButton Choice_2;
    private static javax.swing.JRadioButton Choice_3;
    private static javax.swing.JRadioButton Choice_4;
    private static javax.swing.JRadioButton Choice_5;
    private static javax.swing.JRadioButton Choice_6;
    private static javax.swing.JRadioButton Choice_7;
    private static javax.swing.JRadioButton Choice_8;
    private static javax.swing.JRadioButton Choice_9;
    private static javax.swing.JRadioButton Choice_None;
    private javax.swing.ButtonGroup Selection;
    private javax.swing.JPanel SelectionPanel;
    public static javax.swing.JPanel SudokuPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * Preset values for testing
     */
    private void alphaTest() {
        SELECTED_PANEL = Block[0][0];
        SELECTED_PANEL.select();
        //Block[3][5].fix(9);
	SudoGen.demo();
    }

    /**
     * Sets values according to selected panel
     */
    private void setValues() {
        SelectedNumber[SELECTED_PANEL.ACTUAL_VALUE].setSelected(true);
        for(int i = 0; i<10; i++){
            HintBox[i].setSelected(SELECTED_PANEL.SELECTED_VALUES[i]);
        }
    }

    /**
     * Sets focus according to selected panel
     */
    private void setFocuser(boolean x) {
        for(int i = 0; i<10; i++){
            HintBox[i].setFocusable(x);
            SelectedNumber[i].setFocusable(x);
        }
    }
    
    /**
     * Saves hints once clicked away
     */
    private void saveHints(){
        for(int i = 0; i<10; i++){
            SELECTED_PANEL.SELECTED_VALUES[i] = HintBox[i].isSelected();
        }
    }
    
    /**
     * sets hint boxes according to clicked
     * @param HB Clicked Box
     */
    public void setHintBox(JCheckBox HB){
        int i, j, sel;
        
        for(sel=0; sel<10; sel++){
            if(HB.equals(HintBox[sel])) break;
        }
        
        if(sel == 0){
            HintBox[0].setSelected(true);
            for(j=1; j<10; j++) HintBox[j].setSelected(false);
        }
        else{
            HintBox[0].setSelected(false);
            //SelectedNumber[sel].setSelected(true);
            if(HintBox[sel].isSelected()) setNumber((char)(48+sel));
        }
        
        // If all hints deselected, None is autoselected
        for(i=1; i<10; i++){
            if(HintBox[i].isSelected()) break;
        }
        if (i == 10) {
            HintBox[0].setSelected(true);
        }
    }
    
    /**
     * Checks if hints are clicked
     */
    private void hintListener() {
        for(int i=0; i<10; i++){
            HintBox[i].addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {                    
                    setHintBox((JCheckBox)evt.getSource());
                }
            });
        }
    }

    /**
     * Checks if selected
     */
    private void selectListener() {
        for(int i=0; i<10; i++){
            SelectedNumber[i].addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {                    
                    setNumber();
                }
            });
        }
    }
    
    /**
     * Saves number
     */
    public void setNumber(){
        int i, j;
        for(i=0; i<10; i++){
            if(SelectedNumber[i].isSelected()){
                SELECTED_PANEL.setNumber(i);
                break;
            }
        }

    }

    private void listenEnable() {
        clickListener();
        hintListener();
        selectListener();
    }

    public void setNumber(char keyChar) {
        int value = keyChar - '0';
        if (value >= 0 && value <= 9){
            SELECTED_PANEL.setNumber(value);
            SelectedNumber[value].setSelected(true);
        }
    }

}
